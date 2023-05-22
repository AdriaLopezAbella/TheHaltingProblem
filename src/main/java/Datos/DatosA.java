package Datos;

public class DatosA implements Datos{
    Object num1;
    Object num2;
    Character operacion;

    public DatosA(Object num1, Object num2, Character operacion){
        this.num1 = num1;
        this.num2 = num2;
        this.operacion = operacion;
    }

    public Object getNum1(){
        return num1;
    }

    public Object getNum2(){
        return num2;
    }

    public Character getOperacion(){
        return operacion;
    }

    @Override
    public void maquinaCorrespondiente() {
        System.out.println("Datos de la maquina A");
    }
}
