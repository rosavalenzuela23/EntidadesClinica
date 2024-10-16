/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import java.util.Date;
import lombok.Data;
import org.marcos.Entidades.Sesion;

/**
 *
 * @author natsu
 */
public @Data class DTOComentarioSesion {
    private Long id;
    private int numeroSesion;
    private Date fecha;
    private byte valoracionFin;
    private byte valoracionInicio;
    private String aspectoAMedir;
    private DTOSesion sesion;
}
