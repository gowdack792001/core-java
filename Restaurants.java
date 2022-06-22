class Restaurants{

   String name;
   String address;
   long contactNo;
   int noOfEmployees;
   int noOfBranches;
   String type;
   
   public static void main(String a[])
   {
      Restaurants resto = new Restaurants();
	  resto.name = "Shanti sagar";
	  resto.address = "Basavesware Nagar";
	  resto.contactNo  = 8908704501l;
	  resto.noOfEmployees = 13;
	  resto.noOfBranches = 7;
	  resto.type = "Veg";
	  System.out.println("The name of the restaurant is "+ resto.name);
	  System.out.println("The address of the restaurant is "+ resto.address);
	  System.out.println("The contact number of the restaurant is "+ resto.contactNo);
	  System.out.println("Number of employees "+ resto.noOfEmployees);
	  System.out.println("The number of branches present in the bengaluru "+ resto.noOfBranches);
	  System.out.println("------------------------------------------------------");
	  
	  Restaurants resto1 = new Restaurants();
	  resto1.name = "Empire";
	  resto1.address = "Rajajinagar";
	  resto1.contactNo  = 910910000245l;
	  resto1.noOfEmployees = 25;
	  resto1.noOfBranches = 12;
	  resto1.type = "Veg and Nonveg";
	  System.out.println("The name of the restaurant is "+ resto1.name);
	  System.out.println("The address of the restaurant is "+ resto1.address);
	  System.out.println("The contact number of the restaurant is "+ resto1.contactNo);
	  System.out.println("Number of employees "+ resto1.noOfEmployees);
	  System.out.println("The number of branches present in the bengaluru "+ resto1.noOfBranches);
	  System.out.println("type of the restaurant "+ resto1.type);
	  System.out.println("------------------------------------------------------");
	  
	  Restaurants resto2 = new Restaurants();
	  resto2.name = "Le arabia";
	  resto2.address = "Rajajinagar";
	  resto2.contactNo  = 7502361580l;
	  resto2.noOfEmployees = 26;
	  resto2.noOfBranches = 2;
	  resto2.type = "NonVeg";
	  System.out.println("The name of the restaurant is "+ resto2.name);
	  System.out.println("The address of the restaurant is "+ resto2.address);
	  System.out.println("The contact number of the restaurant is "+ resto2.contactNo);
	  System.out.println("Number of employees "+ resto2.noOfEmployees);
	  System.out.println("The number of branches present in the bengaluru "+ resto2.noOfBranches);
	  System.out.println("type of the restaurant "+ resto2.type);
	  System.out.println("------------------------------------------------------");
	  
	  Restaurants resto3 = new Restaurants();
	  resto3.name = "Mallige utada mane";
	  resto3.address = "Vijayanagar";
	  resto3.contactNo  = 958712563l;
	  resto3.noOfEmployees = 6;
	  resto3.noOfBranches = 1;
	  resto3.type = "Veg";
	  System.out.println("The name of the restaurant is "+ resto3.name);
	  System.out.println("The address of the restaurant is "+ resto3.address);
	  System.out.println("The contact number of the restaurant is "+ resto3.contactNo);
	  System.out.println("Number of employees "+ resto3.noOfEmployees);
	  System.out.println("The number of branches present in the bengaluru "+ resto3.noOfBranches);
	  System.out.println("type of the restaurant "+ resto3.type);
   
   }

}