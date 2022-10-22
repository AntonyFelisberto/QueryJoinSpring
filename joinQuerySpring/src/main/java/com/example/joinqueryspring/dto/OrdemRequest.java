package com.example.joinqueryspring.dto;

import com.example.joinqueryspring.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrdemRequest {

    private Customer customer;

}
