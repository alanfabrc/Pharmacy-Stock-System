package com.pharmacy.stock.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "controlled_medication")
public class ControlledMedication {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "controlled_id", nullable = false)
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

    public ControlledMedication() {
    }

    public ControlledMedication(String name, String code, Integer quantity, LocalDate validity) {
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.validity = validity;
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
}
