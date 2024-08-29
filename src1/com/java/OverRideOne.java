package com.java;

class Vehicles{
void Bike() {
	System.out.println("Bike riding is joyful");
}
 void Car(){
	System.out.println("Long drive everyone dream");
}
 void Bicycle(){
	System.out.println("To lose the fat");
	
}
}

class TransPort extends Vehicles{
	void Bike() {
		System.out.println("to reach quickly");
		
	}
	
	//@Override
	void Car() {
		System.out.println("safely reached");
	}
   @Override
	final void Bicycle() {
		System.out.println("to reach with out pay");
	}
	
	
	void Bus() {
		System.out.println("Safest journey");
	}
}
public class OverRideOne {
public static void main(String[] args) {
	
	TransPort transport = new TransPort();
	transport.Bicycle();
	transport.Car();
	transport.Bike();
	transport.Bus();
}
	
}
