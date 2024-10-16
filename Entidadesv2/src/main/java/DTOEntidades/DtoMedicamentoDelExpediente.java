/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import lombok.Data;

/**
 *
 * @author natsu
 */
public @Data class DtoMedicamentoDelExpediente {
    private DTOMedicamento medicamento;
    private String dosis;
    private String frecuencia;
}
