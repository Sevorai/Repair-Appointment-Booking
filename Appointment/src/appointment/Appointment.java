package appointment;

public class Appointment {
	
	private String description;

	   private int year;

	   private int month;

	   private int day;

	  

	   public Appointment(String description, int month, int day, int year) {

	       this.description = description;

	       this.year = year;

	       this.month = month;

	       this.day = day;
	       
	   }
	   
	   
	   public int getYear() {
		   return year;
	   }
	   
	   public int getMonth() {
		   return month;
	   }
	   
	   public int getDay() {
		   return day;
	   }
	   
	   public String getDescription() {
		   return description;
	   }
	   
	   public void setDescription(String desc) {
		   this.description = desc;
	   }
	   
	   public String getDate() {
		   return month + "/" + day + "/" + year;
	   }
	   
	   public boolean occurs(int month, int day, int year) {
		   return this.year >= year;
	   }
	   public String toString() {
		   return getDate() + " - " + description;
	   }
}
