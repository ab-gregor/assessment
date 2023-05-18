package com.springboot.assessment.Schema;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    private int user_id;
   private String userName;

   private String password;

    private boolean isAdmin;
    @OneToOne(fetch= FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "user")
    private Booking booking;


}
