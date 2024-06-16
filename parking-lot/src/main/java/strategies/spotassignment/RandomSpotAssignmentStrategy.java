package strategies.spotassignment;

import entity.ParkingFloor;
import entity.ParkingLot;
import entity.ParkingSpot;
import enumuration.Status;
import enumuration.VehicleType;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy {

    @Override
    public ParkingSpot assignSpot(ParkingLot parkingLot, VehicleType vehicleType) {
        for (ParkingFloor parkingFloor : parkingLot.getParkingFloors()) {
            for (ParkingSpot parkingSpot : parkingFloor.getParkingSpots()) {
                if (parkingSpot.getParkingStatus().equals(Status.AVAILABLE) && parkingSpot.getVehicleTypes().contains(vehicleType)) {
                    return parkingSpot;
                }
            }
        }
        return null;
    }
}
