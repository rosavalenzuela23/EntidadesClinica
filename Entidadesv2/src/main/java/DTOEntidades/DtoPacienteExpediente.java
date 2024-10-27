/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import lombok.Data;
import org.marcos.Entidades.Expediente;
import org.marcos.Entidades.Paciente;

/**
 *
 * @author natsu
 */
public @Data class DtoPacienteExpediente {
    
    private Paciente paciente;
    private Expediente expediente;
    
}
