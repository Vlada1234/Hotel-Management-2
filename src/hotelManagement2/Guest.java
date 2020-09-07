package hotelManagement2;

import java.util.Scanner;

public class Guest {
	
	private String firstName;
	private String lastName;
	private int choice;
	private Apartments apartments = new Apartments(choice, choice, firstName);

	public Guest(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

	}
	
	public String getFirstName() {
		return firstName;
	}



	public String getLastName() {
		return lastName;
	}

	

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	public void ChooseApartment() {
		do {
			System.out.print("Choose your apartment: " + "\n");
			Scanner sc = new Scanner(System.in);
			System.out.println("1. Small Apartment");
			System.out.println("2. Standard Apartment");
			System.out.println("3. Luxury Apartment");
			choice = sc.nextInt();

			if (choice == 1 && apartments.apartmentsAvailable() == true) {
                apartments.setApartmentPrice(50);
				System.out.println("Your choice is: Small Apartment, and price per night is: " + apartments.getApartmentPrice());
				break;
			} else if (choice == 2 && apartments.apartmentsAvailable() == true) {
				apartments.setApartmentPrice(100);
				System.out.println("Your choice is: Standard Apartment, and price per night is: "+ apartments.getApartmentPrice());
				break;
			} else if (choice == 3 && apartments.apartmentsAvailable() == true) {
				apartments.apartmentPrice(200);
				System.out.println("Your choice is: Luxury Apartment, and price per night is: " + apartments.getApartmentPrice());
				break;
			} else {
				System.out.println("Invalid Choice!");
			}
		} while (1 != 0);
	}

}
