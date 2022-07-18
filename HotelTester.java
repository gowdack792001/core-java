import java.util.Scanner ;

class HotelTester{

      public static void main(String a[]){
	     
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Number of food items");
		 int size = sc.nextInt();
		 
		 Hotel hotel = new Hotel(size);
		 
		for(int i=0; i<size;i++) {
			
		   FoodItemsDTO foodItem = new FoodItemsDTO();
		   
		   System.out.println("Enter the id of the foodItem");
		   int id = sc.nextInt();
		   System.out.println("Enter the food name");
		   String name = sc.next();
		   System.out.println("Enter the price of the food ");
		   int price = sc.nextInt();
		   System.out.println("Enter type of the food");
		   String type = sc.next();
		   
		   foodItem.setId(id);
		   foodItem.setName(name);
		   foodItem.setPrice(price);
		   foodItem.setType(type);
		   
		   hotel.createFoodItem(foodItem);
		 
		 
		 }
		 		 			String option = null;
							
			do{
				System.out.println("enter 1 to getFoodItemDetails");
				System.out.println("enter 2 to updatePriceByName");
			    System.out.println("enter 3 to deleteByName");
				System.out.println("enter 4 to deleteById ");

					int choice = sc.nextInt();
					
				switch(choice){
					
					case 1 : 		 hotel.getFoodItemDetails();

					break ;
					
					case 2 :  System.out.println("Enter the existing Name to update the price");
								String existingName = sc.next();
								System.out.println("Enter price to be update");
								int updatePrice = sc.nextInt();
								hotel.updatePriceByName(existingName, updatePrice);
									break ;
				
					case 3 :
					
						 System.out.println("Enter the name to be deleted");
						String name1 = sc.next();
						hotel.deleteByName(name1);
									break ;

					case 4 : 
					
								System.out.println("enter the id to be deleted");
								int id1 = sc.nextInt();
								hotel.deleteById(id1);
									break ;
 
 
				
				
					default : System.out.println("given choise cannot be deleivered");
					break ;
	}
		System.out.println("do you want to continue yes/no");
		
		 option = sc.next();		
				
				
				

			}while(option.equals("yes"));

		 
		 
	     
		
		 
		 
	  }


}