package com.ias.liquidaciones.liquidaciones.employes.application.domain.valueObj;

import jakarta.persistence.Column;
import org.apache.commons.lang3.Validate;

public class DocumentNumber {
    @Column(name="document_number",length = 15)
    private String documentNumber;

    public DocumentNumber(String documentNumber) {
        Validate.notNull(documentNumber,"El numero de documento no puede estar vacio.");
        Validate.isTrue(documentNumber.length() >= 7,"El numero de documento  minimo es de 7 caracteres");
        Validate.isTrue(documentNumber.length() < 15,"El numero de documento  maximo es de 15 caracteres");
        this.documentNumber = documentNumber;
    }

    public String getValue(){ return documentNumber; }

    @Override
    public String toString() {
        return documentNumber.toString();
    }

    protected DocumentNumber() {
    }
}
