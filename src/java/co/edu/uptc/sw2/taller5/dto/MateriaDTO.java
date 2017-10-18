package co.edu.uptc.sw2.taller5.dto;

import java.util.List;
import java.util.ArrayList;

public class MateriaDTO {
    
    private Integer creditos;
    private Long id;
    private String nombre;
    private ProfesorDTO profesor;
    private List<HorarioDTO> horario;
    private CarreraDTO carrera;

    public MateriaDTO() {
        //constructor base
    }

    public MateriaDTO(Long id) {
        this.id = id;
    }
    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public List<HorarioDTO> getHorario(){
    	if(this.horario==null){
    		horario=new ArrayList<HorarioDTO>();
    	}
    	return horario;
    }  
    public void setHorario(List<HorarioDTO> horario){
    	this.horario=horario;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getCreditos() {
        return this.creditos;
    }
    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }
    public ProfesorDTO getProfesor() {
        return this.profesor;
    }
    public void setProfesor(ProfesorDTO profesor) {
        this.profesor = profesor;
    }
    public CarreraDTO getCarrera() {
        return this.carrera;
    }
    public void setCarrera(CarreraDTO carrera) {
        this.carrera = carrera;
    }

}
