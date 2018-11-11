package by.bevza.runApp;

import by.bevza.model.Ticket;
import by.bevza.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App {
  @Autowired
    TicketService ts;

  public void run() {
    System.out.println("Started");
    Ticket t1 = ts.getTicket(1L);
    System.out.println(t1);
  }

  public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext("by.bevza");
    App app = applicationContext.getBean(App.class);
    app.run();
  }
}
