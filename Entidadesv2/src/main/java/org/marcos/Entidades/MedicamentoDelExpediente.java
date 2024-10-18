/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.marcos.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.itson.entidades.llaves.MedicamentoExpedienteLlave;

/**
 *
 * @author natsu
 */
@Entity
@Table(name = "medicamento_del_expediente")
@AllArgsConstructor
@NoArgsConstructor
public @Data class MedicamentoDelExpediente implements Serializable {
    
    @EmbeddedId
    private MedicamentoExpedienteLlave id;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("id_expediente")
    @JoinColumn(
     name = "id_expediente"
    )
    private Expediente expediente;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("id_medicamento")
    @JoinColumn(
            name = "id_medicamento"
    )
    private Medicamento medicamento;
    
    @Column(name = "dosis")
    private String dosis;
    
    @Column(name = "frecuencia")
    private String frecuencia;
    
}
