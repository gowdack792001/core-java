class BookMyMovie{

   String movies[] = {"Gaalipata" , "Om" , "A" , "Upendra" , "Raktha Kanniru" , "Yajamana" , "Suryavamshi" , "H2O" } ;
   int noOfTickets ;
 static int ticketPrice = 600 ;
   int totalNoOfTickets = 200 ;
   int totalTicketPrice ;
   
   String snacks[] = {"chakli" , "wheels" , "sweet" , "mixture" , "lays", "coolDrinks"};
   String snackName;
   int snackQuantity;
   int totalNoOfSnacks;
static int snackPrice = 100 ;
   int totalSnackPrice;
   
   
   
  public BookMyMovie(){
	   System.out.println("BookMyMovie object is created");
	   this.theatreName = theatreName;
	   this.noOfTickets = noOfTickets;
	   this.movieName = movieName;
	   
	   this.snackName = snackName;
	   this.snackQuantity = snackQuantity;
	   }

 public void showTime(int noOfTickets , String bookedBy , String movieName ){
 int totalTicketPrice = 0 ;
System.out.println("inside showTime method()..." );
System.out.println("Arg 1 : no of tickets are" +noOfTickets);
System.out.println("Arg 2: bookedBy" +bookedBy);
System.out.println("Arg 3 : movieName is " +movieName);

  
for (int index = 0 ; index < movies.length ; index++){
if(movieName == movies[index]){
System.out.println("movie name matched");

if(noOfTickets < totalNoOfTickets){
   
   totalTicketPrice = noOfTickets*ticketPrice ;
   noOfTickets = totalNoOfTickets - noOfTickets ;
   System.out.println("for movie  : "  + movieName + "noOfTickets that are remaining :" + noOfTickets + "total price is" + totalTicketPrice);
 
 
 }
else{
System.out.println ("ist ticket illa");
}


}
else {
 System.out.println("movie is not available");
}
return totalNoOfTickets;
}
public int (intervalTime(String snackName , int snackQuantity , int totalSnackPrice){
int totalSnackPrice = 0 ;
System.out.println("inside intervalTime()....");
System.out.println("Arg 1 : the snack name is" + snackName);
System.out.println("Arg 2 : the required snack quantity" + snackQuantity);
System.out.println("Arg 3 : the total snacks price is" + totalSnackPrice );

for  (int c = 0 ; c < snacks.length ; c++){
	if(snackName == snacks[c]){
		System.out.println("snack name matched");
		
		if(quantity<totalNoOfSnacks){
			 totalSnackPrice = quantity * snackPrice;
				totalNoOfSnacks=totalNoOfSnacks - quantity;
		       System.out.println(" For snacks : "+ quantity + " snacks remaining "+ totalNoOfSnacks +" total price is " + totalSnackPrice );
			
			
		}
		else{
			System.out.println ("ist snacks illa");
		}
		
	}
	
	else{
		System.out.println("snacks is not available");
	}
	return totalNoOfSnacks;
}


	
	
	
}










}
 }