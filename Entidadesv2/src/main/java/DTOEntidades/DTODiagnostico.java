/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.marcos.Entidades.Diagnostico;

/**
 *
 * @author natsu
 */
/**
 * 
 * @author 
 
@AllArgsConstructor
@NoArgsConstructor
public @Data class DTODiagnostico {

    private Long id;

    private String titulo;

    private String descripcion;
    
    public static DTODiagnostico from(Diagnostico d) {
        var dto = new DTODiagnostico();
        
        dto.setId(d.getId());
        dto.setDescripcion(d.getDescripcion());
        dto.setTitulo(d.getTitulo());
        
        return dto;
    }
    
}
*/