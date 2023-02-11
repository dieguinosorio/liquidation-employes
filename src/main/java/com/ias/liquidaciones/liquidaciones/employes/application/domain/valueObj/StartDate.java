package com.ias.liquidaciones.liquidaciones.employes.application.domain.valueObj;

import jakarta.persistence.Column;
import org.apache.commons.lang3.Validate;

import java.util.Date;

public class StartDate {
    @Column(name="start_date",nullable = false)
    private Date startDate;

    public StartDate(Date startDate) {
        Validate.notNull(startDate,"La fecha de inicio no puede estar vacia.");
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    @Override
    public String toString() {
        return startDate.toString();
    }

    private StartDate() {
    }
}
