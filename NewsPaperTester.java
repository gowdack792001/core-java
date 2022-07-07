class NewsPaperTesterDTO{


public static void main (String a[]){


NewsPaperDTO news = new NewsPaperDTO();

news.setName ("prajavani");
news.setDate (20);
news.setgoldRate(5500);
news.setarticleName("news article");



	System.out.println(news.getName() + " " + news.Date() + " " + news.getgoldRate() + " " + news.getarticleName()); 



news.read();




}



















}