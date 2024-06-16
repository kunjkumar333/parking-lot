package service;

import entity.Gate;
import entity.ParkingSpot;
import entity.Ticket;
import entity.Vehicle;
import enumuration.Status;
import repository.ParkingLotRepository;
import repository.ParkingSpotRepository;
import repository.TicketRepository;
import strategies.spotassignment.SpotAssignmentStrategy;

import java.util.Date;

public class TicketService {

    private ParkingSpotRepository parkingSpotRepository;
    private ParkingLotRepository parkingLotRepository;
    private SpotAssignmentStrategy spotAssignmentStrategy;
    private TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository, SpotAssignmentStrategy spotAssignmentStrategy, ParkingLotRepository parkingLotRepository,
                         ParkingSpotRepository parkingSpotRepository) {
        this.ticketRepository = ticketRepository;
        this.spotAssignmentStrategy = spotAssignmentStrategy;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public Ticket createTicket(Gate gate, Vehicle vehicle) {
        ParkingSpot parkingSpot = spotAssignmentStrategy.assignSpot(parkingLotRepository.getParkingLotByGate(gate), vehicle.getVehicleType());
        Ticket ticket = Ticket.builder()
                .operator(gate.getOperator())
                .gate(gate)
                .entryTime(new Date())
                .vehicle(vehicle)
                .parkingSpot(parkingSpot)
                .build();

        parkingSpot.setParkingStatus(Status.FILLED);
        parkingSpotRepository.save(parkingSpot);
        return ticketRepository.save(ticket);
    }
}
