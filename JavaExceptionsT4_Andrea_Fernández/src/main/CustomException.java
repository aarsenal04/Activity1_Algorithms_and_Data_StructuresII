package main;

public class CustomException extends Exception{ //excepcion propia que extiende a la clase exception

    public static final long SerialversionUID = 700L;

    public CustomException(String mensaje){
        super(mensaje); //manda el mensaje del por qué se llama esta clase, ejemplo: mensaje de error

    }

}
