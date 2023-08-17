package org.example.validations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ReservaValidacion {


    public boolean validarFechaReserva (LocalDate fechaReserva)throws Exception{
        try {

        } catch (Exception error) {
            throw new Exception("El formato de las fechas debe ser dd/MM/yy.");
        }
        return true;
    }
}
