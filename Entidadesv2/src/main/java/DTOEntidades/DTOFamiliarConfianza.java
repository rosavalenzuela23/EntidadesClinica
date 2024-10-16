/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import lombok.Data;
import org.marcos.Entidades.Parentesco;

/**
 *
 * @author natsu
 */
public @Data class DTOFamiliarConfianza {
    private Long id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Parentesco parentesco;
    private String telefono;
    private DTOExpediente expediente;
    
}
