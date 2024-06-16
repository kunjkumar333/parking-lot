package dto;

import entity.Gate;
import entity.Vehicle;
import lombok.Data;

@Data
public class TicketRequest {

    private Vehicle vehicle;
    private Gate gate;
}
