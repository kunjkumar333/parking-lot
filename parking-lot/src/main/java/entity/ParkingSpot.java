package entity;

import enumuration.Status;
import enumuration.VehicleType;
import lombok.Data;

import java.util.List;

@Data
public class ParkingSpot extends BaseEntity{
    private String name;
    private Status parkingStatus;
    private List<VehicleType> vehicleTypes;
    private Vehicle parkedVehicle;
}
