/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.marcos.Entidades.Instrumento;

/**
 *
 * @author natsu
 */
@AllArgsConstructor
@NoArgsConstructor
public @Data class DTOInstrumento {
    private Long id;
    private String nombreInstrumento;
    private String rutaArchivo;
    private String textoArchivo; //queda ver como le vamos a hacer para obtener el texto del archivo
    
    public static DTOInstrumento from(Instrumento i) {
        var dto = new DTOInstrumento();
        
        dto.setId(i.getId());
        dto.setNombreInstrumento(i.getNombreInstrumento());
        dto.setRutaArchivo(i.getRutaArchivo());
        dto.setTextoArchivo(i.getTextoArchivo());
        
        return dto;
    }
    
    
}
