import com.googlecode.objectify.ObjectifyService;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by BigRockerEnding on 11/13/16.
 */
public class OfyHelper implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ObjectifyService.register(Greeting.class);
        ObjectifyService.register(Guestbook.class);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        throw new UnsupportedOperationException();
    }
}
