/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.marcos.Entidades.CartaConcentimiento;

/**
 *
 * @author natsu
 */

@AllArgsConstructor
@NoArgsConstructor
public @Data class DTOCartaConcentimiento {
    
    private Long id;
    private String rutaArchivo;
    
    public static DTOCartaConcentimiento from(CartaConcentimiento carta) {
        
        var dtocarta = new DTOCartaConcentimiento();
        dtocarta.setId(carta.getId());
        dtocarta.setRutaArchivo(carta.getRutaArchivo());
        
        return dtocarta;
    }

}
