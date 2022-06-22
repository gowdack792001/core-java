class ShowRoom {

int id;

 static int noOfBranches = 56;
 String location;
 long contactNo;
 static String name ;
 
 public ShowRoom( int id , String location , long contactNo , String name ){
 System.out.println("ShowRoom object is created");
 ////////this.id = id----------------use this key word this keyword help compiler to point to instance variables. 
 this.id = id;
 this.location = location ;
 this.contactNo = contactNo ;
 this.name = name ;
 }
 
 public static void main (String a[]){
 
 ShowRoom show = new ShowRoom (1,"commercial street",1231236L , "woodland");
 System.out.println(show.id + " " + show.location + " " + show.contactNo + " " + show.name  );
 System.out.println(ShowRoom.name + " " + ShowRoom.noOfBranches );
  ShowRoom show1 = new ShowRoom(2,"vijaynagar",4564569L , "woodland") ;
 System.out.println(show1.id + " " + show1.location + " " + show1.contactNo + " " + show.name );


  }


 }
 
 

 
 
 
 
 
 

 






