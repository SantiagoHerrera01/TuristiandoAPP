package org.example.validations;

import org.example.helpers.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalValidacionTest {

    private LocalValidacion validacion;


    @BeforeEach
    public void configurarPruebas() {
        this.validacion=new LocalValidacion();
        System.out.println("Iniciando Prueba Empresas...");
    }

    @Test
    public void ValidarNitFuncioneCorrectamente(){
        String nitPrueba="1234567890";//Preparo
        Boolean respuesta = Assertions.assertDoesNotThrow(
                ()->this.validacion.validarNit(nitPrueba));
        Assertions.assertTrue(respuesta);
    }

@Test
    public void  validarNitFincionaIncorrecto(){
        String nitPrueba= "1";
        Exception respuesta = Assertions.assertThrows(Exception.class,
                ()->this.validacion.validarNit(nitPrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CATACTERES_INVALIDO.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void ValidarNombreEmpresaFuncioneCorrectamente(){
        String nitPrueba="1234567890";//Preparo
        Boolean respuesta = Assertions.assertDoesNotThrow(
                ()->this.validacion.validarNit(nitPrueba));
        Assertions.assertTrue(respuesta);
    }
}