/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.marcos.Entidades.EstadoCivil;
import org.marcos.Entidades.TipoVivienda;

/**
 *
 * @author marco
 */
@AllArgsConstructor
@NoArgsConstructor
public @Data class DTOPaciente {
    private Long id;
    private String telefonoEmergencia;
    private String telefono;
    private String escolaridad;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private EstadoCivil estadoCivil;
    private TipoVivienda tipoVivienda;
    private List<DTOPsicologo> psicologos;
    private DTOExpediente expediente;
    private DTOCartaConcentimiento carta;
}
