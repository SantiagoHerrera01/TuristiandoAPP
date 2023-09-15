package org.example.validations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfiliadoValidacionTest {
    private AfiliadoValidacion validacion;

    //Preparas las pruebas
    @BeforeEach
    public void configurarPruebas() {
        this.validacion=new AfiliadoValidacion();
        System.out.println("Bienvenido...");
    }

    @Test
    void validarMensualidadFuncionaCorrectamente() {
        Integer nombrePrueba=100000;//Preparo
        Boolean respuesta = Assertions.assertDoesNotThrow(
                ()->this.validacion.validarMensualidad(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }
}