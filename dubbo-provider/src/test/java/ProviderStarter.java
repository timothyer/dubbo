import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 启动服务提供者之前先启动zookeeper
 * @author timothyer
 * @date 2018-5-7
 */
public class ProviderStarter {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        System.out.println("provider start ...");
        while (true);
    }
}
