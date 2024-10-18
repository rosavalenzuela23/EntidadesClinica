/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.marcos.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author natsu
 */
@Entity
@Table(name = "psicologos")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public @Data class Psicologo extends Empleado{
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "pacientes_psicologos",
        joinColumns = @JoinColumn(name = "id_psicologo"),
        inverseJoinColumns = @JoinColumn(name = "id_paciente")
    )
    private List<Paciente> pacientes;
    
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "psicologo")
    private List<Sesion> sesiones;
}
