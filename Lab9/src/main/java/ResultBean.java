import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nasta_000 on 24.05.2016.
 */

@ManagedBean
@SessionScoped
public class ResultBean implements Serializable {
    private List<Point> resultList = new ArrayList<Point>();

    public List<Point> getResultList() {
        return resultList;
    }

    public void addPoint(Point p) {
        this.resultList.add(p);
    }
}
