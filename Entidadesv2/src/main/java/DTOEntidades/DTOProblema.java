/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.marcos.Entidades.Problema;

/**
 *
 * @author marco
 */
@AllArgsConstructor
@NoArgsConstructor
public @Data
class DTOProblema {

    private Long id;
    private String descripcion;
    private int intensidad;
    private String frecuencia;
    private byte afectacionFamiliar;
    private byte afectacionSalud;
    private byte afectacionPareja;
    private byte afectacionAmigos;
    private byte afectacionLaboral;
    private byte afectacionEspiritual;
    private byte afectacionEconomico;

    public static DTOProblema from(Problema p) {
        var dto = new DTOProblema();
        
        dto.setId(p.getId());
        dto.setDescripcion(p.getDescripcion());
        dto.setIntensidad(p.getIntensidad());
        dto.setFrecuencia(p.getFrecuencia());
        dto.setAfectacionFamiliar(p.getAfectacionFamiliar());
        dto.setAfectacionSalud(p.getAfectacionSalud());
        dto.setAfectacionPareja(p.getAfectacionPareja());
        dto.setAfectacionAmigos(p.getAfectacionAmigos());
        dto.setAfectacionLaboral(p.getAfectacionLaboral());
        dto.setAfectacionEspiritual(p.getAfectacionEspiritual());
        dto.setAfectacionEconomico(p.getAfectacionEconomico());
        return dto;
    }
    
    
}
