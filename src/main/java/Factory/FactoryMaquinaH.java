package Factory;

import Máquinas.MaquinaH;
import Máquinas.Maquinas;

public class FactoryMaquinaH extends FactoryMaquina{
    @Override
    public Maquinas crearMaquina() {
        return new MaquinaH();
    }
}
