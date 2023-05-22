package Máquinas;
import Datos.DatosA;
import Datos.DatosH;

public class MaquinaH implements Maquinas{
    public MaquinaH(){
    }


    @Override
    public boolean actuarMaquina(Object datos) {
        if(datos instanceof DatosH){
            DatosH datosMaquinaH = (DatosH) datos;
            if(datosMaquinaH.getMaquina() instanceof Maquinas){
                return ((Maquinas) datosMaquinaH.getMaquina()).actuarMaquina(datosMaquinaH.getDatosMaquina());
            }
        }
        return false;
    }
}
