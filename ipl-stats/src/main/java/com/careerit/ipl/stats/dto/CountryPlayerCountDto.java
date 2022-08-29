package com.careerit.ipl.stats.dto;

public class CountryPlayerCountDto {
    private String countryName;
    private String role;
    private int roleCount;

    public CountryPlayerCountDto(String countryName, String role, int roleCount) {
        this.countryName = countryName;
        this.role = role;
        this.roleCount = roleCount;
    }
}
