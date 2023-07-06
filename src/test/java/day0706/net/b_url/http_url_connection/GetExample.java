package day0706.net.b_url.http_url_connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetExample {

    public String get(String url) throws IOException {
        URL targetUrl = new URL(url);

        //如果需要代理
        /*InetSocketAddress sa = new InetSocketAddress("188.199.88.99", 16816);
        Proxy proxy = new Proxy(Proxy.Type.HTTP, sa);
        HttpURLConnection conn = (HttpURLConnection) targetUrl.openConnection(proxy);*/

        HttpURLConnection conn = (HttpURLConnection) targetUrl.openConnection();

        //如果需要代理，同时需要提供用户名密码
        /*String username = "username";
        String password = "password";
        String authValue = "Basic " + Base64.getEncoder().encodeToString((username + ":" + password).getBytes("utf-8"));
        conn.setRequestProperty("Proxy-Authorization", authValue);*/

        conn.setConnectTimeout(20000);
        conn.setReadTimeout(20000);
        conn.setUseCaches(false);
        conn.setRequestProperty("User-Agent","Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.89 Safari/537.36");
        conn.setInstanceFollowRedirects(true);

        String charset = "UTF-8";
        if(conn.getContentType() != null && conn.getContentType().indexOf("charset=") != -1){
            charset = conn.getContentType().substring(conn.getContentType().indexOf("charset=")+8);
            System.out.println("自动检测到charset为"+charset);
        }

        InputStreamReader isr = new InputStreamReader(conn.getInputStream(), charset);
        BufferedReader in = new BufferedReader(isr);
        StringBuilder result = new StringBuilder();
        String readLine;
        while ((readLine = in.readLine()) != null) {
            result.append(readLine);
        }
        in.close();
        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        GetExample example = new GetExample();
        String response = example.get("https://www.baidu.com");
        System.out.println(response);
    }
}
