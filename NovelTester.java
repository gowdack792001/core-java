class NovelTester{

	public static void main (String a[]){
	
	Novel n = new Novel() ;
	
	n.setName("revolution 2020");
	n.setyearOfPublish(2018);
	n.setnoOfChapters(5);
	n.setpublicationName("svs publivcation");
	
	
	
	System.out.println(n.getName() + " " + n.getyearOfPublish() + " " + n.getnoOfChapters() + " " + n.getpublicationName()); 
	
	
	
	n.read();
	
	
	
	
	
	}










}