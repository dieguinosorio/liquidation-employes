package com.ias.liquidaciones.liquidaciones.employes.application.domain.valueObj;

import jakarta.persistence.Column;
import org.apache.commons.lang3.Validate;

public class Salary {
    @Column(name="salary",length = 50)
    private Float salary;

    public Salary(Float salary) {
        Validate.notNull(salary,"El cargo no puede estar vacio.");
        Validate.isTrue(salary >= 1000000,"El salario debe ser mayor o igual a SVML vigente");
        Validate.isTrue(salary <= 7000000,"El salario no puede superar 7 millones");
        this.salary = salary;
    }

    public Float getValue(){ return salary; }

    @Override
    public String toString() {
        return salary.toString();
    }

    protected Salary() {
    }
}
