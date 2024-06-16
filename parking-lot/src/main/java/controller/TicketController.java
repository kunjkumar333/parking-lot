package controller;

import dto.TicketRequest;
import dto.TicketResponse;
import entity.Ticket;
import service.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public TicketResponse createTicket(TicketRequest ticketRequest) {
        Ticket ticket = ticketService.createTicket(ticketRequest.getGate(), ticketRequest.getVehicle());
        TicketResponse ticketResponse = new TicketResponse();
        ticketResponse.setTicket(ticket);
        return ticketResponse;
    }
}
