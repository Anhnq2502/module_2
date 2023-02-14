package models;


public class Room extends Facility {
    String roomCode;
    String freeServiceIncluded;

    public Room(String serviceName, Double usableArea, Double rentalCost, int maximum, String rentalType, String roomCode, String freeServiceIncluded) {
        super(serviceName, usableArea, rentalCost, maximum, rentalType);
        this.roomCode = roomCode;
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return serviceName + "," + usableArea + "," + rentalCost + "," + maximum + "," + rentalType + "," + roomCode + "," + freeServiceIncluded;
    }
}