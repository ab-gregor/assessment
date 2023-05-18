package com.springboot.assessment.Services;

import com.springboot.assessment.Doa.BookingDoa;
import com.springboot.assessment.Schema.Booking;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class BookingServiceImp implements BookingService{

    @Autowired
    private BookingDoa bookingDoa;
    @Override
    public String bookTrain(List<Booking> booking) {
        bookingDoa.saveAll(booking);
        return ("Booked SUccessfully");
    }

    @Override
    public Optional<Booking> getBookings(int user_id) {
        return bookingDoa.findById(user_id);
    }
}
