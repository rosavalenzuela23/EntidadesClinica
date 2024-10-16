/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOEntidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author natsu
 */
@AllArgsConstructor
@NoArgsConstructor
public @Data class DTOEmpleado {
    private Long id;
    private String usuario;
    private String contrasenia;   
}
