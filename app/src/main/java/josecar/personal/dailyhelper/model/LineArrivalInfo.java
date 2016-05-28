package josecar.personal.dailyhelper.model;

import java.util.List;

/**
 * Created by JoseManuel on 28/05/2016.
 */
public class LineArrivalInfo {

    public final String line;
    List<ArrivalInfo> arrivals;

    public LineArrivalInfo(String title, List<ArrivalInfo> arrivals) {
        this.line = title;
        this.arrivals = arrivals;
    }

}
