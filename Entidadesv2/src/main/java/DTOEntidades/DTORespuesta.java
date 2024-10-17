/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.marcos.Entidades.Respuesta;

/**
 *
 * @author marco
 */
@AllArgsConstructor
@NoArgsConstructor
public @Data class DTORespuesta {
    private String valoracion;
    private String rutaArchivo;
    
    public static DTORespuesta from(Respuesta r) {
        var dto = new DTORespuesta();
        dto.setValoracion(r.getValoracion());
        dto.setRutaArchivo(r.getRutaArchivo());
        return dto;
    }
    
}
