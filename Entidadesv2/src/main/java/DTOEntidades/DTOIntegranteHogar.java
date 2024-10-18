/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.marcos.Entidades.IntegranteHogar;
import org.marcos.Entidades.Parentesco;

/**
 *
 * @author natsu
 */
@AllArgsConstructor
@NoArgsConstructor
public @Data class DTOIntegranteHogar {
    private Long id;
    private String ocupacion;
    private String nombre;
    private String statusRelacion;
    private Date fechaNacimiento;
    private String parentesco;
    
    public static DTOIntegranteHogar from(IntegranteHogar ih) {
        var dto = new DTOIntegranteHogar();
        
        dto.setId(ih.getId());
        dto.setOcupacion(ih.getOcupacion());
        dto.setNombre(ih.getNombre());
        dto.setStatusRelacion(ih.getStatusRelacion());
        dto.setFechaNacimiento(ih.getFechaNacimiento());
        dto.setParentesco(ih.getParentesco());
        
        return dto;
    }
    
}
