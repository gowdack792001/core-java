class Factorial{

public static void main(String a[]){


int factValue = fact(7) ;
System.out.println(factValue);



}
   public static int fact(int factNumber){
	System.out.println("invoked fact()");
    System.out.println("Parameter value" + factNumber);	
   int f = 1 ;
   for(int i=1; i <= factNumber ; i++ ){
      f = f * i ;
   }
System.out.println("end of fact");  
  return f ;
   }




}