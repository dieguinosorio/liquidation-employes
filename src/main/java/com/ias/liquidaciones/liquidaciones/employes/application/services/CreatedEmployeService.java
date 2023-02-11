package com.ias.liquidaciones.liquidaciones.employes.application.services;

import com.ias.liquidaciones.liquidaciones.employes.application.models.Employe;
import com.ias.liquidaciones.liquidaciones.employes.application.ports.input.CreatedEmployeUseCase;
import com.ias.liquidaciones.liquidaciones.employes.application.ports.output.EmployeRepository;
import com.ias.liquidaciones.liquidaciones.infraestructure.models.employed.EmployeDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatedEmployeService implements CreatedEmployeUseCase {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    EmployeRepository employeRepository;


    @Override
    public EmployeDTO execute(EmployeDTO employeDTO) {
        Employe newEmploye = employeDTO.toUnsaveDomain();
        return modelMapper.map(employeRepository.save(newEmploye),EmployeDTO.class);
    }
}
