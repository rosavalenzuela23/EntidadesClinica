/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.entidades.llaves;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author natsu
 */
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public @Data class MedicamentoExpedienteLlave implements Serializable{
    
    /**
     * Se ve chistoso... 
     * TODO: cambiarle el id a las tablas para que coincidan con su nombre
     */
    
    @Column(name = "id_expediente")
    Long id_expediente;
    
    @Column(name = "id_medicamento")
    Long id_medicamento;
    
    
}
