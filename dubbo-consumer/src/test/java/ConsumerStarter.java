import com.dubbo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务消费者
 * @author timothyer
 * @date 2018-5-7
 */
public class ConsumerStarter {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        System.out.println("consumer start ...");
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.sayHello());
    }
}
