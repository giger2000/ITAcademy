package com.vehicles.project.fase1;

import java.util.*;

public class CarMain {

	static Scanner entrada=new Scanner(System.in);
	


	public static void main(String[] args) throws Exception {
		
	
		//Array per les rodes que introdueix l'usuari
		List<Wheel> listWheelRearCar = new ArrayList<>();
		List<Wheel> listWheelFrontCar = new ArrayList<>();
		//Introducció de dades cotxe
		Car myCar=introDataCar();
		//Intro dades Rear Wheels
		Wheel myWheelRL=introRearLeftWheels();
		listWheelRearCar.add(myWheelRL);
		Wheel myWheelRR=introRearRightWheels();
		listWheelRearCar.add(myWheelRR);
		
		//Intro dades Front Wheels
		Wheel myWheelFL=introFrontLeftWheels();
		listWheelFrontCar.add(myWheelFL);
		Wheel myWheelFR=introFrontRightWheels();
		listWheelFrontCar.add(myWheelFR);
		
		//Afegim rodes al cotxe
		myCar.addWheels(listWheelFrontCar, listWheelRearCar);


		//Mostrem informació
		System.out.println("Matricula: "+myCar.getPlate()+
				" Marca: "+ myCar.getBrand()+
				" Color: "+ myCar.getColor()+" Rodes: "+myCar.getWheels().toString());

		
	}

	public static Car introDataCar() {
		

		System.out.println("Matrícula: ");
		String plate = entrada.next();
		
		System.out.println("Marca del vehicle: ");
		String brand = entrada.next();
		System.out.println("Color: ");  
		String color = entrada.next();
		
		return new Car(plate,brand,color);
		
		
		
	}
	
	public static Wheel introRearLeftWheels() {
		
		
		System.out.println("Marca roda esquerra trasera: ");
		
		String wheelBrand=entrada.next();
		
		System.out.println("Diametre roda esquerra trasera: ");

		String wheelDiameter=entrada.next();
		
		return new Wheel (wheelBrand,Double.parseDouble(wheelDiameter)); 
	
		
	}
	
public static Wheel introRearRightWheels() {
		
		
		System.out.println("Marca roda dreta trasera: ");
		
		String wheelBrand=entrada.next();
		
		System.out.println("Diametre roda dreta trasera: ");

		String wheelDiameter=entrada.next();
		
		return new Wheel (wheelBrand,Double.parseDouble(wheelDiameter)); 
	
		
	}
	public static Wheel introFrontLeftWheels() {
		
		
		System.out.println("Marca roda esquerra davantera: ");
		
		String wheelBrand=entrada.next();
		
		System.out.println("Diametre roda esquerra davantera: ");

		String wheelDiameter=entrada.next();
		
		return new Wheel (wheelBrand,Double.parseDouble(wheelDiameter));
					
		
	}
	
public static Wheel introFrontRightWheels() {
		
		
		System.out.println("Marca roda dreta davantera: ");
		
		String wheelBrand=entrada.next();
		
		System.out.println("Diametre roda dreta davantera: ");

		String wheelDiameter=entrada.next();
		
		return new Wheel (wheelBrand,Double.parseDouble(wheelDiameter));
					
		
	}





}
