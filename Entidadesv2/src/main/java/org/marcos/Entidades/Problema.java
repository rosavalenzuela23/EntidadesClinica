/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.marcos.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author natsu
 */
@Entity
@Table(name = "problemas")
@AllArgsConstructor
@NoArgsConstructor
public @Data class Problema {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter Long id;
    
    @Column(name = "descripcion")
    private @Getter @Setter String descripcion;
    
    @Column(name = "Intensidad")
    private @Getter @Setter int intensidad;
    
    @Column(name = "frecuencia")
    private @Getter @Setter String frecuencia;
    
    @Column(name = "afectacion_familiar")
    private @Getter @Setter byte afectacionFamiliar;
    
    @Column(name = "afectacion_salud")
    private @Getter @Setter byte afectacionSalud;
    
    @Column(name = "afectacion_pareja")
    private @Getter @Setter byte afectacionPareja;
    
    @Column(name = "afectacion_amigos")
    private @Getter @Setter byte afectacionAmigos;
    
    @Column(name = "afectacion_laboral")
    private @Getter @Setter byte afectacionLaboral;
    
    @Column(name = "afectacion_espiritual")
    private @Getter @Setter byte afectacionEspiritual;
    
    @Column(name = "afectacion_economico")
    private @Getter @Setter byte afectacionEconomico;
    
    @JoinColumn(name = "id_sesion")
    @ManyToOne(fetch = FetchType.LAZY)
    private Sesion sesion;
    
}
