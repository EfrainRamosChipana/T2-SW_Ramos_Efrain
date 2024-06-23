package cibertec.com.T2_SW_Ramos_Efrain.controller;

import cibertec.com.T2_SW_Ramos_Efrain.model.bd.Medico;
import cibertec.com.T2_SW_Ramos_Efrain.model.dto.DtoEntity;
import cibertec.com.T2_SW_Ramos_Efrain.model.dto.MedicoDto;
import cibertec.com.T2_SW_Ramos_Efrain.service.IMedicoService;
import cibertec.com.T2_SW_Ramos_Efrain.util.DtoUtil;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/medico")
public class MedicoController {
    private IMedicoService iMedicoService;

    @GetMapping("")
    public ResponseEntity<List<Medico>> listarMedico(){
        List<Medico> medicoDtoList = new ArrayList<>(iMedicoService.listarMedico());
        if(medicoDtoList.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(medicoDtoList, HttpStatus.OK);
    }

    @GetMapping("/dto")
    public ResponseEntity<List<DtoEntity>> listarMedicoDto(){
        List<DtoEntity> medicoDtoList = new ArrayList<>();
        medicoDtoList = iMedicoService.listarMedico()
                .stream()
                .map(x -> new DtoUtil().convertirADto(x, new MedicoDto()))
                .collect(Collectors.toList());
        if(medicoDtoList.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(medicoDtoList, HttpStatus.OK);
    }
}
