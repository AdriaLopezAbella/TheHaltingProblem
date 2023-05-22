package Máquinas;

import Datos.Datos;
import Datos.DatosA;
import Observer.PatronObserver;

public class MaquinaA extends MaquinaAbstracta{
    public MaquinaA(){
    }

    private void notifyObserver(boolean estado){
        for(PatronObserver observer : this.listaObserver){
            observer.estadoFinal(estado);
        }
    }

    public void añadirLista(PatronObserver observer) {
        this.listaObserver.add(observer);
    }

    private boolean actuar(Object datosA){
        if(datosA instanceof DatosA) {
            DatosA datosMaquinaA = (DatosA) datosA;

            if (datosMaquinaA.getNum1() instanceof Integer && datosMaquinaA.getNum2() instanceof Integer && datosMaquinaA.getOperacion() instanceof Character) {
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public boolean actuarMaquina(Object datos) {
        boolean estado = actuar(datos);
        notifyObserver(estado);
        return estado;
    }
}
