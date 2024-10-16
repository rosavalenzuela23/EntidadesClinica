/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import java.util.Date;
import lombok.Data;
import org.marcos.Entidades.Parentesco;

/**
 *
 * @author natsu
 */
public @Data class DTOIntegranteHogar {
    private Long id;
    private String ocupacion;
    private String nombre;
    private String statusRelacion;
    private Date fechaNacimiento;
    private Parentesco parentesco;
    private DTOExpediente expediente;
}