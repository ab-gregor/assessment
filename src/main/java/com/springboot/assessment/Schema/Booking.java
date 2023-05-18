package com.springboot.assessment.Schema;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Booking {
    @Id
    @GeneratedValue
    int booking_id;
    int seat_no;
    String type;
    String source, destination;
    @OneToOne(fetch=FetchType.LAZY,optional= false)
    @JoinColumn(name="user_id",nullable = false)
    private User user;

    @OneToOne(fetch=FetchType.LAZY,optional= false)
    @JoinColumn(name="train_Number",nullable = false)
    private Train train;
}