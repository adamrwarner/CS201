package final_project;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GetHyperlinks {

    public static void main(String[] args) throws Exception {
        
    	System.setProperty("java.net.preferIPv4Stack" , "true");
    	System.setProperty("javax.net.ssl.trustStore","C:/Program Files (x86)/Java/jdk1.8.0_25/jre/lib/security/cacerts");
    	System.setProperty("javax.net.ssl.trustStorePassword","changeit");
    	String url = "https://stackoverflow.com/questions/2835505";

    	Document document = Jsoup.connect(url).get();

        String question = document.select("#question .post-text").text();
        System.out.println("Question: " + question);

        Elements answerers = document.select("#answers .user-details a");
        for (Element answerer : answerers) {
            System.out.println("Answerer: " + answerer.text());
        }
    }
}