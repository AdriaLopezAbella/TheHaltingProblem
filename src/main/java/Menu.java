import Datos.DatosA;
import Datos.DatosH;
import Factory.FactoryMaquinaA;
import Factory.FactoryMaquinaH;
import Máquinas.*;
import Observer.EstadoFinalObserver;

public class Menu {
    public static void menu(){
        FactoryMaquinaA factoriaA = new FactoryMaquinaA();
        MaquinaA maquinaA = (MaquinaA) factoriaA.crearMaquina();
        DatosA datosA = new DatosA(2, 5, '+');

        FactoryMaquinaH factoriaH = new FactoryMaquinaH();
        MaquinaH maquinaH = (MaquinaH) factoriaH.crearMaquina();
        DatosH datosH = new DatosH(maquinaA, datosA);

        //System.out.println(maquinaH.actuarMaquina(datosH));

        EstadoFinalObserver estadoFinalObserver = new EstadoFinalObserver();
        maquinaH.añadirLista(estadoFinalObserver);

        Maquinas maquinaADecorada = new DecoratorMaquinaA(maquinaA);
        Maquinas maquinaHDecorada = new DecoratorMaquinaH(maquinaH);

        maquinaHDecorada.actuarMaquina(datosH);
        maquinaADecorada.actuarMaquina(datosA);

    }
}
