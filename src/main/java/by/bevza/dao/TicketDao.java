package by.bevza.dao;

import by.bevza.model.Ticket;

import java.util.List;

public interface TicketDao {
    public List<Ticket> getAllTickets();
    public Ticket getTicket(Long id);
}
