class IplTester{


public static void main(String a[]){


Ipl ipl = new Ipl();

ipl.setnameOfSponser("tata");
ipl.setnoOfTeams(10);
ipl.setnoOfUmpires(25);
ipl.setmediaRights("star sports");



System.out.println(ipl.getnameOfSponser() + " " + ipl.noOfTeams() + " " + ipl.getnoOfumpires() + " " + ipl.getmediaRights()); 


ipl.win();


}













}