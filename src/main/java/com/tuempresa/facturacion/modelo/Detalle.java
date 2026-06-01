package com.tuempresa.facturacion.modelo;

import javax.persistence.*;
import lombok.*;

@Embeddable
@Getter
@Setter
public class Detalle {

    private int cantidad;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    private Producto producto;
}