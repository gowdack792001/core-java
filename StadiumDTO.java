class StadiumDTO{

	private String name;
	private int noOfSeats;
	private String location;
	private int noOfEntryGates;
	
	
	public String getName(){
	return name;
	}
	
	public void  setName(String name){
		this.name = name;
	}

	public int getnoOfSeats(){
	return noOfSeats;
	}
	
	public void setnoOfSeats(int noOfSeats){
	this.noOfSeats = noOfSeats;
	}

	public String getlocation(){
		return location;
	}

	public void setlocation(String location){
		this.location = location;
	}

	public int getnoOfEntryGates(){
		return noOfEntryGates ;
	}
	
	public void setnoOfEntryGates(int noOfEntryGates){
		this.noOfEntryGates =  noOfEntryGates;
	}

	public void play(){
		System.out.println("stadium is to play games");
	}

}