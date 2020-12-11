package appointment;

public class Monthly extends Appointment{
	
	public Monthly(String description, int month, int day, int year) {
		super(description, month, day, year);
	}
	
	public boolean occurs(int month,int day, int year) {
		return super.occurs(month, day, year) && getDay() == day;
	}
	
	public String toString() {
		return " Monthly Appointment: " + super.toString();
	}
}
