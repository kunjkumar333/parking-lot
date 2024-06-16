package dto;

import entity.Ticket;
import lombok.Data;

@Data
public class TicketResponse {

    private Ticket ticket;
}
