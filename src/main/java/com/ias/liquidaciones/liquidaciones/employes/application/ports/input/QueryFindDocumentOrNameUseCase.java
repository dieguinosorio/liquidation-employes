package com.ias.liquidaciones.liquidaciones.employes.application.ports.input;

import com.ias.liquidaciones.liquidaciones.commons.UseCase;
import com.ias.liquidaciones.liquidaciones.infraestructure.models.employed.EmployeDTO;

import java.util.List;

public interface QueryFindDocumentOrNameUseCase extends UseCase<String, List<EmployeDTO>> {
}
