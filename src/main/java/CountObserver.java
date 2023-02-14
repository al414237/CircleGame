import java.util.List;

public class CountObserver implements Observador{
    CountObserver( Game game ){
        game.registrar(this);
    }

    @Override
    public void update(List<Circle> lista) {
        System.out.println("There are " + lista.size() + " circles.");
    }
}
