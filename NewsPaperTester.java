class NewsPaperTester{


public static void main (String a[]){


NewsPaper news = new NewsPaper();

news.setName ("prajavani");
news.setDate (20);
news.setgoldRate(5500);
news.setarticleName("news article");



	System.out.println(news.getName() + " " + news.Date() + " " + news.getgoldRate() + " " + news.getarticleName()); 



news.read();




}



















}