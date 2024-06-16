package repository;

import entity.Gate;
import entity.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {

    public ParkingLot getParkingLotByGate(Gate gate) {
        return new ParkingLot();
    }

    private long lastCount = 0;
    private Map<Long, ParkingLot> parkingLots = new HashMap<>();

    public ParkingLot save(ParkingLot parkingLot) {
        parkingLot.setId(lastCount + 1);
        lastCount += 1;
        parkingLots.put(lastCount, parkingLot);
        return parkingLot;
    }
}
