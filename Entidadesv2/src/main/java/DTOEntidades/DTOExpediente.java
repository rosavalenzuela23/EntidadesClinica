/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import java.util.List;
import lombok.Data;
import org.marcos.Entidades.Paciente;

/**
 *
 * @author natsu
 */
public @Data class DTOExpediente {
    
    private Long id;
    private String enfermedadPrevia;
    private DTODiagnostico diagnostico;
    private String antecedentes;
    private String preguntaMagica;
    private List<DTOIntegranteHogar> integranteHogar;
    private List<DTOFamiliarConfianza> familiaresConfianza;
    private String motivoConsulta;
    private DTOPaciente paciente;
    private List<DtoMedicamentoDelExpediente> medicamentos;
    
}
