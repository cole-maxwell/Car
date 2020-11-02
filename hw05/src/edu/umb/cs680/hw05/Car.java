package edu.umb.cs680.hw05;


public class Car
{
	private String make;
	private String model;
	private int mileage;
	private int year;
	private float price;
	
	private Car(String make, String model, int mileage, int year, float price)	{
		
		this.make = make;
		this.model = model;
		this.mileage = mileage;
		this.year = year;
		this.price = price;
	}
	
	public static Car createCar(String make, String model, int mileage, int year, float price)	{
		return new Car(make, model, mileage, year, price);
	}
	
	public String getMake()	{
		return this.make;
	}
	
	public String getModel()	{
		return this.model;
	}
	
	public int getMileage()	{
		return this.mileage;
	}
	
	public int getYear()	{
		return this.year;
	}
	
	public float getPrice()	{
		return this.price;
	}
	
	public static void main(String[] args)
	{
		Car testCar = Car.createCar("Mazda", "Miata", 2000, 2009, 800000);
		System.out.println(testCar.make);
		System.out.println(testCar.model);
		System.out.println(testCar.mileage);
		System.out.println(testCar.year);
		System.out.println(testCar.price);
	}
}

