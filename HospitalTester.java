class HospitalTester{


public static void main (String a[]){

	Hospital hos = new Hospital();
	
	
	PatientDTO dto = new PatientDTO();
	
		dto.setId(12);
		dto.setName("baba");
		dto.setAddress("hh town");
		dto.setGender(Gender.male);
		dto.setContactNo(7897897896L);
	
	
	PatientDTO dto1 = new PatientDTO();
	
	dto1.setId(13);
	dto1.setName("raju");
	dto1.setAddress("rajajinar");
	dto1.setGender(Gender.male);
	dto1.setContactNo(8585858585L);
	
	PatientDTO dto2 = new PatientDTO();
	
		dto2.setId(25);
		dto2.setName("rachitha");
		dto2.setAddress("mahalakshmi");
		dto2.setGender(Gender.female);
		dto2.setContactNo(2020202020L);
		
		
	PatientDTO dto3 = new PatientDTO();
		dto3.setId(35);
		dto3.setName("rakesh");
		dto3.setAddress("vijaynagar");
		dto3.setGender(Gender.male);
		dto3.setContactNo(1021021023L);
		
	
	PatientDTO dto4 = new PatientDTO();
	
		dto4.setId(49);
		dto4.setName("raam");
		dto4.setAddress("bamashankri");
		dto4.setGender(Gender.male);
		dto4.setContactNo(5252525252L);
	
	PatientDTO dto5 = new PatientDTO();
	
	
		dto5.setId(89);
		dto5.setName("Kaushik");
		dto5.setAddress("room 1 HSKS");
		dto5.setGender(Gender.male);
		dto5.setContactNo(2562562563L);
	
	
	hos.createPatient(dto);
	hos.createPatient(dto1);
	hos.createPatient(dto2);
	hos.createPatient(dto4);
	hos.createPatient(dto5);
	
	hos.getPatientDetails();



}





}