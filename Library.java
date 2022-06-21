class Library{

String libraryType;
String address;
int seatCapacity;
long contactNo;


public Library(String libraryType , String address, int seatCapacity , long contactNo){

System.out.println("library object is created");
this.libraryType = libraryType;
this.address = address;
this.seatCapacity = seatCapacity;
this.contactNo = contactNo;



}

public static void main (String a []){

Library lib = new Library ("school","mahalakshmi layot",65,7575758585L);
System.out.println(lib.libraryType + " " + lib.address + " " + lib.seatCapacity + " " + lib.contactNo + " ");
Library lib1 = new Library ("college" , "ks layot" , 225 , 4585854585L);
System.out.println(lib1.libraryType + " " + lib1.address + " " + lib1.seatCapacity + " " + lib1.contactNo + " " );
Library lib2 = new Library ("public" , "vijaynagar" , 300 , 6565969695L);
System.out.println(lib2.libraryType + " " + lib2.address + " " + lib2.seatCapacity + " " + lib2.contactNo + " ");



}

}