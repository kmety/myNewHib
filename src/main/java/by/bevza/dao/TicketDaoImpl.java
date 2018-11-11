package by.bevza.dao;

import by.bevza.model.Ticket;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TicketDaoImpl implements TicketDao{
    @Autowired
    SessionFactory sf;

    @Override
    public List<Ticket> getAllTickets() {
        System.out.println("Started");
        Session s = sf.openSession();
        Ticket t1 = s.get(Ticket.class, 1L);
        System.out.println(t1);
        return null;
    }

    @Override
    public Ticket getTicket(Long id) {
        Session s = sf.openSession();
        Ticket ticket = s.get(Ticket.class, id);
        return ticket;
    }
}
