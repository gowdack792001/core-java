class Ipl{


    private String nameOfSponser ;
	private int noOfTeams;
	private int noOfUmpires;
	private String mediaRights;
	
	
	
	
	public String getnameOfSponser(){
	return nameOfSponser;
	}
	
	public void  setnameOfSponser(String nameOfSponser){
		this.nameOfSponser = nameOfSponser;
	}

	public int getnoOfTeams(){
	return noOfTeams;
	}

	public void setnoOfTeams(int noOfTeams){
	this.noOfTeams = noOfTeams;
	
	}

	public int getnoOfumpires(){
	return noOfUmpires;
	}
	
	public void setnoOfUmpires(int noOfUmpires){
	this.noOfUmpires = noOfUmpires;
	}

	public String getmediaRights(){
	return mediaRights;
	}

	public void setmediaRights(String mediaRights){
	this.mediaRights = mediaRights; 	
	}


public void win(){
	
	System.out.println("the aim of this ipl to earn money");
}

	
	
	}