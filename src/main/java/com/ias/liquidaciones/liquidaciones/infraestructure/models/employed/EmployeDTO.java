package com.ias.liquidaciones.liquidaciones.infraestructure.models.employed;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ias.liquidaciones.liquidaciones.employes.application.models.Employe;
import com.ias.liquidaciones.liquidaciones.employes.application.domain.valueObj.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

public class EmployeDTO {
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String documentNumber;
    @JsonFormat(pattern="yyyy/MM/dd")
    @Getter @Setter
    private Date startDate;
    @Getter @Setter
    private String position;
    @Getter @Setter
    private Float salary;

    @JsonFormat(pattern="yyyy/MM/dd")
    @Getter @Setter
    private Date dateUpdateSalary;

    public EmployeDTO(Long id, String name, String documentNumber, Date startDate, String position, Float salary ,Date dateUpdateSalary) {
        this.id = id;
        this.name = name;
        this.documentNumber = documentNumber;
        this.startDate = startDate;
        this.position = position;
        this.salary = salary;
        this.dateUpdateSalary = dateUpdateSalary;
    }

    public  Employe toUnsaveDomain(){
        return new Employe(new Id(null),
                new Name(name),
                new DocumentNumber(documentNumber),
                new StartDate(startDate),
                new Position(position),
                new Salary(salary),
                new DateUpdateSalary(null));
    }

    public EmployeDTO() {
    }


}
