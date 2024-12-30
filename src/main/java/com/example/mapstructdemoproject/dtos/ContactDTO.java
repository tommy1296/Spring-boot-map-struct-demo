package com.example.mapstructdemoproject.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private String contactNo;
}
