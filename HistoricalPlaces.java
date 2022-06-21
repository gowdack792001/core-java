class HistoricalPlaces{

String name;

String state;
int year;
String dynastyName;


public HistoricalPlaces(String name , String state , int year , String dynastyName){

System.out.println("HistoricalPlaces object is created");
this.name = name;
this.state = state;
this.year = year;
this.dynastyName = dynastyName;



}

public static void main (String a []){

HistoricalPlaces hist = new HistoricalPlaces ("mahabalipuram monument","tamilnadu",1984,"pallava dynasty");
System.out.println(hist.name + "" + hist.state + "" + hist.year + " " + hist.dynastyName );
HistoricalPlaces hist1 = new HistoricalPlaces("pattadakallu" , "karnataka" , 1987 , "chalukya dynasty");
System.out.println(hist1.name + " " + hist1.state + " " + hist1.year+ " " + hist1.dynastyName );
HistoricalPlaces hist2 = new HistoricalPlaces("chola temples" , "tamilnadu" , 1987 , "chola dynasty");
System.out.println(hist2.name + " " + hist2.state + " " + hist2.year + " " + hist2.dynastyName  );



}

}