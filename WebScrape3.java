//prompts user to enter a url and the program returns the title

import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class WebScrape3
{
    public static void main (String args[]) throws Exception
    {
        do
        {
            System.out.println("enter a URL");
            Scanner inp = new Scanner(System.in);
            String url = inp.nextLine();
            if(!url.contains("http://www."))
            {
                url = "http://www." + url;
            }
            Document doc = Jsoup.connect(url).get();
            String title = doc.title();
            System.out.println("Title: " + title);
        }while(true);

    }
}