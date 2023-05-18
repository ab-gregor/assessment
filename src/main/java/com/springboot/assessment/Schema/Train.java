package com.springboot.assessment.Schema;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Train {
    @Id
    int train_Number;

    String train_Name;
    String source,destination;

}