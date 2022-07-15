class Library{


	BookDTO[] dtos;
		
	int index;
	
	public Library(int size){
		dtos = new BookDTO[size];
		System.out.println("the library constanat is called");
	
		
	}

	public boolean searchBook(BookDTO dto){
		
		boolean isAvailable = false ;
		if(dto !=null || dto.getName() != null){
			this.dtos[index++] = dto;
			isAvailable = true;
			System.out.println("book is available");
		
			}
		else{
			
			System.out.println("book is not avavilable");
			
		}
		return isAvailable;
		
	
	
	}

		public void getBookDetails(){
			
			System.out.println("the book details are");
			
		for(int i=0;i<dtos.length;i++){
			
	System.out.println(dtos[i].getId() + " " + dtos[i].getName() + " " + dtos[i].getAuthorName() + " " + dtos[i].getPrice());
			
		}
			
			
		}


	public boolean UpdateBookPriceById(int id , int price){
		
		System.out.println("inside the updatbook peice by id");
		
		for(int i = 0; i<dtos.length; i++){
			
			if(dtos[i].getId() == id){
				
				dtos[i].setPrice(price);
				updatedBookPrice = true;
			}
			else{
				
				System.out.println("the entered id is wrong");
			}
		}
		
		
		return updateBookPrice;
		
		
		
		
		
	}
	
	public boolean deleteBookByName(String name){
				boolean bookDeleted = false;
			System.out.println("inside book patient");
				
			for(int i=0 ,j = 0; j<dtos.length;j++){
				
				if (!dtos[j].getName().equals(name)){
					//dtos[i] = null;
					dtos[i++] = dtos[j];
					//bookDeleted =  true;
					
				}
			dtos =	Arrays.copyOf(dtos , i);
			}
			
			return bookDeleted;
			
		}








}