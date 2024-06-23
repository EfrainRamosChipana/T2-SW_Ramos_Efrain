package cibertec.com.T2_SW_Ramos_Efrain.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MedicoDto implements DtoEntity{
    private Integer IdMedico;
    private String NomMedico;
    private String ApeMedico;
    private Date FechNacMedico;

}
/* IdMedico 		INT NOT NULL AUTO_INCREMENT,
 NomMedico		VARCHAR(50) NOT NULL,
 ApeMedico 		VARCHAR(50) NOT NULL,
 FechNacMedico	DATE NOT NULL,
 PRIMARY KEY (IdMedico)*/