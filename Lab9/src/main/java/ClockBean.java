import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by nasta_000 on 24.05.2016.
 */
@ManagedBean
@ViewScoped
public class ClockBean implements Serializable {
    private DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private String date = format.format(new Date());

    public String getDate() {
        return date;
    }

    public void updateTime() {
        date = format.format(new Date());
    }
}
