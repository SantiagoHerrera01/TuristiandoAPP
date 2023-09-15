package org.example.validations;

import org.example.helpers.Mensaje;
import org.example.helpers.Util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ReservaValidacion {

    protected Util util = new Util();
    private static final String FORMATO_FECHA = "dd/MM/yyyy";
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(FORMATO_FECHA);

    public boolean validarFechaReserva (String fechaReserva) throws Exception {
        if (!util.validarExpresionRegular(fechaReserva, "^(0?[1-9]|[1-2][0-9]|3[0-1])/(0?[1-9]|1[0-2])/\\d{4}$"))
            throw new Exception(Mensaje.FECHA_INICIO_INVALIDA.getMensaje());
        else {
            return true;
        }
    }
}
