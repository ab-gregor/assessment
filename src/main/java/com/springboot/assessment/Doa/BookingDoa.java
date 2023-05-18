package com.springboot.assessment.Doa;

import com.springboot.assessment.Schema.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDoa extends JpaRepository<Booking,Integer> {
}
