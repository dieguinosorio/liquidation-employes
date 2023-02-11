package com.ias.liquidaciones.liquidaciones.employes.application.services;

import com.ias.liquidaciones.liquidaciones.employes.application.models.Employe;
import com.ias.liquidaciones.liquidaciones.employes.application.ports.input.QueryAllEmployeUseCase;
import com.ias.liquidaciones.liquidaciones.employes.application.ports.output.EmployeRepository;
import com.ias.liquidaciones.liquidaciones.infraestructure.models.employed.EmployeDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QueryAllService implements QueryAllEmployeUseCase {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private EmployeRepository employeRepository;

    @Override
    public List<EmployeDTO> execute(Long aLong) {
        List<Employe>  listEmployes = employeRepository.findAll();
        return listEmployes.stream().map((employe)-> modelMapper.map(employe,EmployeDTO.class)).collect(Collectors.toList());
    }
}
