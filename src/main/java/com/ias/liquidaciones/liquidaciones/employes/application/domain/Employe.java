package com.ias.liquidaciones.liquidaciones.employes.application.domain;

import com.ias.liquidaciones.liquidaciones.employes.application.domain.valueObj.*;

public class Employe {
    private final Id id;
    private final Name name;
    private final DocumentNumber documentNumber;
    private final StartDate startDate;
    private final Position position;
    private final Salary salary;
    private final DateUpdateSalary dateUpdateSalary;

    public Employe(Id id, Name name, DocumentNumber documentNumber, StartDate startDate, Position position, Salary salary, DateUpdateSalary dateUpdateSalary) {
        this.id = id;
        this.name = name;
        this.documentNumber = documentNumber;
        this.startDate = startDate;
        this.position = position;
        this.salary = salary;
        this.dateUpdateSalary = dateUpdateSalary;
    }

    public Id getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public DocumentNumber getDocumentNumber() {
        return documentNumber;
    }

    public StartDate getStartDate() {
        return startDate;
    }

    public Position getPosition() {
        return position;
    }

    public Salary getSalary() {
        return salary;
    }

    public DateUpdateSalary getDateUpdateSalary() {
        return dateUpdateSalary;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", name=" + name +
                ", documentNumber=" + documentNumber +
                ", startDate=" + startDate +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }
}
