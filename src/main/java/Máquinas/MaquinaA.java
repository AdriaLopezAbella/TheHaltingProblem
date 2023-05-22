package Máquinas;

import Datos.Datos;
import Datos.DatosA;

public class MaquinaA implements Maquinas{
    public MaquinaA(){
    }

    @Override
    public boolean actuarMaquina(Object datosA) {
        if(datosA instanceof DatosA) {
            DatosA datosMaquinaA = (DatosA) datosA;

            if (datosMaquinaA.getNum1() instanceof Integer && datosMaquinaA.getNum2() instanceof Integer && (datosMaquinaA.getOperacion() == '+' || datosMaquinaA.getOperacion() == '-' || datosMaquinaA.getOperacion() == '*' || datosMaquinaA.getOperacion() == '/')) {
                return true;
            }
        }
        return false;
    }
}
