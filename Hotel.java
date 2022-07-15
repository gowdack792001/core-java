import java.util.Arrays;
class Hotel{


    FoodItemsDTO[] foodItems ;
	int index;
	
	public Hotel(int size){
	  foodItems = new FoodItemsDTO[size];
      System.out.println("The Hotel constructor is created");	  
	
	}
	
	public boolean createFoodItem(FoodItemsDTO foodItem){
	
	    System.out.println("Inside the createFoodItem()");
		boolean isAdded = false;
		
		if(foodItem != null && foodItem.getName() != null) {
		    
			this.foodItems[index++] = foodItem;
			isAdded = true;
			System.out.println("The foodItems detail is saved");
		} else {
		   System.out.println("The foodItems is not saved");
		
		}
	       System.out.println("the createFoodItem() is ended");
	   return isAdded;
	}
	
	public void getFoodItemDetails(){
	
	     
		 for(int i=0; i<foodItems.length; i++){
		    
			  System.out.println(foodItems[i].getId()+"  "+foodItems[i].getName()+"  "+foodItems[i].getPrice()+"  "+foodItems[i].getType());
		 
		 }
	     
	}
	
	public boolean updatePriceByName(String name, int price){
		 
		 System.out.println("Inside updatePriceByName ");
		 boolean updatePrice = false;
		 for(int i=0; i<foodItems.length;i++){
			 if(foodItems[i].getName().equals(name)){
				 foodItems[i].setPrice(price);
				 updatePrice = true;
				 
			 }
			 else{
				 System.out.println("The food name is not found");
			 }
		 }
		 return updatePrice;
	 }
	 
	 
	  public boolean deleteByName(String name){
		 System.out.println("inside deleteByName");
		 boolean deleteFoodItem=false;
		 int i,j;
		 for(i=0,j=0;j<foodItems.length;j++){
			 if(!foodItems[j].getName().equals(name)){
				 foodItems[i++]=foodItems[j];
				 deleteFoodItem = true;
			 } else {
				 System.out.println("the foodItem is deleted");
			 }
		 }
		 foodItems = Arrays.copyOf(foodItems, i);
		 return deleteFoodItem;
	 }
	 
	 
	  public boolean deleteById(int id){
		 System.out.println("inside deleteById");
		 boolean deleteFoodItem=false;
		 int i,j;
		 for(i=0,j=0;j<foodItems.length;j++){
			 if(foodItems[j].getId()!=id){
				 foodItems[i++]=foodItems[j];
				 deleteFoodItem = true;
			 } else {
				 System.out.println("the foodItem is deleted");
			 }
		 }
		 foodItems = Arrays.copyOf(foodItems, i);
		 return deleteFoodItem;
	 }



}