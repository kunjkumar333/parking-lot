package controller;

import dto.ParkingLotRequest;
import dto.ParkingLotResponse;
import entity.ParkingFloor;
import entity.ParkingLot;
import service.ParkingLotService;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotController {

    private ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    public ParkingLotResponse createParkingLot(ParkingLotRequest parkingLotRequest) {
        //check if floors are less than 2 then return
        List<ParkingFloor> parkingFloors = new ArrayList<>();
        for (int i = 0; i < parkingLotRequest.getNumberOfFloors(); ++i) {
            parkingFloors.add(new ParkingFloor());
        }
        ParkingLot createParkingLot = new ParkingLot();
        createParkingLot.setAddress(parkingLotRequest.getAddress());
        createParkingLot.setParkingFloors(parkingFloors);
        ParkingLot parkingLot = parkingLotService.createParkingLot(createParkingLot);
        ParkingLotResponse parkingLotResponse = new ParkingLotResponse();
        parkingLotResponse.setParkingFloors(parkingLot.getParkingFloors());
        parkingLotResponse.setAddress(parkingLot.getAddress());
        return parkingLotResponse;
    }
}
