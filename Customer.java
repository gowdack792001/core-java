import java.util.Arrays;


class Customer {

	
	OrderDTO [] dtos;
	
	int index;
	
	public Customer(int size){
	
	dtos = new OrderDTO[index];
	System.out.println("The custmemr custom has been created");
	
	}

	public boolean placeOrder(OrderDTO dto){
	
		boolean isPlaced = false;
		if(dto !=null || dto.getName() != null){
			this.dtos[index++] = dto;
			isPlaced = true;
			System.out.println("order is done");
		
			}
		else{
			
			System.out.println("order is not done");
			
		}
			return isPlaced;

	}
		public void getOrderDetails(){
			
			System.out.println("the order details are");
			
		for(int i=0;i<dtos.length;i++){
			
	System.out.println(dtos[i].getId() + " " + dtos[i].getName() + " " +/* dtos[i].getOrderNo() + " " +*/dtos[i].getPrice());
			
		}
	
	
	
	
	}


	public boolean UpdateNameById(int id , String name){
		System.out.println("inside UpdateNameById");
		boolean updatedName = false;
		for(int i=0;i<dtos.length;i++){
			
			if(dtos[i].getId() == id){
				
				dtos[i].setName(name);
				updatedName = true;
				
			}
			
			else{
				System.out.println("the enterd id is wrong");
			}
			
			
		}
		
		return updatedName;
		
	}
	public boolean deleteOrderByName(String name){
				boolean orderDeleted = false;
			System.out.println("inside delete order");
				
			for(int i=0 ,j = 0; j<dtos.length;j++){
				
				if (!dtos[j].getName().equals(name)){
					//dtos[i] = null;
					dtos[i++] = dtos[j];
					//patientDeleted =  true;
					
				}
			dtos =	Arrays.copyOf(dtos , i);
			}
			
			return orderDeleted;
			
		}





























}