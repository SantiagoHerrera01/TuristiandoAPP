package org.example.validations;

import org.example.helpers.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {
    // Crear objeto clase a probar.
    private UsuarioValidacion validacion;

    //Preparas las pruebas
    @BeforeEach
    public void configurarPruebas() {
        this.validacion=new UsuarioValidacion();
        System.out.println("Bienvenido...");
    }

    //programar Pruebas
    @Test
    public void validarNombresFuncionaCorrectamente(){
        String nombrePrueba="Santiago Castañeda Herrera";//Preparo
        Boolean respuesta = Assertions.assertDoesNotThrow(
                ()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarNombresFuncionaIncorrectamente(){
        String nombrePrueba= "Santi";
        Exception respuesta = Assertions.assertThrows(Exception.class,
                ()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CATACTERES_INVALIDO.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarNombresFuncionaIncorrectamentePorCaracteresInvalidos(){
        String nombrePrueba ="12345678910";
        Exception respuesta = Assertions.assertThrows(Exception.class,
                ()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertEquals(Mensaje.NOMBRE_INVALIDO.getMensaje(),respuesta.getMessage());
    }
}