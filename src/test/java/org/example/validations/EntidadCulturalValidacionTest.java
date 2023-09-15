package org.example.validations;

import org.example.helpers.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntidadCulturalValidacionTest {
    private EntidadCulturalValidacion validacion;

    //Preparas las pruebas
    @BeforeEach
    public void configurarPruebas() {
        this.validacion=new EntidadCulturalValidacion();
        System.out.println("Bienvenido...");
    }

    @Test
    void validarCasacteresEntidadCultural() {
        String secretariaPrueba="sapo hecta cuadragesimo";
        String misionPrueba = "octaplecta";
        //Preparo
        Boolean respuesta = Assertions.assertDoesNotThrow(
                ()->this.validacion.validarCasacteresEntidadCultural(secretariaPrueba,misionPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    void validarCaracteresFuncionaIncorrectaMente(){
        String secretariaPrueba="sapo";
        String misionPrueba = "oct";
        Exception respuesta = Assertions.assertThrows(Exception.class,
                ()->this.validacion.validarCasacteresEntidadCultural(secretariaPrueba,misionPrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CATACTERES_INVALIDO.getMensaje(),respuesta.getMessage());
    }
}