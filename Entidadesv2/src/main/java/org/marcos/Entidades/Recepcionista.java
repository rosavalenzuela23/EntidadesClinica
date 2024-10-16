/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.marcos.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author natsu
 */
@Entity
@Table(name = "recepcionistas")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public @Data class Recepcionista extends Empleado {
    
}
