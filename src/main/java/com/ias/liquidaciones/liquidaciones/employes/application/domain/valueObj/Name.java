package com.ias.liquidaciones.liquidaciones.employes.application.domain.valueObj;

import jakarta.persistence.Column;
import org.apache.commons.lang3.Validate;

public class Name {
    @Column(name="name",length = 50)
    private String name;

    public Name(String name) {
        Validate.notNull(name,"El nombre no puede estar vacio.");
        Validate.isTrue(name.length() > 1,"El nombre no puede estar vacio");
        Validate.isTrue(name.length() < 50,"El nombre  maximo es de 50 caracteres");
        this.name = name;
    }

    public String getValue(){ return name; }

    @Override
    public String toString() {
        return name.toString();
    }

    protected Name() {
    }
}
