package com.vehicles.project.fase1;

import java.util.*;

public class CarMain {

	

	public static void main(String[] args) throws Exception {
		
		//Introducció de dades
		Scanner entrada=new Scanner(System.in);

		System.out.println("Matrícula: ");
		String plate = entrada.next();
		
		System.out.println("Marca del vehicle: ");
		String brand = entrada.next();
		System.out.println("Color: ");
		String color = entrada.next();
		
		Car myCar= new Car(plate,brand,color);
		
		//Rodes Traseres
		
		List<Wheel> listWheelRearCar = new ArrayList<>();
		List<Wheel> listWheelFrontCar = new ArrayList<>();

		System.out.println("Marca roda esquerra trasera: ");
		
		String wheelBrand=entrada.next();
		
		System.out.println("Diametre roda esquerra trasera: ");

		String wheelDiameter=entrada.next();
		
		Wheel myWheel= new Wheel (wheelBrand,Double.parseDouble(wheelDiameter));
		
		listWheelRearCar.add(myWheel);
		
		System.out.println("Marca roda dreta trasera: ");
		
		wheelBrand=entrada.next();
		
		System.out.println("Diametre roda dreta trasera: ");

		wheelDiameter=entrada.next();
		
		myWheel= new Wheel (wheelBrand,Double.parseDouble(wheelDiameter));
		
		listWheelRearCar.add(myWheel);
		
		//Rodes Davanteres
		
		System.out.println("Marca roda esquerra davantera: ");
		
		wheelBrand=entrada.next();
		
		System.out.println("Diametre roda esquerra davantera: ");

		wheelDiameter=entrada.next();
		
		myWheel= new Wheel (wheelBrand,Double.parseDouble(wheelDiameter));
		
		listWheelFrontCar.add(myWheel);
		
		System.out.println("Marca roda dreta davanterea: ");
		
		wheelBrand=entrada.next();
		
		System.out.println("Diametre roda dreta davantera: ");

		wheelDiameter=entrada.next();
		
		myWheel= new Wheel (wheelBrand,Double.parseDouble(wheelDiameter));
		
		listWheelFrontCar.add(myWheel);
	
		
		myCar.addWheels(listWheelFrontCar, listWheelRearCar);
		
		
		
	
	

		
		System.out.println("Matricula: "+myCar.getPlate()+
				" Marca: "+ myCar.getBrand()+
				" Color: "+ myCar.getColor()+" Rodes: "+myCar.getWheels().toString());
		
	}


}
