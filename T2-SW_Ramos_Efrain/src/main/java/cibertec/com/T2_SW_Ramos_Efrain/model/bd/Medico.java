package cibertec.com.T2_SW_Ramos_Efrain.model.bd;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "medicos")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdMedico;
    @Column(name = "NomMedico")
    private String NomMedico;
    @Column(name = "ApeMedico")
    private String ApeMedico;
    @Column(name = "FechNacMedico")
    private Date FechNacMedico;
}
/* IdMedico 		INT NOT NULL AUTO_INCREMENT,
 NomMedico		VARCHAR(50) NOT NULL,
 ApeMedico 		VARCHAR(50) NOT NULL,
 FechNacMedico	DATE NOT NULL,
 PRIMARY KEY (IdMedico)*/