package repository;

import entity.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {

    private long lastCount = 0;
    private Map<Long, Ticket> tickets = new HashMap<>();

    public Ticket save(Ticket ticket) {
        ticket.setId(lastCount + 1);
        lastCount += 1;
        tickets.put(lastCount, ticket);
        return ticket;
    }
}
