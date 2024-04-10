public class Ellipse implements Shape{
    Vec2 center;
    double radiusx;
    double radiusy;
    Style style;

    public Ellipse(Vec2 center, double radius, Style style) {
        this.style=style;
        this.center=center;
        this.radiusx=radius;
        this.radiusy=radiusx;
    }

    public Ellipse(Vec2 center, double radiusx, double radiusy, Style style) {
        this.style=style;
        this.center=center;
        this.radiusx=radiusx;
        this.radiusy=radiusy;
    }

    @Override
    public String toSvg() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<ellipse");
        stringBuilder.append(" cx=\"").append(center.x).append("\"");
        stringBuilder.append(" cy=\"").append(center.y).append("\"");
        stringBuilder.append(" rx=\"").append(radiusx).append("\"");
        stringBuilder.append(" ry=\"").append(radiusy).append("\"");
        stringBuilder.append("\" ").append(style.toSvg());
        return stringBuilder.toString();
    }
}