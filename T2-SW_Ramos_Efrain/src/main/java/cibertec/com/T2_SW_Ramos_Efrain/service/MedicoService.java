package cibertec.com.T2_SW_Ramos_Efrain.service;

import cibertec.com.T2_SW_Ramos_Efrain.model.bd.Medico;
import cibertec.com.T2_SW_Ramos_Efrain.repository.MedicoRepository;

import java.util.List;

public class MedicoService implements IMedicoService{

    private MedicoRepository medicoRepository;

    @Override
    public List<Medico> listarMedico() {
        return medicoRepository.findAll();
    }
}
