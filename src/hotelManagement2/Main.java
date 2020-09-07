package hotelManagement2;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Guest guest = new Guest("Vlada", "Zivkovic");
		GuestAttendance bla = new GuestAttendance(LocalDate.parse("2020-09-04"), LocalDate.parse("2020-09-08"), guest, 500);
		GuestAttendance Mcconel = new GuestAttendance(LocalDate.parse("2020-09-02"), LocalDate.parse("2020-09-04"), guest, 200);
		Guest bob = new Guest("Bob", "Connor");
		Employee employee = new Employee("Vlada", "Zivkovic", 500);
		Employee john = new Employee("John", "Mcconel ", 350);
		Apartments apartment = new Apartments(5, 3000, "Small Apartment");
		guest.ChooseApartment();
		
		
        
		List<GuestAttendance> reservationList = new ArrayList<>();
		reservationList.add(bla);
		reservationList.add(Mcconel);
		bla.checkForReservation(LocalDate.parse("2020-09-05"));
		Mcconel.checkForReservation(LocalDate.parse("2020-09-05"));
		
		List<Employee> employeeList = new ArrayList<>();
		List<Guest> guestList = new ArrayList<>();
		
		
		
		
		
		Hotel hotel = new Hotel("GH", 10, employeeList, guestList, reservationList);
		

}
}
