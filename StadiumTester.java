class StadiumTester{

	public static void main(String a[]){
	
	
	StadiumDTO s = new StadiumDTO();
	
	s.setName("kantirava");
	s.setnoOfSeats(1225);
	s.setlocation("banglore");
	s.setnoOfEntryGates(5);
	
	
	System.out.println(s.getName() + " " + s.getnoOfSeats() + " " + s.getlocation() + " " + s.getnoOfEntryGates());
	
	
	
	s.play();
	
	
	}






}