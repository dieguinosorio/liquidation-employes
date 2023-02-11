package com.ias.liquidaciones.liquidaciones.infraestructure.controllers;

import com.ias.liquidaciones.liquidaciones.employes.application.services.CreatedEmployeService;
import com.ias.liquidaciones.liquidaciones.employes.application.services.QueryAllService;
import com.ias.liquidaciones.liquidaciones.employes.application.services.QueryFindDocumentOrNameService;
import com.ias.liquidaciones.liquidaciones.infraestructure.models.employed.EmployeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/employes")
@CrossOrigin(origins = { "http://localhost:4200" })
public class EmployedController {

    @Autowired
    private QueryAllService queryAllService;
    @Autowired
    private CreatedEmployeService createdEmployeService;

    @Autowired
    private QueryFindDocumentOrNameService  queryFindDocumentOrNameService;

    @GetMapping(value = "/all")
    public ResponseEntity<?> queryAllEmployed(){
        return new ResponseEntity<>(queryAllService.execute(1L), HttpStatus.OK);
    }

    @GetMapping(value = "/findNameOrDocument/{filter}")
    public ResponseEntity<?> queryNameOrDocument(@PathVariable(value="filter") String filter ){
        List<EmployeDTO> arrList = queryFindDocumentOrNameService.execute(filter);
        return new ResponseEntity<>(arrList, HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> queryAllEmployed(@RequestBody EmployeDTO  employeDTO){
        return new ResponseEntity<>(createdEmployeService.execute(employeDTO), HttpStatus.OK);
    }
}
