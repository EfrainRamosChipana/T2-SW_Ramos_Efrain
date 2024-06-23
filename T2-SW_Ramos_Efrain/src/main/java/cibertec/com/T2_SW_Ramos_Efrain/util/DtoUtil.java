package cibertec.com.T2_SW_Ramos_Efrain.util;

import cibertec.com.T2_SW_Ramos_Efrain.model.dto.DtoEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DtoUtil {

    public DtoEntity convertirADto(Object obj, DtoEntity mapper){
        return new ModelMapper().map(obj, mapper.getClass());
    }
    public Object convertirDtoAEntity(Object obj, DtoEntity mapper){
        return new ModelMapper().map(mapper, obj.getClass());
    }
}
