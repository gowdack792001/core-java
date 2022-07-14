class Customer {

	
	OrdererDTO [] dtos;
	
	int index;
	
	public customer(index){
	
	dtos = new OrderDTO[index];
	System.out.println("The custmemr custom has been created");
	
	}

	public boolean placeOrder(OrderDTO dto){
	
		boolean isPlaced = false;
		if(dto !=null || dto.getName() != null){
			this.dtos[index++] = dto;
			isDone = true;
			System.out.println("order is done");
		
			}
		else{
			
			System.out.println("order is not done");
			
		}
			return isAvailable;

	}
		public void getBookDetails(){
			
			System.out.println("the book details are");
			
		for(int i=0;i<dtos.length;i++){
			
	System.out.println(dtos[i].getId() + " " + dtos[i].getName() + " " + dtos[i].getAuthorName() + " " + dtos[i].getPrice());
			
		}
	
	
	
	
	}
































}