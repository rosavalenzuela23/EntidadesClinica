/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.marcos.Entidades.FamiliarConfianza;
import org.marcos.Entidades.Parentesco;

/**
 *
 * @author natsu
 */
@AllArgsConstructor
@NoArgsConstructor
public @Data class DTOFamiliarConfianza {
    private Long id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String parentesco;
    private String telefono;
    
    public static DTOFamiliarConfianza from(FamiliarConfianza f) {
        var dto = new DTOFamiliarConfianza();
        
        dto.setId(f.getId());
        dto.setNombre(f.getNombre());
        dto.setApellidoPaterno(f.getApellidoPaterno());
        dto.setApellidoMaterno(f.getApellidoMaterno());
        dto.setParentesco(f.getParentesco());
        dto.setTelefono(f.getTelefono());
        
        return dto;
    } 
    
}
