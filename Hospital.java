class Hospital{
//hospital hAS many patients
	
	PatientDTO[] dtos = new PatientDTO[5];
//instance variable
	int index;

	public Hospital(){
		System.out.println("hospital const is called");
		
	}

	public boolean createPatient(PatientDTO dto){
		
		System.out.println("inside creatre patien");
		boolean isAdded = false;
		if(dto != null || dto.getName() != null){
			this.dtos[index++]=dto;
			isAdded = true;
			System.out.println("pateient added successfully");
			
		}
		else{
			System.out.println("cannot add pateieent please add the details");
		}
		return isAdded;
	}


	public void getPatientDetails(){
		System.out.println("inside the patient details");
		
		for(int i =0;i<dtos.length;i++){
			
	System.out.println(dtos[i].getId() + " " + dtos[i].getName() + " " + dtos[i].getAddress() + " " + dtos[i].getGender() + " " + dtos[i].getContactNo());
		}
		
		
		
		
	}




}