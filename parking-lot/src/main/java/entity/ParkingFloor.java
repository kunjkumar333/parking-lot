package entity;


import lombok.Data;

import java.util.List;

@Data
public class ParkingFloor extends BaseEntity{

    private Integer floorNumber;
    private List<ParkingSpot> parkingSpots;
}
