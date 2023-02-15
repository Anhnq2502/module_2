package services;

import controllers.FacilityController;
import models.Facility;
import models.Room;
import models.Villa;
import utils.DataRoom;
import utils.DataVilla;
import utils.Constant;
import utils.Regex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    Scanner scanner = new Scanner(System.in);
    Regex regex = new Regex();
    DataRoom dataRoom = new DataRoom();
    DataVilla dataVilla = new DataVilla();

    @Override
    public void displayListFacility() {

        do {
            System.out.println("Menu \n" +
                "1.Display list room \n" +
                "2.Display list villa \n" +
                "3.Back to menu \n");
            String select = scanner.nextLine();
            switch (select) {
                case "1":
                    displayListRoom();
                    break;
                case "2":
                    displayListVilla();
                    break;
                case "3":
                    FacilityController.facilityManagement();
                    break;
                default:
                    System.out.println("Chỉ nhập từ 1-3");
            }
        } while (true);
    }

    @Override
    public void addNewFacility() {

        do {
            System.out.println("Menu \n" +
                "1.Add new villa \n" +
                "2.add new room \n" +
                "3.Back to menu \n");
            String select = scanner.nextLine();
            switch (select) {
                case "1":
                    addVilla();
                    break;
                case "2":
                    addRoom();
                    break;
                case "3":
                    FacilityController.facilityManagement();
                    break;
                default:
                    System.out.println("Chỉ nhập từ 1-3");
            }
        } while (true);
    }

    @Override
    public void displayListFacilityMaintenance() {
        List<Facility> facilityList = new ArrayList<>();
        Map<Room, Integer> roomIntegerMap;
        Map<Villa, Integer> villaIntegerMap;
        try {
            roomIntegerMap = dataRoom.Read();
            villaIntegerMap = dataVilla.Read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Facility i : roomIntegerMap.keySet()) {
            if (roomIntegerMap.get(i) >= 5) {
                facilityList.add(i);
            }
        }
        for (Facility i : villaIntegerMap.keySet()) {
            if (villaIntegerMap.get(i) >= 5) {
                facilityList.add(i);
            }
        }
        System.out.println(facilityList);
    }

    public void addRoom() {
        String roomCode;
        do {
            System.out.println("Nhập mã phòng theo kiểu SVRO-YYYY");
            roomCode = scanner.nextLine();
        } while (!regex.checkCodeRoomServiceRegex(roomCode));
        System.out.println("Nhập tên dịch vụ");
        String serviceName = scanner.nextLine();
        System.out.println("Nhập diện tích sửa dụng");
        Double usableArea = null;
        boolean flagOfUsableArea;
        do {
            try {
                usableArea = Double.parseDouble(scanner.nextLine());
                flagOfUsableArea = true;
            } catch (NumberFormatException e) {
                System.out.println("Nhập diện tích bằng chữ số");
                flagOfUsableArea = false;
            }
        } while (!flagOfUsableArea);
        System.out.println("Nhập giá phòng");
        Double rentalCost = null;
        boolean flagOfRentalCost;
        do {
            try {
                rentalCost = Double.parseDouble(scanner.nextLine());
                flagOfRentalCost = true;
            } catch (NumberFormatException e) {
                System.out.println("Nhập giá tiền bằng chữ số");
                flagOfRentalCost = false;
            }
        } while (!flagOfRentalCost);
        System.out.println("Nhập số người tối đa");
        boolean flagOfPeople;
        int maximum = 0;
        do {
            try {
                maximum = Integer.parseInt(scanner.nextLine());
                flagOfPeople = true;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số người bằng chữ số");
                flagOfPeople = false;
            }
        } while (!flagOfPeople);
        String chooseOfRentalType;
        String rentalType = null;
        do {
            System.out.println("Chọn kiểu thuê\n" +
                    "1.Thuê theo ngày\n" +
                    "2.Thuê theo tháng\n" +
                    "3.Thuê theo năm");
            chooseOfRentalType = scanner.nextLine();

            switch (chooseOfRentalType) {
                case "1":
                    rentalType = "Thuê theo ngày";
                    break;
                case "2":
                    rentalType = "Thuê theo tháng";
                    break;
                case "3":
                    rentalType = "Thuê theo năm";
                    break;
                default:
                    System.out.println("Chỉ chọn từ 1 - 3");

            }
        } while (chooseOfRentalType.equals("123"));
        System.out.println("Chọn dịch vụ miễn phí đi kèm");
        String freeServiceIncluded = scanner.nextLine();

        System.out.println("Nhập số lần đã sử dụng 0 <= number <= 5");
        int count = 0;
        boolean flagOfCount;
        do {
            try {
                do {
                    count = Integer.parseInt(scanner.nextLine());
                    if (count > 5 || count < 1) {
                        System.out.println("Cần phải nhập đúng yêu cầu");
                    }
                } while (count > 5 || count < 1);

                flagOfCount = true;
            } catch (NumberFormatException e) {
                System.out.println("Chỉ được nhập số lần sử dụng bằng số");
                flagOfCount = false;
            }
        } while (!flagOfCount);
        Room room = new Room(serviceName, usableArea, rentalCost, maximum, rentalType, roomCode, freeServiceIncluded);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(Constant.FILE_ROOM, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(room + "," + count + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void addVilla() {
        String villaCode;
        do {
            System.out.println("Nhập mã villa theo định dạng SVVL-YYYY");
            villaCode = scanner.nextLine();
        } while (!regex.checkCodeVillaServiceRegex(villaCode));
        System.out.println("Nhập tên dịch vụ");
        String serviceName = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        Double usableArea = null;
        boolean flagOfUsableArea;
        do {
            try {
                usableArea = Double.parseDouble(scanner.nextLine());
                flagOfUsableArea = true;
            } catch (NumberFormatException e) {
                System.out.println("Chỉ được nhập số");
                flagOfUsableArea = false;
            }
        } while (!flagOfUsableArea);
        System.out.println("Nhập giá phòng");
        Double rentalCost = null;
        boolean flagOfRentalCost;
        do {
            try {
                rentalCost = Double.parseDouble(scanner.nextLine());
                flagOfRentalCost = true;
            } catch (NumberFormatException e) {
                System.out.println("Chỉ được nhập số");
                flagOfRentalCost = false;
            }
        } while (!flagOfRentalCost);
        System.out.println("Nhập số người tối đa");
        boolean flagOfPeople;
        int maximum = 0;
        do {
            try {
                maximum = Integer.parseInt(scanner.nextLine());
                flagOfPeople = true;
            } catch (NumberFormatException e) {
                System.out.println("Chỉ được nhập số");
                flagOfPeople = false;
            }
        } while (!flagOfPeople);
        String chooseOfRentalType;
        String rentalType = null;
        do {
            System.out.println("Chọn kiểu thuê \n" +
                    "1.Thuê theo ngày\n" +
                    "2.Thuê theo tháng\n" +
                    "3.Thuê theo năm");
            chooseOfRentalType = scanner.nextLine();

            switch (chooseOfRentalType) {
                case "1":
                    rentalType = "Thuê theo ngày";
                    break;
                case "2":
                    rentalType = "Thuê theo tháng";
                    break;
                case "3":
                    rentalType = "Thuê theo năm";
                    break;
                default:
                    System.out.println("Chỉ nhập từ 1 - 3");

            }
        } while ("123".equals(chooseOfRentalType));
        System.out.println("Nhập tiêu chuẩn phòng");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi");
        Double swimmingPoolArea = null;
        boolean flagOfSwimmingPoolArea;
        do {
            try {
                swimmingPoolArea = Double.parseDouble(scanner.nextLine());
                flagOfSwimmingPoolArea = true;
            } catch (NumberFormatException e) {
                System.out.println("Chỉ được nhập số");
                flagOfSwimmingPoolArea = false;
            }
        } while (!flagOfSwimmingPoolArea);
        System.out.println("Nhập số tầng");
        int numberOfFloor = 0;
        boolean flagOfFloor;
        do {
            try {
                numberOfFloor = Integer.parseInt(scanner.nextLine());
                    flagOfFloor = true;
            } catch (NumberFormatException e) {
                System.out.println("Chỉ được nhập số");
                flagOfFloor = false;
            }
        } while (!flagOfFloor);

        System.out.println("Nhập số lần đã sử dụng 0 <= number <= 5");
        int count = 0;
        boolean flagOfCount;
        do {
            try {
                do {
                    count = Integer.parseInt(scanner.nextLine());
                    if (count > 5 || count < 1) {
                        System.out.println("Phải nhập đúng yêu cầu");
                    }
                } while (count > 5 || count < 1);

                flagOfCount = true;
            } catch (NumberFormatException e) {
                System.out.println("Chỉ được nhập số");
                flagOfCount = false;
            }
        } while (!flagOfCount);
        Villa villa = new Villa(serviceName, usableArea, rentalCost, maximum, rentalType, roomStandard, swimmingPoolArea, numberOfFloor, villaCode);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(Constant.FILE_VILLA, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(villa + "," + count + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void displayListRoom() {
        try {
            Map<Room, Integer> room = dataRoom.Read();
            if (dataRoom.Read().isEmpty()){
                System.out.println("Không có phòng nào");
            }else {
                for (Room i : room.keySet()) {
                    System.out.println(i + "," + room.get(i));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void displayListVilla() {
        try {
            Map<Villa, Integer> villa = dataVilla.Read();
            if (dataVilla.Read().isEmpty()){
                System.out.println("Không có phòng nào");
            }else {
                for (Villa i : villa.keySet()) {
                    System.out.println(i + "," + villa.get(i));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}