package hotelManagement2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class GuestAttendance {

	private Guest guest;
	private double price;
	private LocalDate fromDate;
	private LocalDate toDate;
	

	private List<GuestAttendance> reservations;

	GuestAttendance(LocalDate fromDate, LocalDate toDate, Guest guest, double price) {
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.guest = guest;
		this.price = price;

	}

	

	public double getPrice() {
		return price;
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public Guest getGuest() {
		return guest;
	}

	public String toString() {
		return "from: " + fromDate + " to: " + toDate + " price is: " + price;
	}

	public boolean checkForReservation(LocalDate yourDate) {
		if ((yourDate.isAfter(fromDate)) && (yourDate.isBefore(toDate))) {
			System.out.println("Your reservation is inside these two dates.");
			return true;
		}

		else {
			System.out.println("Your reservation is expired");
			return false;
		}

	}
	
	

}
	

