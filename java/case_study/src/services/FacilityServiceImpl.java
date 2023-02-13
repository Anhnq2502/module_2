package services;

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

    public void addRoom() {
        String roomCode;
        do {
            System.out.println("nhap ma phong theo SVRO-YYYY");
            roomCode = scanner.nextLine();
        } while (!regex.checkCodeRoomServiceRegex(roomCode));
        System.out.println("nhap ten dich vu");
        String serviceName = scanner.nextLine();
        System.out.println("nhap dien tich su dung");
        Double usableArea = null;
        boolean flagOfUsableArea;
        do {
            try {
                usableArea = Double.parseDouble(scanner.nextLine());
                flagOfUsableArea = true;
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap dien tich bang chu so");
                flagOfUsableArea = false;
            }
        } while (!flagOfUsableArea);
        System.out.println("nhap gia phong");
        Double rentalCost = null;
        boolean flagOfRentalCost;
        do {
            try {
                rentalCost = Double.parseDouble(scanner.nextLine());
                flagOfRentalCost = true;
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap gia tien bang chu so");
                flagOfRentalCost = false;
            }
        } while (!flagOfRentalCost);
        System.out.println("nhap so nguoi toi da");
        boolean flagOfPeople;
        int maximum = 0;
        do {
            try {
                maximum = Integer.parseInt(scanner.nextLine());
                flagOfPeople = true;
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap so nguoi bang chu so");
                flagOfPeople = false;
            }
        } while (!flagOfPeople);
        String chooseOfRentalType;
        String rentalType = null;
        do {
            System.out.println("vui long chon kieu thue\n" +
                    "1.thue theo ngay\n" +
                    "2.thue theo thang\n" +
                    "3.thue theo nam");
            chooseOfRentalType = scanner.nextLine();

            switch (chooseOfRentalType) {
                case "1":
                    rentalType = "thue theo ngay";
                    break;
                case "2":
                    rentalType = "thue theo thang";
                    break;
                case "3":
                    rentalType = "thue theo nam";
                    break;
                default:
                    System.out.println("vui long nhap lua chon tu 1 => 3");

            }
        } while (chooseOfRentalType.equals("123"));
        System.out.println("vui long chon dich vu mien phi di kem");
        String freeServiceIncluded = scanner.nextLine();

        System.out.println("nhap so lan da su dung 0 <=number<= 5");
        int count = 0;
        boolean flagOfCount;
        do {
            try {
                do {
                    count = Integer.parseInt(scanner.nextLine());
                    if (count > 5 || count < 1) {
                        System.out.println("vui long nhap dung yeu cau");
                    }
                } while (count > 5 || count < 1);

                flagOfCount = true;
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap so lan su dung bang so");
                flagOfCount = false;
            }
        } while (!flagOfCount);
        Room room = new Room(serviceName, usableArea, rentalCost, maximum, rentalType, roomCode, freeServiceIncluded);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(Constant.FILE_ROOM,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(room + "," + count+"\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
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
            System.out.println("nhap ma villa theo dinh dang SVVL-YYYY");
            villaCode = scanner.nextLine();
        } while (!regex.checkCodeVillaServiceRegex(villaCode));
        System.out.println("nhap ten dich vu");
        String serviceName = scanner.nextLine();
        System.out.println("nhap dien tich su dung");
        Double usableArea = null;
        boolean flagOfUsableArea;
        do {
            try {
                usableArea = Double.parseDouble(scanner.nextLine());
                flagOfUsableArea = true;
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap dien tich bang chu so");
                flagOfUsableArea = false;
            }
        } while (!flagOfUsableArea);
        System.out.println("nhap gia phong");
        Double rentalCost = null;
        boolean flagOfRentalCost;
        do {
            try {
                rentalCost = Double.parseDouble(scanner.nextLine());
                flagOfRentalCost = true;
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap gia tien bang chu so");
                flagOfRentalCost = false;
            }
        } while (!flagOfRentalCost);
        System.out.println("nhap so nguoi toi da");
        boolean flagOfPeople;
        int maximum = 0;
        do {
            try {
                maximum = Integer.parseInt(scanner.nextLine());
                flagOfPeople = true;
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap so nguoi bang chu so");
                flagOfPeople = false;
            }
        } while (!flagOfPeople);
        String chooseOfRentalType;
        String rentalType = null;
        do {
            System.out.println("vui long chon kieu thue \n" +
                    "1.thue theo ngay\n" +
                    "2.thue theo thang\n" +
                    "3.thue theo nam");
            chooseOfRentalType = scanner.nextLine();

            switch (chooseOfRentalType) {
                case "1":
                    rentalType = "thue theo ngay";
                    break;
                case "2":
                    rentalType = "thue theo thang";
                    break;
                case "3":
                    rentalType = "thue theo nam";
                    break;
                default:
                    System.out.println("vui long nhap lua chon tu 1 => 3");

            }
        } while ("123".equals(chooseOfRentalType));
        System.out.println("nhap tieu chuan phong");
        String roomStandard = scanner.nextLine();
        System.out.println("nhap dien tich ho boi");
        Double swimmingPoolArea = null;
        boolean flagOfSwimmingPoolArea;
        do {
            try {
                swimmingPoolArea = Double.parseDouble(scanner.nextLine());
                flagOfSwimmingPoolArea = true;
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap dien tich bang so");
                flagOfSwimmingPoolArea = false;
            }
        } while (!flagOfSwimmingPoolArea);
        System.out.println("nhap so tang");
        int numberOfFloor = 0;
        boolean flagOfFloor;
        do {
            try {
                numberOfFloor = Integer.parseInt(scanner.nextLine());
                flagOfFloor = true;
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap so tang bang so");
                flagOfFloor = false;
            }
        } while (!flagOfFloor);

        System.out.println("nhap so lan da su dung 0 <=number<= 5");
        int count = 0;
        boolean flagOfCount;
        do {
            try {
                do {
                    count = Integer.parseInt(scanner.nextLine());
                    if (count > 5 || count < 1) {
                        System.out.println("vui long nhap dung yeu cau");
                    }
                } while (count > 5 || count < 1);

                flagOfCount = true;
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap so lan su dung bang chu");
                flagOfCount = false;
            }
        } while (!flagOfCount);
        Villa villa =new Villa(serviceName, usableArea, rentalCost, maximum, rentalType, roomStandard, swimmingPoolArea, numberOfFloor, villaCode);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(Constant.FILE_VILLA,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(villa + "," + count+"\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void maintenance() {
        List<Facility> facilityList = new ArrayList<>();
        Map<Room,Integer> roomIntegerMap;
        Map<Villa,Integer> villaIntegerMap;
        try {
            roomIntegerMap =dataRoom.Read();
            villaIntegerMap =dataVilla.Read();
        }catch (IOException e){
            throw new RuntimeException(e);
        }

        for (Facility i : roomIntegerMap.keySet()) {
            if (roomIntegerMap.get(i)>= 5) {
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

    public void disPlayListRoom() {
        try {
            Map<Room, Integer> room = dataRoom.Read();
            for (Room i : room.keySet()) {
                System.out.println(i + "," + room.get(i));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void displayListVilla() {
        try {
            Map<Villa, Integer> villa = dataVilla.Read();
            for (Villa i : villa.keySet()) {
                System.out.println(i + "," + villa.get(i));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}