/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import java.util.List;
import lombok.Data;

/**
 *
 * @author natsu
 */
public @Data class DTOMedicamento {
    private Long id;
    private String nombre;
    private String descripcion;
    private List<DtoMedicamentoDelExpediente> expedientes;
}
