package appointment;

import java.util.Scanner;

public class ApptBook {
	
	int y, m , d , ctr ;
	Scanner scan;
	Appointment appointments[];
	
	public ApptBook() {
		
		y = 0;
		m= 0;
		d= 0;
		ctr = 0;
		
		appointments = new Appointment[20];
		scan = new Scanner(System.in);
	}
	
	public boolean isValidMonth(int m) {
		if(m < 1 || m > 12)
			return false;
		else return true;
	}
	
	public boolean isLeapYear(int y) {
		if(y%400 == 0)
			return true;
		else if(y%4 == 0)
			return true;
		else
			return false;
	}
	
	public boolean isValidDate(int m, int d, int y) {
		if(d<1)
			return false;
		if(m == 2) {
			if(isLeapYear(y))
				if(d>29)
					return false;
				else
					if(d>28)
						return false;
			
		}
		
		else if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
			if(d>31)
				return false;
			else 
				if(d>30)
					return false;
		return true;
	}
	
	public void readDate() {
		
		while(true) {
			System.out.print("Enter Month: ");
			m = scan.nextInt();
			if(isValidMonth(m))
				break;
		}
		while(true) {
			System.out.print("\nEnter Date: ");
			d = scan.nextInt();
			if(isValidDate(m, d, y))
				break;
		}
			System.out.print("\nEnter Year: ");
			
			y = scan.nextInt();
			
			
		
	}
	
	public void process() {
		
		appointments[ctr++] = new Monthly("Booked Appointment", 12, 20, 2020);
		appointments[ctr++] = new OneTime("Doctors check up", 12, 22, 2020);
		appointments[ctr++] = new Daily("Booked Appointment", 12, 17, 2020);
		appointments[ctr++] = new Monthly("Booked Appointment", 11, 15, 2020);
		appointments[ctr++] = new OneTime("Booked appointment", 12, 5, 2020);
		
		while(true) {
			String desc;
			int choice = 0, type = 0;
			
			System.out.println("\n1. Check for repair appointments\n2. Make a repair appointment\n3. Exit\nEnter your choice: ");
			
			choice =scan.nextInt();
			
			if(choice == 1) {
				readDate();
				System.out.println("\nThe appointment that occurs on " + y + "/" + d + "/" + m +" are...");
				for(Appointment app: appointments)
					if(app != null && app.occurs(m, d, y))
						System.out.println(app);
			}
			
			else if(choice == 2) {
				System.out.print("\nEnter description for appointment(Press q to quit): ");
				
				scan.nextLine();
				
				desc = scan.nextLine();
				
				if(desc.equals("q"))
					
					break;
				
				readDate();
					
					while(type < 1 || type > 3) {
						System.out.print("\n1. One time\n2. Daily\n3. Monthly\n Select an appointment: ");
						type = scan.nextInt();
				}
				
				if(type == 1)
					appointments[ctr++] = new OneTime(desc, y, m, d);
				else if(type == 2)
					appointments[ctr++] = new Daily(desc, y, m, d);
				else
					appointments[ctr++] = new Monthly(desc, y, m, d);
			}
			
			else if(choice == 3) {
				System.out.println("Thank you! ");
				System.exit(0);
			}
			
			else
				System.out.println("Wrong choice, please choose a correct one...");
			
		}
	}
}