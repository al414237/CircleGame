public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        CountObserver observer = new CountObserver(game);

        for (int i = 0; i < 5; i++) {
            game.add(new Circle(i, i,2 * i));
        }

        game.click(0, 0);
    }
}
