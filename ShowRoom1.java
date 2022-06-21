class ShowRoom {

int id;
static String name = "woodland" ;
 static int noOfBranches = 56;
 String location;
 long contactNo;
 static String name ;
 
 public ShowRoom( int ShowRoomId ,String loc , long cNo , String nm , ){
 System.out.println("ShowRoom object is created");
 ShowRoomId = ShowRoomId;
 location = loc ;
 contactNo = cNo ;
 name = nm ;
 }
 
 public static void main (String a[]){
 
 ShowRoom show = new ShowRoom (1,"commercial street",1231236L , "woodland");
 System.out.println(show.id + " " + show.location + " " + show.contactNo + show.name  );
 System.out.println(ShowRoom.name + " " + ShowRoom.noOfBranches );
  ShowRoom show1 = new ShowRoom(2,"vijaynagar",4564569L , "woodland") ;
 System.out.println(show1.id + " " + show1.location + " " + show1.contactNo + show.name );


  }


 }
 
 

 
 
 
 
 
 

 






