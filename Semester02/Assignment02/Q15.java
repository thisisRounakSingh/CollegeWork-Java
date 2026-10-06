package Semester02.Assignment02;

interface PointType {
    void showPoint();

    void setCoordinates(double xCoordinate, double yCoordinate);

    void PrintCoordinates();

    double returnX();

    double returnY();
}

class Point implements PointType {
    double xCoordinate;
    double yCoordinate;

    @Override
    public void showPoint() {
        System.out.printf("(x=%.2f, y=%.2f)\n", this.xCoordinate, this.yCoordinate);
    }

    @Override
    public void setCoordinates(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public void PrintCoordinates() {
        System.out.printf("X-Coordinate: %.2f%n Y-Coordinate: %.2f%n", this.xCoordinate, this.yCoordinate);
    }

    @Override
    public double returnX() {
        return xCoordinate;
    }

    @Override
    public double returnY() {
        return yCoordinate;
    }
}

//Assigned On: (Did not Track the Date)
public class Q15 {
    static void main() {
        PointType pointType = new Point();
        pointType.setCoordinates(2, 4);
        pointType.PrintCoordinates();
        pointType.showPoint();
        System.out.println(pointType.returnX());
        System.out.println(pointType.returnY());
    }
}
