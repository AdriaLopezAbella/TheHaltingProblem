package Máquinas;

public abstract class DecoratorMaquina implements Maquinas{
    protected Maquinas maquinaDecorada;

    public DecoratorMaquina(Maquinas maquinaDecorada){
        this.maquinaDecorada = maquinaDecorada;
    }

    public abstract boolean actuarMaquina(Object datos);
}
