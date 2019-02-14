package com.vehicles.project.fase2;

import java.util.*;

public class CarMain {

	static Scanner entrada=new Scanner(System.in);
	


	public static void main(String[] args) throws Exception {
		
	
		//Array per les rodes que introdueix l'usuari
		List<Wheel> listWheelRearCar = new ArrayList<>();
		List<Wheel> listWheelFrontCar = new ArrayList<>();
		//Introducció de dades cotxe
		Car myCar=introDataCar();
		
		initRearWheels(listWheelRearCar);
		initFrontWheels(listWheelFrontCar);
		
		
		
		//Afegim rodes al cotxe
		myCar.addWheels(listWheelFrontCar, listWheelRearCar);


		//Mostrem informació
		System.out.println("Matricula: "+myCar.getPlate()+
				" Marca: "+ myCar.getBrand()+
				" Color: "+ myCar.getColor()+" Rodes: "+myCar.getWheels().toString());

		
	}

	public static Car introDataCar() {


		String plate = "";

		//llamar a la función de comprobación
		do {
			System.out.println("Matrícula vehicle (4 números i 2/3 lletres): ");
			plate = entrada.next();	
		}while (!comprobarMatricula(plate));
		
		
		System.out.println("Marca del vehicle: ");
		String brand = entrada.next();
		
		System.out.println("Color: ");  
		String color = entrada.next();
		
		return new Car(plate,brand,color);

	}
	
	
	static boolean comprobarMatricula (String matricula){

	    if (matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{2,3}$")) {
	        System.out.println("Valid plate");
	        return true;

	    }else{

	        System.out.println("Invalid plate. Should be 4 numbers and 2/3 letters.");
	        return false;
	    }      
	}


	public static Wheel introWheels() {
		
		
		System.out.println("Marca: ");
		String wheelBrand=entrada.next();
		
		String wheelDiameter="";
		//llamar a la función de comprobación
				do {
					System.out.println("Diametre (0.41-3.99): ");
					wheelDiameter = entrada.next();	
				}while (!checkDiameter(Double.parseDouble(wheelDiameter)));

		return new Wheel (wheelBrand,Double.parseDouble(wheelDiameter)); 
	
		
	}
	
	static boolean checkDiameter (Double diameter){

	    if (diameter>0.4 && diameter <4) {
	        return true;

	    }else{

	        System.out.println("Wrong diameter!!. Should be between 0.41 and 3.99");
	        return false;
	    }      
	}
	public static void initRearWheels(List<Wheel> listWheelRearCar) {
		//Intro dades Rear Wheels
		System.out.println("Introduïm característiques rodes POSTERIORS ");
				
		Wheel myWheelR1=introWheels();
		listWheelRearCar.add(myWheelR1);
		Wheel myWheelR2=introWheels();
		listWheelRearCar.add(myWheelR2);
	}
	
	public static void initFrontWheels(List<Wheel> listWheelFrontCar) {
		//Intro dades Front Wheels
		System.out.println("Introduïm característiques rodes DAVANTERES ");
		
		Wheel myWheelF1=introWheels();
		listWheelFrontCar.add(myWheelF1);
		Wheel myWheelF2=introWheels();
		listWheelFrontCar.add(myWheelF2);
	}

	


}
