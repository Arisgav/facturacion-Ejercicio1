package com.tuempresa.facturacion.modelo;

import javax.persistence.*;
import org.openxava.annotations.*;
import lombok.*;

@Entity
@Getter @Setter
@View(name="Simple", // Esta vista solo se usará cuando se especifique ?Simple?
        members="numero, nombre" // Muestra únicamente numero y nombre en la misma línea
)
public class Cliente {

    @Id
    @Column(length = 6)
    int numero;

    @Column(length = 50)
    @Required
    String nombre;

    @Embedded // Así para referenciar a una clase incrustable
    Direccion direccion; // Una referencia Java convencional

    @ManyToOne(fetch=FetchType.LAZY, optional=false)
    @ReferenceView("Simple") // La vista llamada 'Simple' se usará para visualizar esta referencia
    Cliente cliente;

}
