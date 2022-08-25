package com.careerit.ipl.stats.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class PlayerDto {
        private String name;
        private String role;
        private String teamLabel;
        private String country;
        private double amount;
}
