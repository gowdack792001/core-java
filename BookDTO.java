class BookDTO{


	public BookDTO(){
		System.out.println("the book details are");
	}
	
		private int id;
		private String name;
		private String authorName;
		private int price;
		
		
		
		
		public int getId(){
		return id;
		}
		
		public void setId(int id){
		this.id = id ;
		}


	public String getName(){
	return name;
	}

	public void setName(String name){
	this.name = name;
	}

		public String getAuthorName(){
		return authorName;
		}

		public void setAuthorName(String authorName){
		this.authorName = authorName;
		}

	public int getPrice(){
	return price;
	}

	public void setPrice(int price){
	this.price = price ;	
	}


















}