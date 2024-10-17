/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.marcos.Entidades.Empleado;

/**
 *
 * @author natsu
 */
@AllArgsConstructor
@NoArgsConstructor
public @Data class DTOEmpleado {
    private Long id;
    private String usuario;
    
    public static DTOEmpleado from(Empleado e) {
        var dto = new DTOEmpleado();
        
        dto.setId(e.getId());
        dto.setUsuario(e.getUsuario());
        
        return dto;
    }
    
}
