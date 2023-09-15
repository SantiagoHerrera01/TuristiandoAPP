package org.example.validations;

import org.example.helpers.Mensaje;

public class EntidadCulturalValidacion {

    public Boolean validarCasacteresEntidadCultural (String secretaria, String mision)throws Exception{
        if(secretaria.length()< 10 && mision.length() < 10 && secretaria.length()>70 && mision.length()>70 ){
            throw new Exception(Mensaje.NUMERO_CATACTERES_INVALIDO.getMensaje());
        }else {
            return true;
        }

    }
}
