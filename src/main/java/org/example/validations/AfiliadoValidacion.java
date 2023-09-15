package org.example.validations;

import org.example.helpers.Mensaje;

public class AfiliadoValidacion {
    // Validar costo mensualidad

    public Boolean validarMensualidad(Integer valorMnesual)throws Exception{
        if (valorMnesual < 0){
            throw new Exception(Mensaje.PRECIO_MENSUAL_INVALIDO.getMensaje());
        }else {
            return true;
        }
    }
}
