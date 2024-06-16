package entity;

import enumuration.VehicleType;
import lombok.Data;

@Data
public class Vehicle extends BaseEntity{
    private String number;
    private VehicleType vehicleType;
}
