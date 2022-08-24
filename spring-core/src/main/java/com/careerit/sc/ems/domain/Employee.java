package com.careerit.sc.ems.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employee")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long empno;
        private String name;
        private double salary;
}
