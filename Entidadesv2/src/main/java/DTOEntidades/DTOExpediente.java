/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import java.util.LinkedList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.marcos.Entidades.Expediente;
import org.marcos.Entidades.FamiliarConfianza;
import org.marcos.Entidades.IntegranteHogar;
import org.marcos.Entidades.MedicamentoDelExpediente;

/**
 *
 * @author natsu
 */
@AllArgsConstructor
@NoArgsConstructor
public @Data class DTOExpediente {
    
    private Long id;
    private String enfermedadPrevia;
    private String diagnostico;
    private String antecedentes;
    private String preguntaMagica;
    private String deseo;
    private List<DTOIntegranteHogar> integranteHogar;
    private List<DTOFamiliarConfianza> familiaresConfianza;
    private String motivoConsulta;
    private List<DtoMedicamentoDelExpediente> medicamentos;
    
    public static DTOExpediente from(Expediente exp) {
        
        var dtoExpediente = new DTOExpediente();
        
        dtoExpediente.setId(exp.getId());
        dtoExpediente.setEnfermedadPrevia(exp.getEnfermedadPrevia());
        
        dtoExpediente.setDeseo(exp.getDeseo());
        dtoExpediente.setDiagnostico(exp.getDiagnostico());
        
        dtoExpediente.setAntecedentes(exp.getAntecedentes());
        dtoExpediente.setPreguntaMagica(exp.getPreguntaMagica());
        
        List<DTOIntegranteHogar> integrantesHogar = new LinkedList();
        List<DTOFamiliarConfianza> familiares = new LinkedList();
        
        //hacer las listas de los dto
        
        for(FamiliarConfianza f : exp.getFamiliaresConfianza()) {
            familiares.add(DTOFamiliarConfianza.from(f));
        }
        
        for(IntegranteHogar ih : exp.getIntegranteHogar()) {
            integrantesHogar.add(DTOIntegranteHogar.from(ih));
        }
        
        
        dtoExpediente.setIntegranteHogar(integrantesHogar);
        dtoExpediente.setFamiliaresConfianza(familiares);
        //aqui termina el codigo de las listas
        
        dtoExpediente.setMotivoConsulta(exp.getMotivoConsulta());
        
        
        List<DtoMedicamentoDelExpediente> medicamentos = new LinkedList();
        //hacer la lista de los medicamentos;
        
        for(MedicamentoDelExpediente mde : exp.getMedicamentos()) {
            medicamentos.add(DtoMedicamentoDelExpediente.from(mde));
        }
        
        
        dtoExpediente.setMedicamentos(medicamentos);
        //Aqui termina la lista de los medicamentos
        
        return dtoExpediente;
    }
    
}
