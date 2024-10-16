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
import jakarta.persistence.OneToOne;
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
@Table(name = "cartas_consentimiento")
@AllArgsConstructor
@NoArgsConstructor
public @Data class CartaConcentimiento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter Long id;
    
    @Column(name = "ruta_archivo")
    private @Getter @Setter String rutaArchivo;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_paciente")
    private @Getter Paciente paciente;
    
}
