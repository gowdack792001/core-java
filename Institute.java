class Institute{

String name;
String institutionType;
String address;
long contactNo;
String timings;

public Institute (String name , String institutionTypeType , String address , long contactNo , String timings){
System.out.println ("Institute object is created");

this.name = name;
this.institutionType = institutionType;
this.address = address;
this.contactNo = contactNo;
this.timings = timings;
}

public static void main (String a []){


Institute inst = new Institute ("CMS"  , "java" , "jp nagar" , 64164165214L , "9 to4pm");
System.out.println(inst.name+ " " + inst.institutionType + " " + inst.address + " " + inst.contactNo + " " + inst.timings);
Institute inst1 = new Institute ("uttara"  , "python" , "rajajinagar" , 64164165854L , "10 to 5pm");
System.out.println(inst1.name+ " " + inst1.institutionType + " " + inst1.address + " " + inst1.contactNo + " " + inst1.timings );
Institute inst2 = new Institute ("akash"  , "JEE" , "Rajajinagar" , 64164165778L , "10 to 6pm");
System.out.println(inst2.name+ " " + inst2.institutionType + " " + inst2.address + " " + inst2.contactNo + " " + inst2.timings );

}





}