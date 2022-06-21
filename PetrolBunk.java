class PetrolBunk{

int gstNumber;
String name;
String address;
long accountNumber;

public PetrolBunk(int gstNumber , String name, String address , long accountNumber){

System.out.println ("PetrolBunk object is created");
this.gstNumber = gstNumber;
this.name =name;
this.address = address;
this.accountNumber = accountNumber;

}

public static void main (String a []){


PetrolBunk bunk = new PetrolBunk (778882 , "hindustan" , "jp nagar" , 64164165214L);
System.out.println(bunk.gstNumber+ " " + bunk.name + " " + bunk.address + " " + bunk.accountNumber + " ");
PetrolBunk bunk1 = new PetrolBunk (778872 , "bharath" , "jayanagar" , 64189165214L);
System.out.println(bunk1.gstNumber+ " " + bunk1.name + " " + bunk1.address + " " + bunk1.accountNumber + " ");
PetrolBunk bunk2 = new PetrolBunk (778872 , "indian oil" , "yelahanka" , 64164165224L);
System.out.println(bunk2.gstNumber+ " " + bunk2.name + " " + bunk2.address + " " + bunk2.accountNumber + " ");

}




}