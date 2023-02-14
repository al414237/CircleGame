import java.util.List;

public class FullObserver implements Observador{
    FullObserver (Game game) {
        game.registrar(this);
    }

    @Override
    public void update(List<Circle> lista) {
        for(Circle c : lista) System.out.println(c);
        System.out.println();
    }
}
