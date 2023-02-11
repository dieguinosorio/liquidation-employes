package com.ias.liquidaciones.liquidaciones.employes.application.services;

import com.ias.liquidaciones.liquidaciones.employes.application.models.Employe;
import com.ias.liquidaciones.liquidaciones.employes.application.ports.input.QueryFindDocumentOrNameUseCase;
import com.ias.liquidaciones.liquidaciones.employes.application.ports.output.EmployeRepository;
import com.ias.liquidaciones.liquidaciones.infraestructure.models.employed.EmployeDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QueryFindDocumentOrNameService implements QueryFindDocumentOrNameUseCase {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    EmployeRepository employeRepository;
    @Override
    public List<EmployeDTO> execute(String strNameOrDocument) {
        List<Employe> arrList = employeRepository.queryByDocumentOrName(strNameOrDocument);
        return arrList.stream().map((employe)-> modelMapper.map(employe,EmployeDTO.class)).collect(Collectors.toList());
    }
}
