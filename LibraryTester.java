import java.util.Scanner;




class LibraryTester{


public static void main (String a[]){


	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the number of book");
			int size = sc.nextInt();
			
			
	Library lib = new Library(size);
	
	
	for(int i =0 ; i<size;i++){
	
	BookDTO dto = new BookDTO();
	
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
	
	System.out.println("enter the id for whivh the price has to be updated");
	
		int existingId  = sc.nextInt();
		
	System.out.println("enter the price has to be updated");
		int updatedPrice = sc.nextInt Line();
		
	lib.updateBookPriceById(existingId , updatedPrice);
	
	lib.getBookDetails();
	System.out.println("enter the name of the book which has to be deleted");
		String existingName1 = sc.next();
	hos.bookByName(existingName1);
		hos.getPatientDetails();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
















}


















}