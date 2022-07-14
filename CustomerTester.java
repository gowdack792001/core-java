import java.util.Scanner;




class CustomerTester{
	
	
	public static void main (String a[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the number of book");
			int size = sc.nextInt();
			
			
	Customer cust = new Customer(size);
	
	
	for(int i =0 ; i<size;i++){
	
	CustomerDTO dto = new CustomerDTO();
	
	System.out.println("enter the id of the book");
		int id = sc.nextInt();
		
	System.out.println("enter the name of the book");
		String name = sc.next();
		
	System.out.println("enter the autor name");
		String authorName = sc.next();
		
	System.out.println("enter the book price");
		int price =  sc.nextInt();
	
	
	
	
	dto.setId(id);
	dto.setName(name);
	dto.setAuthorName(authorName);
	dto.setPrice(price);
	
	
	
	lib.searchBook(dto);
	}
	
	
	lib.getBookDetails();
	




	}

















}