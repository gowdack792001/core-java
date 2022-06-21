class MovieHub{

static String movies[] = {"Charlie 777","Vilram","Bhool Bhulaiya 2","KGF2"};



	public static void main(String a[]){
		String value = getMovie("KGF 2");
		System.out.println("come we will watch movie" + value);
	
	}

	public static String getMovie(String movie){
	String movieName = null;
	for(int i=0 ; i < movies.length ; i++){
	
	if (Movies[i] == movie){
		movieName = Movies[i];
		
	}
	}
	return movieName;
}




}



