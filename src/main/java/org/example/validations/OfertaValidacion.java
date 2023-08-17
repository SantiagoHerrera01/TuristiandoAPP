package org.example.validations;

import org.example.helpers.Mensaje;
import org.example.helpers.Util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OfertaValidacion {
    protected Util util = new Util();
    private static final String FORMATO_FECHA = "dd/MM/yyyy";
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(FORMATO_FECHA);
    public boolean validarTitulo (String titulo) throws Exception{
        if (titulo.length()<=20){
            return true;
        }else {
            throw new Exception("El titulo debe tener20 o menos caracteres.");
        }
    }

    public boolean validarFecha (String fechaInicio) throws Exception {
        if (!util.validarExpresionRegular(fechaInicio, "^(0?[1-9]|[1-2][0-9]|3[0-1])/(0?[1-9]|1[0-2])/\\d{4}$"))
            throw new Exception(Mensaje.FECHA_INICIO_INVALIDA.getMensaje());
        else {
            return true;
        }
    }

    public boolean validarFechaFin (LocalDate fechaInicio,LocalDate fechaFin)throws Exception{
        if (fechaFin.isBefore(fechaInicio)){
            throw new Exception(Mensaje.FECHA_FIN_INVALIDA.getMensaje());
        }else {
            return true;
        }
    }

    public boolean validarCostoPersona(Double costoPersona)throws Exception{
        if (costoPersona<0){
            throw new Exception("El costo por persona no puede ser negativo");
        }else {
        return true;
        }
    }

    }
