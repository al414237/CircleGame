public class Circle {
    private double x;
    private double y;

    private double r;

    Circle(double x, double y, double radio){
        this.x = x;
        this.y = y;
        this.r = radio;
    }

    Circle(Circle circle){
        this(circle.x, circle.y, circle.r);
    }

    public double distance(double x, double y){
        double distanciaAlCentro = Math.sqrt( Math.pow(this.x-x, 2) + Math.pow(this.y-y, 2));
        return distanciaAlCentro - r;
    }

    @Override
    public String toString() {
        return "Círculo con centro (" + x + ", " + y + ") y radio " + r;
    }
}
