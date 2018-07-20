package com.hcl.cnp.patientservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Tech Support on 7/20/2018.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

    private String id;
    private String firstName;
    private String lastName;

}
