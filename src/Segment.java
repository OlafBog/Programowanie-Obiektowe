public class Segment {

    private Point startPoint;
    private Point endPoint;

    public Segment(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public double length() {
        return Math.sqrt(Math.pow(endPoint.x - startPoint.x, 2) + Math.pow(endPoint.y - startPoint.y, 2));

    }

    public String toSvg() {
        return "<line x1=\"" + startPoint.x + "\" y1=\"" + startPoint.y + "\" x2=\"" + endPoint.x + "\" y2=\"" + endPoint.y + "\" stroke=\"black\" />"
    }

}