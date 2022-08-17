package com.careerit.sc.di;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Employee {
        private Long empno;
        private String name;
        private double salary;
}
