
import repository.ParkingLotRepository;
import repository.ParkingSpotRepository;
import repository.TicketRepository;
import service.TicketService;
import strategies.spotassignment.RandomSpotAssignmentStrategy;
import strategies.spotassignment.SpotAssignmentStrategy;

public class Main {

    public static void main(String[] args) {
        /*Registry Design Pattern Example*/
        /*in the starting of application, registry will store object and when ever any service or any class requires
        it will give*/
        ObjectRegistry objectRegistry = new ObjectRegistry();
        objectRegistry.register("ticketRepository", new TicketRepository());
        objectRegistry.register("parkingLotRepository", new ParkingLotRepository());
        objectRegistry.register("parkingSpotRepository", new ParkingSpotRepository());
        objectRegistry.register("spotAssignmentStrategy", new RandomSpotAssignmentStrategy());

        objectRegistry.register("ticketService", new TicketService(
                (TicketRepository) objectRegistry.get("ticketRepository"),
                (SpotAssignmentStrategy) objectRegistry.get("spotAssignmentStrategy"),
                (ParkingLotRepository) objectRegistry.get("parkingLotRepository"),
                (ParkingSpotRepository) objectRegistry.get("parkingSpotRepository"))
        );


    }
}
