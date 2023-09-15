package org.example.validations;

import org.example.helpers.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OfertaValidacionTest {
    private OfertaValidacion validacion;

    //Preparas las pruebas
    @BeforeEach
    public void configurarPruebas() {
        this.validacion = new OfertaValidacion();
        System.out.println("Bienvenido...");
    }

    @Test
    void validarTituloFuncionaCorrectamente() {
        String tituloPrueba = "Aztrazeneca";//Preparo
        Boolean respuesta = Assertions.assertDoesNotThrow(
                () -> this.validacion.validarTitulo(tituloPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    void validarFechaFuncionaCorrectamente() {
        String fechaPrueba = ("12/01/2023");//Preparo
        Boolean respuesta = Assertions.assertDoesNotThrow(
                () -> this.validacion.validarFecha(fechaPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    void validarFechaFinFuncionaCorrectamente() {
        Boolean respuesta = Assertions.assertDoesNotThrow(
                () -> this.validacion.validarFechaFin(LocalDate.of(2023, 8, 20),
                        LocalDate.of(2023, 8, 22)));
        Assertions.assertTrue(respuesta);
    }

    @Test
    void validarCostoPersonaFuncionaCorrectamente() {
        Double costoPrueba = 1501.0;//Preparo
        Boolean respuesta = Assertions.assertDoesNotThrow(
                () -> this.validacion.validarCostoPersona(costoPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    void validarTituloFuncionaIncoorrectamente() {
        String tituloPrueba = "aztrazeneca Veneca Bendecida Por Dios";
        Exception respuesta = Assertions.assertThrows(Exception.class,
                () -> this.validacion.validarTitulo(tituloPrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CATACTERES_INVALIDO.getMensaje(), respuesta.getMessage());
    }

    @Test
    void validarFechaFuncionaIncorrectamente() {
        String fechaPrueba = "santi";
        Exception respuesta = Assertions.assertThrows(Exception.class,
                () -> this.validacion.validarFecha(fechaPrueba));
        Assertions.assertEquals(Mensaje.FECHA_INICIO_INVALIDA.getMensaje(), respuesta.getMessage());
    }

    @Test
    void validarFechaFinFuncionaIncorrectamente() {
        Exception respuesta = Assertions.assertThrows(Exception.class,
                () -> this.validacion.validarFechaFin(LocalDate.of(2023, 10, 20),
                        LocalDate.of(2023, 8, 22)));
        Assertions.assertEquals(Mensaje.FECHA_FIN_INVALIDA.getMensaje(), respuesta.getMessage());
    }
    @Test
    void validarCostoPersonaFuncionaIncoorrectamente() {
        Double costoPersonaPrueba= -100.0;
        Exception respuesta = Assertions.assertThrows(Exception.class,
                ()->this.validacion.validarCostoPersona(costoPersonaPrueba));
        Assertions.assertEquals(Mensaje.COSTO_PERSONA_INVALIDA.getMensaje(),respuesta.getMessage());
    }
}