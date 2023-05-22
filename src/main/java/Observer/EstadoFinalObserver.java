package Observer;

public class EstadoFinalObserver implements PatronObserver{
    @Override
    public String estadoFinal(boolean estado) {
        if(estado){
            return "No atascada";
        } else {
            return "Si atascada";
        }
    }
}
