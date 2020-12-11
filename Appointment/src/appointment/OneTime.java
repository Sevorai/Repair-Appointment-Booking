package appointment;

public class OneTime extends Appointment {
	
	public OneTime(String description, int month, int day, int year) {
		super(description, month, day, year);
	}
	
	 public boolean occurs(int month, int day, int year) {
	       return super.occurs( month, day, year) && getMonth() == month && getDay() == day;
	}
	
	public String toString() {
		return "One time Appointment: " + super.toString();
	}
}
