package org.example.validations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionTest {

    private ReservaValidacion validacion;

    //Preparas las pruebas
    @BeforeEach
    public void configurarPruebas() {
        this.validacion = new ReservaValidacion();
        System.out.println("Bienvenido...");
    }

    @Test
    void validarFechaReservaFuncionaCorrectamente() {
        String fechaPrueba = ("12/01/2023");//Preparo
        Boolean respuesta = Assertions.assertDoesNotThrow(
                () -> this.validacion.validarFechaReserva(fechaPrueba));
        Assertions.assertTrue(respuesta);
    }
}