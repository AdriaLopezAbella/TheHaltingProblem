package Máquinas;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import Observer.PatronObserver;

public abstract class MaquinaAbstracta implements Maquinas{
    protected List<PatronObserver> listaObserver;

    public MaquinaAbstracta() {
        this.listaObserver = new ArrayList<>();
    }

    @Override
    public abstract boolean actuarMaquina(Object datos);

}
