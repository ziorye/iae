package day0706.net.b_url;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectingTest {
    @Test
    void readingDirectlyFromAURL() {
        try {
            URL myURL = new URL("https://www.oracle.com/");
            URLConnection myURLConnection = myURL.openConnection();
            myURLConnection.connect();
        }
        catch (MalformedURLException e) {
            // new URL() failed
            e.printStackTrace();
        }
        catch (IOException e) {
            // openConnection() failed
            e.printStackTrace();
        }
    }

}
