import javax.servlet.*;

public class MyServletContextListener implements ServletContextListener {

  public void contextInitialized(ServletContextEvent event) {
    // DataSource 생성
  }

  public void contextDestroyed(ServletContextEvent event) {
    // DataSource 소멸
  }

}
