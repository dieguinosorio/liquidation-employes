package com.ias.liquidaciones.liquidaciones.employes.application.domain.valueObj;

import jakarta.persistence.Column;
import org.apache.commons.lang3.Validate;

import java.util.Date;

public class DateUpdateSalary {
    @Column(name="date_update_salary")
    private Date dateUpdateSalary;

    public DateUpdateSalary(Date dateUpdateSalary) {
        this.dateUpdateSalary = dateUpdateSalary;
    }

    public Date getValue(){ return dateUpdateSalary; }

    @Override
    public String toString() {
        return dateUpdateSalary.toString();
    }

    protected DateUpdateSalary() {
    }
}
