/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.entidades.llaves;

import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.marcos.Entidades.Expediente;
import org.marcos.Entidades.Instrumento;
import org.marcos.Entidades.Psicologo;

/**
 *
 * @author natsu
 */
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public @Data class InstrumentoExpedienteLlave {
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_instrumento")
    private Instrumento instrumento;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_expediente")
    private Expediente expediente;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_psicologo")
    private Psicologo psicologo;
    
}
