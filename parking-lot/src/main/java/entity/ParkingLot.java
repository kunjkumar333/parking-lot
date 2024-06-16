package entity;

import lombok.Data;

import java.util.List;

@Data
public class ParkingLot extends BaseEntity{
    private String address;
    private List<Gate> gates;
    private List<ParkingFloor> parkingFloors;
}
