import cn.itheima.Service.UserService;
import cn.itheima.dao.UserDao;
import cn.itheima.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBatiesTest {
    @Test
    public void test1(){
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService bean = app.getBean(UserService.class);
        User u = bean.findById(1);
        System.out.println(u);
    }
}
