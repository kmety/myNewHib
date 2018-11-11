package by.bevza.service;

import by.bevza.dao.TicketDao;
import by.bevza.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService{
    @Autowired
    private TicketDao dao;

    @Override
    public List<Ticket> getAllTickets() {
        return null;
    }

    @Override
    public Ticket getTicket(Long id) {
        return dao.getTicket(id);
    }
}
