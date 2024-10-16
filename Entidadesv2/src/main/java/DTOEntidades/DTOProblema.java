/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author marco
 */
@AllArgsConstructor
@NoArgsConstructor
public @Data class DTOProblema {
     
    private Long id;
    

    private String descripcion;
    
    
    private  int intensidad;
    
   
    private String frecuencia;
    
    
    private byte afectacionFamiliar;
    
   
    private byte afectacionSalud;
    
  
    private byte afectacionPareja;
    
  
    private byte afectacionAmigos;
    
 
    private byte afectacionLaboral;
    
    
    private  byte afectacionEspiritual;
    
    private DTOSesion sesion;
}
