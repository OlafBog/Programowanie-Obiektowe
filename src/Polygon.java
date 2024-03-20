public class Polygon {
    private Point[] points_tab;
    private Style style;

    public Polygon(Point[] points_tab){
        this.points_tab=points_tab;
        this.style = new Style("none","black",1);
    }

    public Polygon(Point[] points_tab,Style style){
        this.points_tab=points_tab;
        this.style = style;
    }

    public Polygon(Polygon poly){
        this.points_tab = new Point[poly.points_tab.length];
        for(int i=0;i< points_tab.length;i++) {
            this.points_tab[i] = new Point(poly.points_tab[i].x, poly.points_tab[i].y);
        }
        this.style = poly.style;
    }

    public String toSvg() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<polygon points=\"");
        for(Point p: points_tab) {
            stringBuilder.append(p.x).append(",").append(p.y).append(" ");
        }
        stringBuilder.append("\" ").append(style.toSvg());
        return stringBuilder.toString();
    }
}
