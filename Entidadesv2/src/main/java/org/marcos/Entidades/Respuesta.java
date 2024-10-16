/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.marcos.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.itson.entidades.llaves.InstrumentoExpedienteLlave;

/**
 *
 * @author natsu
 */
@Entity
@Table(name = "evaluacion_instrumento")
@AllArgsConstructor
@NoArgsConstructor
public @Data class Respuesta {
    
    @EmbeddedId
    private InstrumentoExpedienteLlave id;
    
    @Column(name = "valoracion")
    private String valoracion;
    
    @Column(name = "ruta_archivo")
    private String rutaArchivo;
    
}
