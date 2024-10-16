/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author 
 */
@AllArgsConstructor
@NoArgsConstructor
public @Data class DTOSesion {
    
    private Long id;
    private List<DTOComentarioSesion> comentarios;
    private Date fecha;
    private List<Problema> problemasSesion;
    private DTOExpediente expediente;
    private DTOPsicologo psicologo;
}
