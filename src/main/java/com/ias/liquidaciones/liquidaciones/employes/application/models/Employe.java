package com.ias.liquidaciones.liquidaciones.employes.application.models;

import com.ias.liquidaciones.liquidaciones.employes.application.domain.valueObj.*;
import com.ias.liquidaciones.liquidaciones.employes.application.domain.valueObj.Id;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="employes")
public class Employe {
    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Id id;

    @Embedded
    private Name name;

    @Embedded
    private DocumentNumber documentNumber;

    @Embedded
    private StartDate startDate;

    @Embedded
    private Position position;

    @Embedded
    private Salary salary;

    @Embedded
    private DateUpdateSalary dateUpdateSalary;
    public Employe(Id id, Name name, DocumentNumber documentNumber, StartDate startDate, Position position, Salary salary,DateUpdateSalary dateUpdateSalary) {
        this.id = id;
        this.name = name;
        this.documentNumber = documentNumber;
        this.startDate = startDate;
        this.position = position;
        this.salary = salary;
        this.dateUpdateSalary = dateUpdateSalary;
    }

    public Employe() {
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public DocumentNumber getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(DocumentNumber documentNumber) {
        this.documentNumber = documentNumber;
    }

    public StartDate getStartDate() {
        return startDate;
    }

    public void setStartDate(StartDate startDate) {
        this.startDate = startDate;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public DateUpdateSalary getDateUpdateSalary() {
        return dateUpdateSalary;
    }

    public void setDateUpdateSalary(DateUpdateSalary dateUpdateSalary) {
        this.dateUpdateSalary = dateUpdateSalary;
    }
}
