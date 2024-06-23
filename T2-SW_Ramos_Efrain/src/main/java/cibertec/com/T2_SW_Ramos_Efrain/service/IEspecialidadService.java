package cibertec.com.T2_SW_Ramos_Efrain.service;


import cibertec.com.T2_SW_Ramos_Efrain.model.bd.Especialidad;

import java.util.List;
import java.util.Optional;

public interface IEspecialidadService {
    List<Especialidad> listareEspecialidades();
    Especialidad guardarEspecialidades(Especialidad especialidad);
    Optional<Especialidad> obtenerEspecialidadesxId(Integer id);
}
