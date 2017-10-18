package co.edu.uptc.sw2.taller5.dto;

import java.util.List;
import java.util.ArrayList;

public class CarreraDTO {
    
    private Long id;
    private String nombre;
    private FacultadDTO facultad;
    

    public CarreraDTO() {
        //constructor base
    }

    public CarreraDTO(Long id) {
        this.id = id;
    }
    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public FacultadDTO getFacultad() {
        return this.facultad;
    }
    public void setFacultad(FacultadDTO facultad) {
        this.facultad = facultad;
    }

}
