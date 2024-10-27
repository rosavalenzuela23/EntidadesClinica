/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.marcos.Entidades.ComentarioSesion;

/**
 *
 * @author natsu
 */
@AllArgsConstructor
@NoArgsConstructor
public @Data class DTOComentarioSesion {
    private Long id;
    private int numeroSesion;
    private byte valoracionFin;
    private byte valoracionInicio;
    private String aspectoAMedir;
    
    public static DTOComentarioSesion from(ComentarioSesion c) {
        var dto = new DTOComentarioSesion();
        
        dto.setId(c.getId());
        dto.setNumeroSesion(c.getNumeroSesion());
        dto.setValoracionFin(c.getValoracionFin());
        dto.setValoracionInicio(c.getValoracionInicio());
        dto.setAspectoAMedir(c.getAspectoAMedir());
        
        return dto;
    }
    
}
