package com.careerit.ipl.stats.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleCountAmountDto {
    private String role;
    private long count;
    private double amount;

    public RoleCountAmountDto(String role, long count, double amount) {
        this.role = role;
        this.count = count;
        this.amount = amount;
    }
}
