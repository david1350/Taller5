package co.edu.uptc.sw2.taller5.dto;

import java.util.List;
import java.util.ArrayList;

public class MatriculaDTO {

    private Long id;
    private Integer año;
    private Integer semestre;
    private EstudianteDTO estudiante;
    
    public MatriculaDTO() {
        //constructor base
    }

    public MatriculaDTO(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
       
    private List<MateriaDTO> materias;
    
    public List<MateriaDTO> getMaterias(){
    	if(this.materias==null){
    		materias=new ArrayList<MateriaDTO>();
    	}
    	return materias;
    }
    
    public void setMaterias(List<MateriaDTO> materias){
    	this.materias=materias;
    }

    public Integer getAño() {
        return this.año;
    }
    public void setAño(Integer año) {
        this.año = año;
    }
    public Integer getSemestre() {
        return this.semestre;
    }
    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }
    public EstudianteDTO getEstudiante() {
        return this.estudiante;
    }
    public void setEstudiante(EstudianteDTO estudiante) {
        this.estudiante = estudiante;
    }

}
