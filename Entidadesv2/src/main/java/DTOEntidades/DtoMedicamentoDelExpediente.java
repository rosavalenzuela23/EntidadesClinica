/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.marcos.Entidades.MedicamentoDelExpediente;

/**
 *
 * @author natsu
 */
@AllArgsConstructor
@NoArgsConstructor
public @Data class DtoMedicamentoDelExpediente {
    private DTOMedicamento medicamento;
    private String dosis;
    private String frecuencia;
    
    public static DtoMedicamentoDelExpediente from(MedicamentoDelExpediente mde) {
        var dto = new DtoMedicamentoDelExpediente();
        
        dto.setMedicamento(DTOMedicamento.from(mde.getMedicamento()));
        dto.setDosis(mde.getDosis());
        dto.setFrecuencia(mde.getFrecuencia());
        
        return dto;
    }
    
}
