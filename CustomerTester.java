import java.util.Scanner;




class CustomerTester{
	
	
	public static void main (String a[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the number of orders");
			int size = sc.nextInt();
			
			
	Customer cust = new Customer(size);
	
	
	for(int i =0 ; i<size;i++){
	
	OrderDTO dto = new OrderDTO();
	
	System.out.println("enter the id of the order");
		int id = sc.nextInt();
		
	System.out.println("enter the name of the order");
		String name = sc.next();
		
	/*System.out.println("enter the autor name");
		String authorName = sc.next();*/
		
	System.out.println("enter the order price");
		int price =  sc.nextInt();
	
	
	
	
	dto.setId(id);
	dto.setName(name);
	//dto.setOrderNo(orderNo);
	dto.setPrice(price);
	
	
	
	cust.placeOrder(dto);
	}
	
	
	cust.getOrderDetails();
	System.out.println("gtyvgsubhaijkcm");
	int existingId = sc.nextInt();
	System.out.println("asdfg");
	String updateName = sc.next();
	
	cust.UpdateNameById(existingId , updateName);
	cust.getOrderDetails();
	
	System.out.println("enter the name of the order which has to be deleted");
		String existingName1 = sc.next();
	cust.deleteOrderByName(existingName1);
		cust.getOrderDetails();
	




	}

















}