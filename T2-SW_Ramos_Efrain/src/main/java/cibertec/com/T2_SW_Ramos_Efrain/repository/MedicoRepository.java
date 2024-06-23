package cibertec.com.T2_SW_Ramos_Efrain.repository;

import cibertec.com.T2_SW_Ramos_Efrain.model.bd.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository
        extends JpaRepository<Medico, Integer> {
}
