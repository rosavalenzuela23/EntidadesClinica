/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import lombok.Data;
import org.marcos.Entidades.Expediente;
import org.marcos.Entidades.Paciente;
import org.marcos.Entidades.Psicologo;

/**
 *
 * @author natsu
 */
public @Data class DTORegistroExpediente {
    
    private Expediente expediente;
    private Psicologo psicologo;
    private Paciente paciente;
    
}
