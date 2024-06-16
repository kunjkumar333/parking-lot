package strategies.spotassignment;

import entity.ParkingLot;
import entity.ParkingSpot;
import enumuration.VehicleType;

public interface SpotAssignmentStrategy {

    public ParkingSpot assignSpot(ParkingLot parkingLot, VehicleType vehicleType);
}
