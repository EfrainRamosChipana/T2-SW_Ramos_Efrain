package cibertec.com.T2_SW_Ramos_Efrain.exception;

public class ResourceNotFoundException extends  RuntimeException{
    public ResourceNotFoundException(String mensaje){
        super(mensaje);
    }
}
