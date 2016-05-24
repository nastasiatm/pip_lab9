/**
 * Created by nasta_000 on 24.05.2016.
 */
public class Point {
    double _x;
    double _y;
    double _r;
    boolean inArea;

    public Point(double x, double y, double r, boolean inArea) {
        this._x = x;
        this._y = y;
        this._r = r;
        this.inArea = inArea;
    }

    public void set_x(double _x) {
        this._x = _x;
    }

    public void set_y(double _y) {
        this._y = _y;
    }

    public void set_r(double _r) {
        this._r = _r;
    }

    public void setInArea(boolean inArea) {
        this.inArea = inArea;
    }

    public double get_x() {
        return _x;
    }

    public double get_y() {
        return _y;
    }

    public double get_r() {
        return _r;
    }

    public boolean isInArea() {
        return inArea;
    }
}
