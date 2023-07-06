package day0706.net.b_url.http_url_connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class PostExample {

    public String post(String url) throws IOException {
        URL targetUrl = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) targetUrl.openConnection();
        conn.setConnectTimeout(20000);
        conn.setReadTimeout(20000);
        conn.setUseCaches(false);
        conn.setRequestProperty("User-Agent","");
        conn.setInstanceFollowRedirects(true);

        conn.setDoOutput(true);
        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
        wr.write("username=admin&password=password");
        wr.flush();
        wr.close();

        InputStreamReader isr = new InputStreamReader(conn.getInputStream(), "UTF-8");
        BufferedReader in = new BufferedReader(isr);
        StringBuffer result = new StringBuffer();
        String readLine;
        while ((readLine = in.readLine()) != null) {
            result.append(readLine);
        }
        in.close();
        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        PostExample example = new PostExample();
        //String response = example.post("https://www.baidu.com");
        String response = example.post("http://httpbin.org/post");
        System.out.println(response);
    }
}
