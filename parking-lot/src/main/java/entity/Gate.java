package entity;

import lombok.Data;

@Data
public class Gate extends BaseEntity{

    private String name;
    private String type;
    private ParkingLot parkingLot;
    private Operator operator;
}
