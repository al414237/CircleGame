import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void clickCasoListaVacia(){

        Game g = new Game();
        CountObserver observer1 = new CountObserver(g);
        FullObserver observer2 = new FullObserver(g);

        g.click(0,0);
        assertEquals(0, g.getSize());
    }

    @Test
    void clickCasoListaUnElemento(){
        Game g = new Game();
        CountObserver observer1 = new CountObserver(g);
        FullObserver observer2 = new FullObserver(g);

        g.add(new Circle(0,0,0));
        assertEquals(1, g.getSize());

        g.click(0,0);
        assertEquals(0, g.getSize());
    }
}