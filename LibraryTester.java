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
	  String option = null;
				
			do{
				System.out.println("enter 1 to getBookDetails");
					System.out.println("enter 2 to UpdateBookPriceById");
			    System.out.println("enter 3 to UpdateBookPriceByName");
					System.out.println("enter 4 to deleteBookById ");
				System.out.println("enter 5 to deleteBookByName ");

					int choice = sc.nextInt();
					
				switch(choice){
					
					case 1 : 	lib.getBookDetails();


					break ;
					
					case 2 :  
								System.out.println("enter the id for whivh the price has to be updated");
								
									int existingId1  = sc.nextInt();
									
								System.out.println("enter the price has to be updated");
									int updatedPrice = sc.nextInt();
									
								lib.UpdateBookPriceById(existingId1 , updatedPrice);
									break ;
				
					case 3 :
					
						 
								 System.out.println("enter the name of the book whuch price has to be updated");
								  String existingName2 = sc.next();
								 System.out.println("enter the updated price");
									int updatedPrice1 = sc.nextInt();
								lib.UpdateBookPriceByName(existingName2 , updatedPrice1);
									break ;

					case 4 : 
					
							 System.out.println("enter the name of the book which has to be deleted");
							int existingId2 = sc.nextInt();
							lib.deleteBookById(existingId2);
									break ;
 
 
					case 5 : 
								System.out.println("enter the name of the book which has to be deleted");
								String existingName1 = sc.next();
								lib.deleteBookByName(existingName1);			
								break ;
				
				
					default : System.out.println("given choise cannot be deleivered");
					break ;
	}
		System.out.println("do you want to continue yes/no");
		
		 option = sc.next();		
				
				
				

				
				
				
				
				
				
				
				
				
			}while(option.equals("yes"));
	
	
	
	
	
	
   }



}