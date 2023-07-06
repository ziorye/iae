package day0706.net.b_url;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

public class URLConnectionReader {
    @Test
    void testOpenConnection() throws Exception {
        URL oracle = new URL("https://www.oracle.com/");
        URLConnection uc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();
    }

    @Test
    void testConnectTimeout() throws Exception {
        URL oracle = new URL("https://www.oracle.com/");
        URLConnection uc = oracle.openConnection();
        uc.setConnectTimeout(1);

        Exception exception = Assertions.assertThrows(SocketTimeoutException.class, () -> {
            BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();
        });

        Assertions.assertTrue("Connect timed out".equals(exception.getMessage()) || StringUtils.isBlank(exception.getMessage()));
    }

    @Test
    void testReadTimeout() throws Exception {
        URL oracle = new URL("https://www.oracle.com/");
        URLConnection uc = oracle.openConnection();
        uc.setReadTimeout(1);

        Exception exception = Assertions.assertThrows(SocketTimeoutException.class, () -> {
            BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();
        });

        Assertions.assertTrue("Read timed out".equals(exception.getMessage()) || StringUtils.isBlank(exception.getMessage()));
    }

    @Test
    void testOpenConnection2() throws Exception {
        URL oracle = new URL("https://www.baidu.com/");
        URLConnection uc = oracle.openConnection();
        uc.setConnectTimeout(3000);
        uc.setReadTimeout(3000);
        BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();
    }

    @Test
    void testStreamClosedException() throws Exception {
        URL oracle = new URL("https://www.baidu.com/");
        URLConnection uc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));

        Exception exception = Assertions.assertThrows(IOException.class, () -> {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);

                // move out
                in.close();
            }
        });

        Assertions.assertEquals("Stream closed", exception.getMessage());
    }

    @Test
    void testBaidu() throws Exception {
        URL oracle = new URL("https://www.baidu.com/");
        URLConnection uc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();
    }

    @Test
    void testQq() throws Exception {
        URL oracle = new URL("https://www.qq.com/");
        URLConnection uc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream(), Charset.forName("gb2312"))); // gb2312
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();
    }

    @Test
    void testDoubanUserAgentProperty() throws Exception {
        URL oracle = new URL("https://www.douban.com/");
        URLConnection uc = oracle.openConnection();
        uc.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36");
        BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();
    }
}
