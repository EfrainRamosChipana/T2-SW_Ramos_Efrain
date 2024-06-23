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
@Table(name = "especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdEspecialidad;
    @Column(name = "Titulo")
    private String Titulo;
    @Column(name = "Funcion")
    private String Funcion;
    @Column(name = "FechGraduacion")
    private Date FechGraduacion;
    @Column(name = "IdMedico")
    private String IdMedico;
}
/* IdEspecialidad 		INT NOT NULL AUTO_INCREMENT,
 Titulo 			VARCHAR(250) NOT NULL,
 Funcion 			VARCHAR(250) NOT NULL,
 FechGraduacion	DATE NOT NULL,
 IdMedico 			INT NOT NULL,
 PRIMARY KEY (IdEspecialidad),
 FOREIGN KEY (IdMedico) REFERENCES Medico(IdMedico)*/