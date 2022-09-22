package com.yvault.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class userAddress {
    private String country;
    private String zipcode;
    private String staddress;
}
