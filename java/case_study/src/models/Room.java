package models;


public class Room extends Facility {
    private String freeService;

    public Room(String serviceName, int usableArea, int rentalCosts, int maximumPeople, String rentalType, String freeService) {
        super(serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
