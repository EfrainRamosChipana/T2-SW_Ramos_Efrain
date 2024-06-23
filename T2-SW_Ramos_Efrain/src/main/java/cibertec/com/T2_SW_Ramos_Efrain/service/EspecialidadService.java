package cibertec.com.T2_SW_Ramos_Efrain.service;

import cibertec.com.T2_SW_Ramos_Efrain.model.bd.Especialidad;
import cibertec.com.T2_SW_Ramos_Efrain.repository.EspecialidadRepository;

import java.util.List;
import java.util.Optional;

public class EspecialidadService implements IEspecialidadService{
    private EspecialidadRepository especialidadRepository;
    @Override
    public List<Especialidad> listareEspecialidades() {
        return especialidadRepository.findAll();
    }

    @Override
    public Especialidad guardarEspecialidades(Especialidad especialidad) {
        return especialidadRepository.save(especialidad);
    }

    @Override
    public Optional<Especialidad> obtenerEspecialidadesxId(Integer id) {
        Optional<Especialidad> especialidad
                = especialidadRepository.findById(id);
        if(especialidad.isEmpty()){
            return Optional.empty();
        }
        return especialidad;
    }
}
