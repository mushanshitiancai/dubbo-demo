import com.mushan.DemoServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mazhibin on 16/7/30
 */
public class DemoAction {
    private DemoServer server;

    public void setServer(DemoServer server) {
        this.server = server;
    }

    public void action(String name){
        System.out.println(server.sayHello(name));
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        DemoAction demoAction = (DemoAction) ctx.getBean("demoAction");
        demoAction.action("mushan");
    }
}
