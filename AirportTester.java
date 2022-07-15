import java.util.Scanner ;

class AirportTester{

      public static void main(String a[]){
	     
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Number of terminals");
		 int size = sc.nextInt();
		 
		 Airport airport = new Airport(size);
		 
		for(int i=0; i<size;i++) {
			
		   TerminalDTO terminal = new TerminalDTO();
		   
		   System.out.println("Enter the id of the terminal");
		   int id = sc.nextInt();
		   System.out.println("Enter the terminal name");
		   String name = sc.next();
		   System.out.println("Enter the no of loading bridges ");
		   int noOfLoadingBridges = sc.nextInt();
		   System.out.println("Enter the depature gates");
		   int noOfDepartureGates = sc.nextInt();
		   System.out.println("Enter the check in counters");
		   int noOfCheckIncounters = sc.nextInt();
		   
		   terminal.setId(id);
		   terminal.setName(name);
		   terminal.setNoOfLoadingBridges(noOfLoadingBridges);
		   terminal.setNoOfDepartureGates(noOfDepartureGates);
		   terminal.setNoOfCheckinCounters(noOfCheckIncounters);
		   
		   airport.createTerminal(terminal);
		 
		 
		 }
		 
		 /*airport.getTerminalDetails();
		 System.out.println("Enter the existing id to update the loading bridges");
		 int existingId = sc.nextInt();
		 System.out.println("Enter no of loading bridges to be update");
		 int updateLoadingBridges = sc.nextInt();
		 airport.updateLoadingBridgeById(existingId, updateLoadingBridges);
		 airport.getTerminalDetails();
		 
		 
		 System.out.println("Enter the existing Name to update the no of checkin counters");
		 String existingName = sc.next();
		 System.out.println("Enter no of check in counters to be update");
		 int updateCheckInCounters = sc.nextInt();
		 airport.updateNoOfCheckInCoountersByName(existingName, updateCheckInCounters);
		 
		 airport.getTerminalDetails();*/
		 
		 airport.getTerminalDetails();
		 System.out.println("Enter the name to be deleted");
		 String name1 = sc.next();
		 airport.deleteTerminalsByName(name1);
		 airport.getTerminalDetails();
		 System.out.println("enter the id to be deleted");
		 int id1 = sc.nextInt();
		 airport.deleteTerminalsById(id1);
		 airport.getTerminalDetails();
	  
	  }


}