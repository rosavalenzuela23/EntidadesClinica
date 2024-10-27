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
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.time.LocalDate;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author natsu
 */
@Entity
@Table(name = "comentarios_sesion")
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public @Data class ComentarioSesion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Transient
    private int numeroSesion;
    
    @Column(name = "valoracion_fin")
    private byte valoracionFin; 
    
    @Column(name = "valoracion_inicio")
    private byte valoracionInicio;
    
    @Column(name = "aspecto_a_medir")
    private String aspectoAMedir;
    
    @JoinColumn(name = "id_sesion")
    @ManyToOne(fetch = FetchType.LAZY)
    private Sesion sesion;
    
}
