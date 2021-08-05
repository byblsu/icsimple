import com.dao.IBookDao;
import com.dao.IUserDao;
import com.reflect.ApplicationContext;

public class BootStrap {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ApplicationContext();
        applicationContext.initContext();

        System.out.println(applicationContext.getBean(IBookDao.class));
    }
}
