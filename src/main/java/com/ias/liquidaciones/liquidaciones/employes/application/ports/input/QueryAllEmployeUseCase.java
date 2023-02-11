package com.ias.liquidaciones.liquidaciones.employes.application.ports.input;

import com.ias.liquidaciones.liquidaciones.commons.UseCase;
import com.ias.liquidaciones.liquidaciones.infraestructure.models.employed.EmployeDTO;

import java.util.List;

public interface QueryAllEmployeUseCase extends UseCase<Long, List<EmployeDTO>> {
}
