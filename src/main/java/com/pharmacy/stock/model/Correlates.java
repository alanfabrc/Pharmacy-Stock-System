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

    public Correlates() {
    }

    public Correlates(String name, String code, Integer quantity, LocalDate validity, CorrelateTypesEnum correlatesType) {
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.validity = validity;
        this.correlatesType = correlatesType;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDate getValidity() {
        return validity;
    }

    public void setValidity(LocalDate validity) {
        this.validity = validity;
    }

    public CorrelateTypesEnum getCorrelatesType() {
        return correlatesType;
    }

    public void setCorrelatesType(CorrelateTypesEnum correlatesType) {
        this.correlatesType = correlatesType;
    }
}
