/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import lombok.Data;
import org.marcos.Entidades.Psicologo;

/**
 *
 * @author natsu
 */
public @Data class DTOInstrumento {
    private Long id;
    private String nombreInstrumento;
    private String rutaArchivo;
    private String textoArchivo;
    private DTOPsicologo psicologo;
}
