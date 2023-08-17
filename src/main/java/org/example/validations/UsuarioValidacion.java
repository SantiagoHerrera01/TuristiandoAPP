package org.example.validations;


import org.example.helpers.Mensaje;
import org.example.helpers.Util;

public class UsuarioValidacion {

    protected Util util = new Util();
    public boolean validarNombres(String nombres) throws Exception {
        // 1. Validar que el nombre tenga minimo 10 caracteres
        if (nombres.length() < 10) {
            throw new Exception(Mensaje.NUMERO_CATACTERES_INVALIDO.getMensaje());
        } else if (!util.validarExpresionRegular(nombres,"^[a-zA-ZÑ-ñ ]+$")) {//2. nombres solo puede tener letras
            throw new Exception(Mensaje.NOMBRE_INVALIDO.getMensaje());
        }else{
        return true;}
    }

    public boolean validarCorreo(String correo) throws Exception{
        if (!util.validarExpresionRegular(correo,"^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")){
            throw new Exception(Mensaje.CORREO_INVALIDO.getMensaje());
        }else {
            return true;
        }
    }

    public boolean validarUbicacion(Long ubicacion) throws Exception{
        if (ubicacion<1 || ubicacion>4){
            throw new Exception(Mensaje.UBICACION_INVALIDA.getMensaje());
        }else {
            return true;
        }
    }


}
