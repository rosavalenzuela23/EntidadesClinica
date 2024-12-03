
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
@Table(name = "administradores")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public @Data class Administrador extends Empleado {
    
}
