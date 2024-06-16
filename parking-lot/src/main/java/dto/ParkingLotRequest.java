package dto;

import lombok.Data;

@Data
public class ParkingLotRequest {
    private String address;
    private int numberOfFloors;
}
