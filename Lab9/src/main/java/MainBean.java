import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * Created by nasta_000 on 24.05.2016.
 */

@ManagedBean
@ViewScoped
public class MainBean implements Serializable {
    private double x, r = 1;
    private String y;
    private String xMouse, yMouse;

    @ManagedProperty(value = "#{resultBean}")
    private ResultBean resultBean;
    @ManagedProperty(value = "#{imageBean}")
    private ImageBean imageBean;

    //Getters and Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public ResultBean getResultBean() {
        return resultBean;
    }

    public void setResultBean(ResultBean resultBean) {
        this.resultBean = resultBean;
    }

    public ImageBean getImageBean() {
        return imageBean;
    }

    public void setImageBean(ImageBean imageBean) {
        this.imageBean = imageBean;
    }

    public String getxMouse() {
        return xMouse;
    }

    public void setxMouse(String xMouse) {
        this.xMouse = xMouse;
    }

    public String getyMouse() {
        return yMouse;
    }

    public void setyMouse(String yMouse) {
        this.yMouse = yMouse;
    }

    public void checkData() {
        double _y = Double.parseDouble(y.replace(',', '.'));
        Point point = new Point(x, _y, r, testPoint(x, _y, r));
        resultBean.addPoint(point);
        imageBean.setRadius(r);
        imageBean.addPoint(new Point(x, _y, r, point.inArea));
        checkExistedPoints(r);
    }

    public void checkClick() {
        double y = Double.parseDouble(yMouse.replace(',', '.'));
        double x = Double.parseDouble(xMouse.replace(',', '.'));
        y = Math.rint(100.0 * y) / 100.0;
        x = Math.rint(100.0 * x) / 100.0;
        double R = r;
        Point point = new Point(x, y, R, testPoint(x, y, R));
        resultBean.addPoint(point);
        imageBean.addPoint(new Point(point.get_x(), point.get_y(), point.get_r(), point.isInArea()));
        imageBean.setRadius(R);
        checkExistedPoints(R);
    }

    private void checkExistedPoints(double r) {
        for (Point p : imageBean.getPoints()) {
            p.set_r(r);
            p.setInArea(testPoint(p.get_x(), p.get_y(), r));
        }
    }

    public boolean testPoint(double x, double y, double r) {
        return ((x >= -r && x <= 0 && y <= 0 && y >= -r / 2)
                || (x >= -r / 2 && x <= 0 && y <= r / 2 && y >= 0 && x * x + y * y <= r * r / 4)
                || (x >= 0 && x <= r && y >= 0 && y <= r - x));
    }
}
