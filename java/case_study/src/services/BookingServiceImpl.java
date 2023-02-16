package services;

import models.Booking;
import utils.DataBooking;
import java.util.List;

public class BookingServiceImpl implements IBookingService {
    DataBooking dataBooking = new DataBooking();

    @Override
    public void addNewBooking() {

    }

    @Override
    public void displayListBooking() {
        List<Booking> bookingList;
        bookingList = dataBooking.readBooking();
        if (bookingList.isEmpty()) {
            System.out.println("Không có lịch book nào");
        } else {
            for (Booking i : dataBooking.readBooking()) {
                System.out.println(i);
            }
        }
    }
}
