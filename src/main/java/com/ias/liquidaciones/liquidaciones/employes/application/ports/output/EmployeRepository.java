package com.ias.liquidaciones.liquidaciones.employes.application.ports.output;

import com.ias.liquidaciones.liquidaciones.employes.application.models.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EmployeRepository extends JpaRepository<Employe,Long> {
    @Query(nativeQuery = true, value = "select * from employes where (name= ?1 or document_number =?1)")
    public List<Employe> queryByDocumentOrName(String value);
}
