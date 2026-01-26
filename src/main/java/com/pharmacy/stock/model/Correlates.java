package com.pharmacy.stock.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.pharmacy.stock.enums.CorrelateTypesEnum;
import jakarta.persistence.*;
import org.hibernate.annotations.IdGeneratorType;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "correlates")
public class Correlates {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "correlates_id", nullable = false)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "code", nullable = false, unique = true)
    private String code;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "validity", nullable = false, columnDefinition = "TEXT")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate validity;

    @Column(name = "correlate_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private CorrelateTypesEnum correlatesType;
}
