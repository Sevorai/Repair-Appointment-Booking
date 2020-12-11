package appointment;

public class Daily extends Appointment{
	
	public Daily(String description, int month, int day, int year) {
		super(description, month, day, year);
	}
	
	public boolean occurs(int month, int day, int year) {
		return super.occurs(month, day, year);
	}
	
	public String toString() {
		return "Daily Appointment: " + super.toString();	}
}
