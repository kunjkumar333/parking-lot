package repository;

import entity.ParkingSpot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSpotRepository {
    private Long lastCount = 0l;
    private Map<Long, ParkingSpot> parkingSpots = new HashMap<>();

    public ParkingSpot save(ParkingSpot parkingSpot) {
        lastCount += 1;
        parkingSpot.setId(lastCount);
        parkingSpots.put(lastCount, parkingSpot);
        return parkingSpot;
    }
}
