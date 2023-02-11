package com.ias.liquidaciones.liquidaciones.employes.application.domain.valueObj;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Id {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmploye;

    public Id(Long idEmploye) {
        this.idEmploye = idEmploye;
    }

    public Long getIdServDetail() {
        return idEmploye;
    }

    @Override
    public String toString() {
        return idEmploye.toString();
    }

    protected Id(){}
}
