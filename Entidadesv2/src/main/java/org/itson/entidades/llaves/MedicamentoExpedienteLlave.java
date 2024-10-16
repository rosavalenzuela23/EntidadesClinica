/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.entidades.llaves;

import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.marcos.Entidades.Expediente;
import org.marcos.Entidades.Medicamento;

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
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(
     name = "id_expediente"
    )
    private Expediente expediente;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(
            name = "id_medicamento"
    )
    private Medicamento medicamento;
    
}
