package dto;

import entity.Gate;
import entity.ParkingFloor;
import lombok.Data;

import java.util.List;

@Data
public class ParkingLotResponse {
    private String name;
    private String address;
    private List<Gate> gates;
    private List<ParkingFloor> parkingFloors;
}
