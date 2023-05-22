package Máquinas;

public class DecoratorMaquinaH extends DecoratorMaquina{
    public DecoratorMaquinaH(Maquinas maquinaDecorada){
        super(maquinaDecorada);
    }

    @Override
    public boolean actuarMaquina(Object datos) {
        return maquinaDecorada.actuarMaquina(datos);
    }
}
