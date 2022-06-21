class Industries {
static String indName = "HindalCo";
static String ownerName = "ABC";
String location;
int noOfWorkers;
long contactNo;

public Industries (String location, int noOfWorkers, long contactNo) {

this.location = location;
this.noOfWorkers = noOfWorkers;
this.contactNo = contactNo;
}
 public static void main (String a[]) {
	 
Industries industry = new Industries("Belagavi", 50, 6786786789L);
System.out.println("The Industry Name is : "+Industries.indName + "  Owner Name is : "+Industries.ownerName);
System.out.println("Location : "+industry.location + " Workers : "+industry.noOfWorkers+ " Contact No : "+industry.contactNo);
System.out.println(" ");

Industries industry1 = new Industries("Bangalore", 100, 9879879876L);
System.out.println("The Industry Name is : "+Industries.indName + "  Owner Name is : "+Industries.ownerName);
System.out.println("Location : "+industry.location + " Workers : "+industry.noOfWorkers+ " Contact No : "+industry.contactNo);

}
}