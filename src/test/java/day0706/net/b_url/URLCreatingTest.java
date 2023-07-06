package day0706.net.b_url;

import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class URLCreatingTest {
    @Test
    void creatingAURL() throws MalformedURLException {
        String urlString = "http://example.com/";
        URL myURL = new URL(urlString);
        System.out.println(myURL);
    }

    @Test
    void creatingAURLRelativeToAnother() throws MalformedURLException {
        URL myURL = new URL("http://example.com/pages/");
        URL page1URL = new URL(myURL, "page1.html");
        URL page2URL = new URL(myURL, "page2.html");
        System.out.println("page1URL = " + page1URL);
        System.out.println("page2URL = " + page2URL);

        URL page1BottomURL = new URL(page1URL,"#BOTTOM");
        System.out.println("page1BottomURL = " + page1BottomURL);
    }

    @Test
    void otherURLConstructors() throws MalformedURLException {
        URL url = new URL("http", "example.com", "/pages/page1.html");
        System.out.println("url = " + url);
        /*
        // This is equivalent to
        // new URL("http://example.com/pages/page1.html");
         */

        URL gamelan = new URL("http", "example.com", 80, "/pages/page1.html");
        System.out.println("gamelan = " + gamelan);
        // telnet
    }

    @Test
    void URLAddressesWithSpecialCharacters() throws MalformedURLException, URISyntaxException {
        // http://example.com/hello world/
        // http://example.com/hello%20world
        URL url = new URL("http://example.com/hello%20world");
        System.out.println("url = " + url);


        URI uri = new URI("http", "example.com", "/hello world", null);
        System.out.println("uri = " + uri);
    }

    @Test
    void malformedURLException() {
        try {
            URL myURL = new URL("http://example.com/");
        }
        catch (MalformedURLException e) {
            // exception handler code here
            e.printStackTrace();
        }
    }
}
