package org.example.validations;

import org.example.helpers.Mensaje;
import org.example.helpers.Util;

public class EmpresalValidacion {
    protected Util util = new Util();

    public boolean validarNit (String nit) throws Exception{
        if(nit.length()==10 && util.validarExpresionRegular(nit, "^[0-9]+$")){
            return true;
        }else {
            throw new Exception(Mensaje.NIT_INVALIDO.getMensaje());
        }

    }

    public boolean validarNombreEmpresa (String nombre) throws Exception{
        if (nombre.length() <=30){
            return true;
        }else {
        throw new Exception(Mensaje.NUMERO_CATACTERES_INVALIDO.getMensaje());
        }
    }
}
