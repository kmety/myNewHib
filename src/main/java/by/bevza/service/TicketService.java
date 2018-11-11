package by.bevza.service;

import by.bevza.model.Ticket;

import java.util.List;

public interface TicketService {
    public List<Ticket> getAllTickets();
    public Ticket getTicket(Long id);
}
