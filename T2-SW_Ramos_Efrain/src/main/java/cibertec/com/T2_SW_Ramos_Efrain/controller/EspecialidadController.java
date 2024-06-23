package cibertec.com.T2_SW_Ramos_Efrain.controller;

import cibertec.com.T2_SW_Ramos_Efrain.exception.ResourceNotFoundException;
import cibertec.com.T2_SW_Ramos_Efrain.model.bd.Especialidad;
import cibertec.com.T2_SW_Ramos_Efrain.service.EspecialidadService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/especialidad")
public class EspecialidadController {

    private EspecialidadService especialidadService;

    @GetMapping("")
    public ResponseEntity<List<Especialidad>> listarEspecialidades(){
        List<Especialidad> especialidadList = new ArrayList<>(especialidadService.listareEspecialidades());
        if(especialidadList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(especialidadList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Especialidad> obtenerEspecialidadXId(
            @PathVariable Integer id){
        Especialidad especialidad = especialidadService
                .obtenerEspecialidadesxId(id).orElseThrow(
                        () -> new ResourceNotFoundException("La especialidad con Id " +
                                id + " no existe"));
        return new ResponseEntity<>(especialidad, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Especialidad> registrarEspecialidad(
            @RequestBody Especialidad especialidad
    ){
        return new ResponseEntity<>(
                especialidadService.guardarEspecialidades(especialidad), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Especialidad> actualizarEspecialidad(
            @PathVariable Integer id,
            @RequestBody Especialidad especialidad
    ){
        Especialidad newEspecialidad = especialidadService.obtenerEspecialidadesxId(id)
                .orElseThrow(() -> new ResourceNotFoundException("La especialidad con Id "
                        + id +" no existe"));
        newEspecialidad.setTitulo(especialidad.getTitulo());
        newEspecialidad.setFuncion(especialidad.getFuncion());
        return new ResponseEntity<>(
                especialidadService.guardarEspecialidades(newEspecialidad),
                HttpStatus.OK);
    }
}
