package hotelManagement2;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private String hotelName;
	private int numberOfApartments;
	private List<Employee> employees;
	private List<Guest> guests;
	private List<GuestAttendance> reservations;

	Hotel(String hotelName, int numberOfApartments, List<Employee> employee, List<Guest> guests, List<GuestAttendance> reservations) {
		this.hotelName = hotelName;
		this.numberOfApartments = numberOfApartments;
		this.employees = employee;
	}

	public int getNumberOfApartments() {
		return numberOfApartments;
	}

	public void setNumberOfApartments(int numberOfApartments) {
		this.numberOfApartments = numberOfApartments;
	}

	public List<Employee> getEmployee() {
		return employees;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee); 
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	public List<Guest> getGuests() {
		return guests;
	}

	public void setGuests(List<Guest> guests) {
		this.guests = guests;
	}
	
	

}
