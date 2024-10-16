/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author marco
 */
@NoArgsConstructor
@AllArgsConstructor
public @Data class DTOPsicologo {
    private List<DTOPaciente> pacientes;
    private List<DTOSesion> sesiones;
} 
