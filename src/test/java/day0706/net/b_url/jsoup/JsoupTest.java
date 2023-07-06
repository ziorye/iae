package day0706.net.b_url.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * https://jsoup.org/
 *
 * cookbook
 */
public class JsoupTest {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://so.gushiwen.org/gushi/shijing.aspx").get();
        Elements links = doc.select("div.left div.sons a");
        System.out.println(links.eachText());
        System.out.println(links.size());
    }
}
