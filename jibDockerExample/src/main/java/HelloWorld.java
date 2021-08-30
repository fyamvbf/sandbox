import java.net.InetAddress;
import java.util.Map;

public class HelloWorld {
    public static void main(String[] args)throws Exception{
    	//固定文言
        System.out.println("Hello");
        System.out.println("Host:" + InetAddress.getLocalHost());
        //引数出力
    	System.out.println("引数:");
    	for (int i = 0; i < args.length; i++) {
    		System.out.println(i + ":" + args[i]);
		}
    	//環境変数出力
        System.out.println("環境変数:");
        Map<String, String> env = System.getenv();
        env.forEach((k,v) ->{
            System.out.println(k + "=" + v);
        });

    }
}
