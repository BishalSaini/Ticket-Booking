

import java.util.Scanner;

public class BoxOffice { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		Theatre theatre= new Theatre("PVR",500); 
		boolean flag=true; 
		while(flag) { 
			System.out.println("1.Show Seat availability"); 
			System.out.println("2.Book Ticket"); 
			System.out.println("3.To Check Ticket Details"); 
			System.out.println("4.Cancel Ticket"); 
			System.out.println("5.EXIT"); 
			
			int n=sc.nextInt(); 
			switch(n) { 
			case 1:{ 
				int number_of_seats=theatre.getNo_of_seats(); 
				System.out.println(number_of_seats+"Seats are available"); 
			}
			break; 
			case 2:{ 
				System.out.println("Enter Movie name"); 
			    String name=sc.next(); 
			    System.out.println("Enter the Number of seats"); 
			    int num=sc.nextInt(); 
			    theatre.setTicket(new Ticket(name,num)); 
			    int res=theatre.bookTicket(); 
			    System.out.println("Successfully Bookes"+res+"Tickest"); 
			    } 
			break; 
			case 3:{ 
				System.out.println("Ticket Details"); 
				Ticket t=theatre.getTicket();  
				System.out.println(t.getMovie_name());
				System.out.println(t.getNo_of_tickets());
			}break; 
			case 4:{ 
				System.out.println("Enter the number of tickets to be cancelled"); 
				int cancel=sc.nextInt(); 
				theatre.cancelTicket(cancel);
			}break; 
			case 5:{ 
				System.out.println("Thank You"); 
				flag=false;
			}break; 
			default:{ 
				System.out.println("Wrong Input");
			} 
			break;
		}
	}	
} 
}
