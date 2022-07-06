class Novel{

	private String name ;
	private int yearOfPublish;
	private int noOfChapters;
	private String publicationName;
	
	
	
	public String getName(){
	return name;
	}
	
	public void  setName(String name){
		this.name = name;
	}

	public int getyearOfPublish(){
	return yearOfPublish;
	}

	public void setyearOfPublish(int yearOfPublish){
	this.yearOfPublish = yearOfPublish;
	
	}

	public int getnoOfChapters(){
	return noOfChapters;
	}
	
	public void setnoOfChapters(int noOfChapters){
	this.noOfChapters = noOfChapters;
	}

	public String getpublicationName(){
	return publicationName;
	}

	public void setpublicationName(String publicationName){
	this.publicationName = publicationName; 	
	}
	
	public void read(){
		System.out.println("novel is to read");
	}
	
	
}