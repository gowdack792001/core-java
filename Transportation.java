class Transportation{


	  //instance variables
	  String transportationType ; 
	  String transportationVehicle ;
	  String transportationMedium;
	  
	 // Parameterized Constructor
	public Transportation(String tType, String tVehicle, String tMedium){
		System.out.println("Transportation Object Created");
		transportationType = tType;
		transportationVehicle = tVehicle;
		transportationMedium = tMedium;
	}
		//main method-----starting point
    public static void main(String a[]){
		
	//constructor are used to initialize the instance variable of a class
	 Transportation   trspn  = new Transportation("RoadWays", "Truck", "Road");
	 System.out.println(trspn.transportationType + "    " + trspn.transportationVehicle + "   " + trspn.transportationMedium);
	 Transportation   trspn1  = new Transportation("RailWays", "Train", "Railway Track");
     System.out.println(trspn1.transportationType + "    " + trspn1.transportationVehicle + "   " + trspn1.transportationMedium);	 
	 Transportation   trspn2  = new Transportation("AirWays", "Helichopter", "Air");
	 System.out.println(trspn2.transportationType + "    " + trspn2.transportationVehicle + "   " + trspn2.transportationMedium);
	}
		

	}

   


