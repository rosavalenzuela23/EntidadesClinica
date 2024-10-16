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
public class ComentarioSesion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter Long id;
    
    @Transient
    private @Getter int numeroSesion;
    
    @Column(name = "fecha_hora")
    private @Getter @Setter Date fecha;
    
    @Column(name = "valoracion_fin")
    private @Getter @Setter byte valoracionFin; 
    
    @Column(name = "valoracion_inicio")
    private @Getter @Setter byte valoracionInicio;
    
    @Column(name = "aspecto_a_medir")
    private @Getter @Setter String aspectoAMedir;
    
    @PrimaryKeyJoinColumn
    @ManyToOne(fetch = FetchType.LAZY)
    private @Getter Sesion sesion;
    
}
