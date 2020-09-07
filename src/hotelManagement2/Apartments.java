package hotelManagement2;

import java.sql.Date;

public class Apartments {
	private double apartmentPrice;
	private String[] apartmentType = {"Small Apartment", "Standard Apartment", "Luxury Apartment"};
	private int apartmentNumber;
	private int numberOfApartments = 10;
	private double monthlyBills;
	private boolean apartmentAvailable;
	private boolean bussyApartment;
	
	

	public Apartments(int apartmentNumber, double monthlyBills, String firstName) {
		this.apartmentNumber = apartmentNumber;
		this.monthlyBills = monthlyBills;
	}
	
	public boolean isBussyApartment() {
		return bussyApartment;
	}

	public int getNumberOfApartments() {
		return numberOfApartments;
	}

	public void setNumberOfApartments(int numberOfApartments) {
		this.numberOfApartments = numberOfApartments;
	}

	public double getApartmentPrice() {
		return apartmentPrice;
	}

	public void setApartmentPrice(double apartmentPrice) {
		this.apartmentPrice = apartmentPrice;
	}

	public void apartmentPrice(double apartmentPrice) {
		this.apartmentPrice = apartmentPrice;
	}

	public String[] getApartmentType() {
		return apartmentType;
	}

	public void setApartmentType(String[] apartmentType) {
		this.apartmentType = apartmentType;
	}

	public int getApartmentNumber() {
		return apartmentNumber;
	}

	public void setApartmentNumber(int apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

	public double getMonthlyBills() {
		return monthlyBills;
	}

	public void setMonthlyBills(double monthlyBills) {
		this.monthlyBills = monthlyBills;
	}
	
	public boolean apartmentsAvailable() {

		if (numberOfApartments > 0) {
			System.out.println("We have apartment avaliable");
			numberOfApartments--;
			System.out.println("We have " + numberOfApartments + " apartments left");
			return apartmentAvailable = true;

		} else {
			System.out.println("Sorry we dont have apartments available");
			return apartmentAvailable = false;
		}

	}

}
