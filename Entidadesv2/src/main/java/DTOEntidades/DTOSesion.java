/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.marcos.Entidades.ComentarioSesion;
import org.marcos.Entidades.Problema;
import org.marcos.Entidades.Sesion;

/**
 *
 * @author 
 */
@AllArgsConstructor
@NoArgsConstructor
public @Data class DTOSesion {
    
    private Long id;
    private List<DTOComentarioSesion> comentarios;
    private Date fecha;
    private List<DTOProblema> problemasSesion;
    
    public static DTOSesion from(Sesion s) {
        var dto = new DTOSesion();
        
        dto.setId(s.getId());
        
        List<DTOComentarioSesion> comentarios = new LinkedList();
        List<DTOProblema> problemas = new LinkedList();
        
        for(ComentarioSesion c : s.getComentarios()) {
            comentarios.add(DTOComentarioSesion.from(c));
        }
        
        for(Problema p : s.getProblemasSesion()) {
            problemas.add(DTOProblema.from(p));
        }
        
        dto.setComentarios(comentarios);
        dto.setProblemasSesion(problemas);
        
        return dto;
    }
    
}
