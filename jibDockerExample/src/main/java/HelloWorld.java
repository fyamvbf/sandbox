import java.net.InetAddress;
import java.util.Map;

public class HelloWorld {
    public static void main(String[] args)throws Exception{
        System.out.println("Hello");
        System.out.println("Host:" + InetAddress.getLocalHost());
        Map env = System.getenv();
        env.forEach((k,v) ->{
            System.out.println(k + "=" + v);
        });
    }
}
