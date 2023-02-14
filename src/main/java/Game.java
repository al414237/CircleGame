import java.util.ArrayList;
import java.util.List;

public class Game implements Sujeto {
    private List<Circle> lista;
    private List<Observador> observadores;

    public Game(){
        lista = new ArrayList<>();
        observadores = new ArrayList<>();
    }

    public void add(Circle circle){
        lista.add(circle);
        notificar();
    }

    public void click(double x, double y){
        double distanciaMasCorta = Double.POSITIVE_INFINITY;
        int indiceCandidato = -1;

        for (int i = 0; i < lista.size(); i++) {
            double distanciaCandidata = lista.get(i).distance(x,y);
            if (distanciaCandidata<distanciaMasCorta){
                indiceCandidato = i;
                distanciaMasCorta = distanciaCandidata;
            }
        }

        if (indiceCandidato>=0){
            lista.remove(indiceCandidato);
            notificar();
        } else {
            System.out.println("There are not circles.");
        }
    }

    public int getSize(){
        return lista.size();
    }

    @Override
    public void notificar() {
        for (Observador o : observadores){
            o.update(lista);
        }
    }

    @Override
    public void registrar(Observador o) {
        observadores.add(o);
    }
}
