package main;
// excepciones personalizadas, error para manejar una contraseña repetida
public class Main {

    public static void main(String[] args){

        String usuario, passw, repassw;
        usuario = "JorgeAR7"; //variable campo de usuario
        passw = "andres123"; // variable campo de contraseña
        repassw = "andres124"; // variable repetición de contraseña diferente a la real
        // repassw se puede cambiar para encontrar los diferentes errores

        Ayuda h = new Ayuda(); // clase para ayudar a registrar al usuario

        try { // intenta validar el pass del usuario pasándole la contraseña real y la repetida diferente

            h.validarpassw(passw, repassw);

        }catch (CustomException e) { // clase personalizada - exception

            System.out.println("Usuario, su contraseña"
                    + e.getMessage());
        }finally { //siempre se ejecuta

            System.out.println("Desea cambiar su contraseña?");
        }
    }
}