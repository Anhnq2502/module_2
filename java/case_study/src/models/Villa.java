package models;

public class Villa extends Facility {
    String roomStandard;
    Double swimmingPoolArea;
    int numberOfFloors;
    String villaCode;

    public Villa(String serviceName, Double usableArea, Double rentalCost, int maximum, String rentalType, String roomStandard, Double swimmingPoolArea, int numberOfFloors, String villaCode) {
        super(serviceName, usableArea, rentalCost, maximum, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
        this.villaCode = villaCode;
    }

    public String getVillaCode() {
        return villaCode;
    }

    public void setVillaCode(String villaCode) {
        this.villaCode = villaCode;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(Double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return serviceName + "," + usableArea + "," + rentalCost + "," + maximum + "," + rentalType + "," + roomStandard + "," + swimmingPoolArea + "," + numberOfFloors + "," + villaCode;
    }
}