

public class Theatre { 
	private String theatre_name; 
	private int no_of_seats; 
	
	//has a rel 
	private Ticket ticket;

	public Theatre(String  n, int no) { 
		this.theatre_name=n; 
		this.no_of_seats=no;
	}

	public String getTheatre_name() {
		return theatre_name;
	}

	public void setTheatre_name(String theatre_name) {
		this.theatre_name = theatre_name;
	}

	public int getNo_of_seats() {
		return no_of_seats;
	}

	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	} 
	
	//code of theatre operations 
	public int bookTicket() { 
		if(ticket.getNo_of_tickets()<=no_of_seats) { 
			no_of_seats=no_of_seats-ticket.getNo_of_tickets(); 
			return ticket.getNo_of_tickets();
		} 
		else { 
			return -1;
		}
	} 
	public void showSeatAvailability() { 
		System.out.println(no_of_seats+"Available");
	}
  
	public void cancelTicket(int cancel_ticket) { 
		if(cancel_ticket<=ticket.getNo_of_tickets()) { 
			no_of_seats=no_of_seats+cancel_ticket; 
			ticket.setNo_of_tickets(ticket.getNo_of_tickets()-cancel_ticket);
		}else { 
			System.out.println("=======Technical issue========");
		}
	} 
	public void showTicketDetails() { 
		ticket.printTicketDetails();
	}
}
