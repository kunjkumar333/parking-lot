package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ticket extends BaseEntity{
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Operator operator;
    private Gate gate;
}
