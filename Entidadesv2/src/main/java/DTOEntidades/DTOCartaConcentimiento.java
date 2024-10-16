/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.marcos.Entidades.CartaConcentimiento;
import org.marcos.Entidades.Paciente;

/**
 *
 * @author natsu
 */

@AllArgsConstructor
@NoArgsConstructor
public @Data class DTOCartaConcentimiento {   
    private Long id;
    private String rutaArchivo;
    private DTOPaciente paciente;
}
