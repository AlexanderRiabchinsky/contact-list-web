package com.example.reportweb;

import lombok.Data;
import lombok.experimental.FieldNameConstants;

@Data
@FieldNameConstants
public class Contact {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
}
