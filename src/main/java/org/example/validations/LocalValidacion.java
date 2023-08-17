package org.example.validations;

import org.example.helpers.Util;

public class LocalValidacion {
    protected Util util = new Util();

    public boolean validarNit (String nit) throws Exception{
        if(nit.length()==10 && util.validarExpresionRegular(nit, "^[0-9]+$")){
            return true;
        }else {
            throw new Exception("El nit debe tener solo 10 caacteres.");
        }

    }

    public boolean validarNombreEmpresa (String nombre) throws Exception{
        if (nombre.length() <=30){
            return true;
        }else {
        throw new Exception("El nombre de la empresa debe ser menor a 30 caracteres");
        }
    }
}
