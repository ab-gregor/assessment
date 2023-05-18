package com.springboot.assessment.Controllers;

import com.springboot.assessment.Schema.Booking;
import com.springboot.assessment.Services.BookingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

public class BookingController {

    private BookingService bookingService;

    @PostMapping("/bookTrain")
    public String bookTrain(List<Booking> bookings)
    {
        return bookingService.bookTrain(bookings);
    }

    @GetMapping("getBookings/{user_id}")
    public Optional<Booking>  getBookings(@PathVariable int user_id)
    {
        return bookingService.getBookings(user_id);
    }
}
