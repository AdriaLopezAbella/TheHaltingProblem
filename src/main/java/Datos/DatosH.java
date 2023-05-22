package Datos;

public class DatosH implements Datos{
    Object maquina;
    Object datosMaquina;

    public DatosH(Object maquina, Object datosMaquina){
        this.maquina = maquina;
        this.datosMaquina = datosMaquina;
    }

    public Object getMaquina() {
        return maquina;
    }

    public Object getDatosMaquina() {
        return datosMaquina;
    }

    @Override
    public void maquinaCorrespondiente() {
        System.out.println("Datos de la maquina H");
    }
}
