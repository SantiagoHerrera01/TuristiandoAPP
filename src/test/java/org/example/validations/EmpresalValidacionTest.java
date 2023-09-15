package org.example.validations;

import org.example.helpers.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresalValidacionTest {

    private EmpresalValidacion validacion;

    //Preparas las pruebas
    @BeforeEach
    public void configurarPruebas() {
        this.validacion=new EmpresalValidacion();
        System.out.println("Bienvenido...");
    }

    @Test
    void validarNitFuncionaCorrectamente() {
            String nitPrueba= "1234567890" ;//Preparo
            Boolean respuesta = Assertions.assertDoesNotThrow(
                    ()->this.validacion.validarNit(nitPrueba));
            Assertions.assertTrue(respuesta);
    }
    @Test
    void validarNitFuncionaIncorrectamente() {
        String nitPrueba= "santi";
        Exception respuesta = Assertions.assertThrows(Exception.class,
                ()->this.validacion.validarNit(nitPrueba));
        Assertions.assertEquals(Mensaje.NIT_INVALIDO.getMensaje(),respuesta.getMessage());
    }

    @Test
    void validarNombreEmpresaFuncionaCorrectamente() {
        String nombreEmpresa ="Astrazeneca enterprise";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.validacion.validarNombreEmpresa(nombreEmpresa));
        Assertions.assertTrue(respuesta);
    }

    @Test
    void validarNombreEmpresaFuncionaIncorrectamente() {
        String nombreEmpresaPrueba= "1234567890123456789012345678901";
        Exception respuesta = Assertions.assertThrows(Exception.class,
                ()->this.validacion.validarNombreEmpresa(nombreEmpresaPrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CATACTERES_INVALIDO.getMensaje(),respuesta.getMessage());
    }
}