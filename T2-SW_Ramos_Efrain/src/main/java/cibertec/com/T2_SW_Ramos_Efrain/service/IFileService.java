package cibertec.com.T2_SW_Ramos_Efrain.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IFileService {
    void guardarArchivo(MultipartFile archivo) throws Exception;

    void guardarArchivos(List<MultipartFile> archivosList) throws Exception;
}
