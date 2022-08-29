package com.careerit.ipl.stats.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TeamsAmountDto {
    private String teamName;
    private double amount;

    public TeamsAmountDto(String teamName, double amount) {
        this.teamName = teamName;
        this.amount = amount;
    }
}
