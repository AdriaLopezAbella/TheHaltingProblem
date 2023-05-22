package Factory;

import Máquinas.MaquinaA;
import Máquinas.Maquinas;

public class FactoryMaquinaA extends FactoryMaquina{
    @Override
    public Maquinas crearMaquina() {
        return new MaquinaA();
    }
}
