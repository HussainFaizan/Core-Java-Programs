import java.net.URL;
import java.net.*;

class URLDemo {
    public static void main(String[] args) throws Exception {

        URL url = new URL("http://www.javatpoint.com/");
        System.out.println("Protocol::" + url.getProtocol());
        System.out.println("Host::" + url.getHost());
        System.out.println("Port Name::" + url.getPort());
        System.out.println("File Name::" + url.getFile());
        System.out.println("Default Port Number::" + url.getDefaultPort());
        System.out.println("Authority::" + url.getAuthority());
        System.out.println("Path::" + url.getPath());
        System.out.println("Get User INFO::" + url.getUserInfo());
        System.out.println("Ref::" + url.getRef());
        System.out.println("Query::" + url.getQuery());
        System.out.println("Content::" + url.getContent());
        System.out.println("String::" + url.toString());
        System.out.println("Coneection::" + url.openConnection());
    }
}