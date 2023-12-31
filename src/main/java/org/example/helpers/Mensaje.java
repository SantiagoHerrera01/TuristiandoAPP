package org.example.helpers;

public enum Mensaje {
    NUMERO_CATACTERES_INVALIDO("El numero de caracteres es invalido"),
    NOMBRE_INVALIDO("El nombre solo acepta letras y espacios"),
    CORREO_INVALIDO("Revisa el formato del correo"),
    UBICACION_INVALIDA("Ubicacion no valida"),
    FECHA_INICIO_INVALIDA("Fecha no valida"),
    FECHA_FIN_INVALIDA("La fecha de inicio no puede ser mayor a la de finalización"),
    PRECIO_MENSUAL_INVALIDO("El precio no puede ser negativo"),

    NIT_INVALIDO("El nit es incorrecto"),
    COSTO_PERSONA_INVALIDA("El costo por persona no puede ser negativo");
    private String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
