package org.example.helpers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {
    public Boolean validarExpresionRegular(String cadena, String expresionRegular) throws Exception{
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia =patron.matcher(cadena);
        if (coincidencia.matches()){
            return(true);
        }else {
            return(false);
        }
    }

    public DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public String mostrarFechas(LocalDate fechaReserva){
        return fechaReserva.format(formatoFecha);
    }

    public LocalDate convertirFechaStringALocalDate(String fechaString){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(fechaString, formatter);
        return date;
    }
}
