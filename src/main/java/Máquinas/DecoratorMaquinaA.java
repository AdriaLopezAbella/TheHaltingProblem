package Máquinas;

public class DecoratorMaquinaA extends DecoratorMaquina{
    public DecoratorMaquinaA(Maquinas maquinaDecorada){
        super(maquinaDecorada);
    }

    @Override
    public boolean actuarMaquina(Object datos) {
        return maquinaDecorada.actuarMaquina(datos);
    }
}
