package com.springboot.assessment.Services;

import com.springboot.assessment.Schema.Booking;

import java.util.List;
import java.util.Optional;

public interface BookingService {

    String bookTrain(List<Booking> booking);
    Optional<Booking> getBookings(int user_id);

}
