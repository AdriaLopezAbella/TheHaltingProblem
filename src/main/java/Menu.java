import Datos.DatosA;
import Datos.DatosH;
import Factory.FactoryMaquinaA;
import Factory.FactoryMaquinaH;
import Máquinas.MaquinaA;
import Máquinas.MaquinaH;

public class Menu {
    public static void menu(){
        FactoryMaquinaA factoriaA = new FactoryMaquinaA();
        MaquinaA maquinaA = (MaquinaA) factoriaA.crearMaquina();
        DatosA datosA = new DatosA(1, 2, '+');

        FactoryMaquinaH factoriaH = new FactoryMaquinaH();
        MaquinaH maquinaH = (MaquinaH) factoriaH.crearMaquina();
        DatosH datosH = new DatosH(maquinaA, datosA);

        System.out.println(maquinaH.actuarMaquina(datosH));

    }
}
