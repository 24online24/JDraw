package graphix;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Polygon extends Line {

    Polygon(int xm, int ym, Color c, boolean filled) {
        super(0, 0, c, filled);
        puncte = new ArrayList<Point>();
        puncte.add(new Point(xm, ym));
    }

    @Override
    public boolean add(int xm, int ym) {
        int xv, yv;
        Point pv = puncte.get(0);
        xv = pv.x + x;
        yv = pv.y + y;
        if (Math.abs(xv - xm) < 50 && Math.abs(yv - ym) < 50) {
            puncte.add(new Point(xv, yv));
            return false;
        } else {
            puncte.add(new Point(xm, ym));
            return true;
        }
    }

    Polygon(DataInputStream dis) throws IOException {
        super(dis);
    }

    Polygon(ArrayList<Integer> numere) throws IOException {
        super(numere);
    }

    Polygon(DataInputStream dis, boolean citeste) throws IOException {
        super(dis, false);
    }
}
