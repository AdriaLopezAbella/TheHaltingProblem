package Máquinas;
import Datos.DatosH;
import Observer.PatronObserver;

public class MaquinaH extends MaquinaAbstracta{
    public MaquinaH(){
    }

    private void notifyObserver(boolean estado){
        for(PatronObserver observer: this.listaObserver){
            System.out.println(observer.estadoFinal(estado));
        }
    }

    public void añadirLista (PatronObserver observer){
        this.listaObserver.add(observer);
    }

    private boolean actuar (Object datos){
        if(datos instanceof DatosH){
            DatosH datosMaquinaH = (DatosH) datos;
            if(datosMaquinaH.getMaquina() instanceof Maquinas){
                return ((Maquinas) datosMaquinaH.getMaquina()).actuarMaquina(datosMaquinaH.getDatosMaquina());
            }
        }
        return false;
    }

    @Override
    public boolean actuarMaquina(Object datos) {
        boolean resultado = actuar(datos);
        notifyObserver(resultado);
        return resultado;
    }
}
