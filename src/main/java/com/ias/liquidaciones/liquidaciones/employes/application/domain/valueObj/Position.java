package com.ias.liquidaciones.liquidaciones.employes.application.domain.valueObj;

import jakarta.persistence.Column;
import org.apache.commons.lang3.Validate;

public class Position {
    @Column(name="position",length = 50)
    private String position;

    public Position(String position) {
        Validate.notNull(position,"El cargo no puede estar vacio.");
        Validate.isTrue(position.toString().length() >= 10,"El cargo  minimo es de 10 caracteres");
        Validate.isTrue(position.toString().length() < 30,"El cargo  maximo es de 30 caracteres");
        this.position = position;
    }

    public String getValue(){ return position; }

    @Override
    public String toString() {
        return position.toString();
    }

    protected Position() {
    }
}
