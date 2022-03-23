package main;

public class Ayuda { //clase para validar la contraseña

    Ayuda() {
    }

    public void validarpassw(String passw, String repassw) throws CustomException{ // valida en caso de errores

        if(!passw.equals(repassw)){

            throw new CustomException(" no se ha verificado porque los campos no son iguales"); // error en caso de que los campos no sean iguales en sus validaciones
        }

        if(passw.length() < 8){
            throw new CustomException(" no se ha verificado porque no es lo suficientemente larga"); // error en caso de que la contraseña sea corta en su validación

        }

        if(passw.equals(repassw)){
            throw new CustomException(" ha sido validada con éxito"); //en caso de que los campos de la contraseña sean adecuados e iguales
        }
    }

}