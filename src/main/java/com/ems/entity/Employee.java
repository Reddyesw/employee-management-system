package com.ems.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Employee {

    // Primary Key - auto increments
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Employee Name
    @NotBlank(message = "Name is required")
    @Column(nullable = false)
    private String name;

    // Job Title
    @NotBlank(message = "Designation is required")
    @Column(nullable = false)
    private String designation;

    // Salary
    @NotNull(message = "Salary is required")
    @DecimalMin(value = "0.0", message = "Salary must be a positive number")
    @Column(nullable = false)
    private BigDecimal salary;

    // Age
    @NotNull(message = "Age is required")
    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 65, message = "Age must be under 65")
    @Column(nullable = false)
    private Integer age;
}
