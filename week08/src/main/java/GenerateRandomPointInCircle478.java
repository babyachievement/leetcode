/**
 * date: 2019/8/5 9:38
 */

public class GenerateRandomPointInCircle478 {
    private double radius;
    private double x_center;
    private double y_center;

    public GenerateRandomPointInCircle478(double radius, double x_center, double y_center) {

        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
    }

    public double[] randPoint() {
        final double random = Math.sqrt(Math.random());
        double len = random * radius;
        double degreee = Math.random() * 2 * Math.PI;

        return new double[]{x_center + len * Math.cos(degreee),
                y_center + len * Math.sin(degreee)};
    }
}
