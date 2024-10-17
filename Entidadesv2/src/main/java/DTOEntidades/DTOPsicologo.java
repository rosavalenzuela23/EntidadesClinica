/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.marcos.Entidades.Psicologo;

/**
 *
 * @author marco
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public @Data class DTOPsicologo extends DTOEmpleado {
    private List<DTOPaciente> pacientes;
    private List<DTOSesion> sesiones;
    
    public static DTOPsicologo from(Psicologo p) {
        var dto = new DTOPsicologo();
        
        dto.setId(p.getId());
        dto.setUsuario(p.getUsuario());
        
        return dto;
    }
    
} 
