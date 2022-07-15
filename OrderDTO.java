class OrderDTO{

		public OrderDTO(){
		System.out.println("the order details are");
	}
	                                                      
		private int id;                                   
		private String name;                                    
		//private int OrderNo;           
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
	  /* public int getOrderNo(){
		return orderNo;
		}
		
		public void setOrderNo(int orderNo){
		this.orderNo = orderNo ;
		}*/

		
	public int getPrice(){
	return price;
	}

	public void setPrice(int price){
	this.price = price ;	
	}




}