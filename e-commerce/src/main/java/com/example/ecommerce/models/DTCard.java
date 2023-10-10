package com.example.ecommerce.models;

import java.time.LocalDate;

public class DTCard {
    private Long number;
    private Integer cvv;
    private LocalDate expiryDate;

    public DTCard(Long number, Integer cvv, LocalDate expiryDate) {
        this.number = number;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    public DTCard() {
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}
