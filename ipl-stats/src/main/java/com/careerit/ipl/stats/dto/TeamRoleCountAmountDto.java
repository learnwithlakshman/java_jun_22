package com.careerit.ipl.stats.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamRoleCountAmountDto {

    private String teamName;
    private String role;
    private long count;
    private double totalAmount;

    public TeamRoleCountAmountDto(String teamName,String role,long count, double totalAmount) {
        this.teamName = teamName;
        this.role = role;
        this.totalAmount = totalAmount;
        this.count = count;
    }
}
