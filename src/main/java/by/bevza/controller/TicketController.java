package by.bevza.controller;

import by.bevza.model.Ticket;
import by.bevza.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TicketController {
    @Autowired
    TicketService service;

    @GetMapping("/")
    public String tickets(Model model){
        Ticket ticket = service.getTicket(1L);
        model.addAttribute("ticket", ticket.toString());
        return "tickets";
    }
}
