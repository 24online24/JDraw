package graphix;

import static graphix.Interface.g;
// import static test.Interface.HEIGHT;
// import static test.Interface.WIDTH;
import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Line extends Figure {

    ArrayList<Point> puncte;
    int dxM, dxm;
    int dyM, dym;

    void calculeazaLimite() {
        dxm = 0;
        dym = 0;
        dxM = 0;
        dyM = 0;
        for (Point p : puncte) {
            if (p.x < dxm) {
                dxm = p.x;
            }
            if (p.x > dxM) {
                dxM = p.x;
            }
            if (p.y < dym) {
                dym = p.y;
            }
            if (p.y > dyM) {
                dyM = p.y;
            }

        }
    }

    Line(int xm, int ym, Color c, boolean filled) {
        super(0, 0, c, filled);
        puncte = new ArrayList();
        puncte.add(new Point(xm, ym));
    }

//    public boolean atingeSJ() {
//        return y <= -dym || y >= HEIGHT - dym;
//    }
//
//    public boolean atingeSD() {
//        return x <= -dxm || x >= WIDTH - dxM;
//    }
    Line(DataInputStream dis) throws IOException {
        super(dis);
        int n
                = Integer.parseInt(dis.readLine());
        puncte = new ArrayList();
        for (int i
                = 0; i < n; i++) {
            puncte.add(new Point(Integer.parseInt(dis.readLine()),
                    Integer.parseInt(dis.readLine())));
        }
        calculeazaLimite();
    }

    Line(ArrayList<Integer> numere) throws IOException {
        super(numere);
        int n = numere.remove(0);
        puncte = new ArrayList();
        for (int i = 0; i < n;
                i++) {
            puncte.add(new Point(numere.remove(0), numere.remove(0)));
        }
        calculeazaLimite();
    }

    Line(DataInputStream dis, boolean citeste) throws IOException {
        super(dis, false);
        int n = dis.readShort();
        puncte = new ArrayList();
        for (int i = 0; i < n; i++) {
            puncte.add(new Point(dis.readShort(),
                    dis.readShort()));
        }
        calculeazaLimite();
    }

    public void salveaza(PrintStream ps) {
        if (this instanceof Polygon) {
            ps.println(3);
        } else {
            ps.println(2);
        }
        super.salveaza(ps);
        ps.println(puncte.size());
        for (Point p : puncte) {
            ps.println(p.x);
            ps.println(p.y);
        }
    }

    public void salveaza2(PrintStream ps) {
        if (this instanceof Polygon) {
            ps.print(3 + ", ");
        } else {
            ps.print(2 + ", ");
        }
        super.salveaza2(ps);
        ps.print(puncte.size() + ", ");
        for (Point p : puncte) {
            ps.print(p.x + ", ");
            ps.print(p.y + ", ");
        }
        ps.println("");
    }

    public void salveaza2(DataOutputStream dos) throws IOException {
        if (this instanceof Polygon) {
            dos.writeByte(3);
        } else {
            dos.writeByte(2);
        }
        super.salveaza2(dos);
        dos.writeShort(puncte.size());
        for (Point p : puncte) {
            dos.writeShort(p.x);
            dos.writeShort(p.y);
        }
    }

    public void incheie() {
        int xM = 0, xm = Integer.MAX_VALUE;
        int yM = 0, ym = Integer.MAX_VALUE;
        for (Point p : puncte) {
            if (p.x < xm) {
                xm = p.x;
            }
            if (p.x > xM) {
                xM = p.x;
            }
            if (p.y
                    < ym) {
                ym = p.y;
            }
            if (p.y > yM) {
                yM = p.y;
            }
        }

        x = (xm + xM) / 2;
        y = (ym + yM) / 2;

        for (Point p : puncte) {
            p.x -= x;
            p.y -= y;
        }
        dxm = xm - x;
        dym = ym - y;
        dxM = xM - x;
        dyM = yM - y;
        calculeazaLimite();
    }

    @Override
    public boolean adauga(int xm, int ym) {
        puncte.add(new Point(xm, ym));
        return true;
    }

    @Override
    void deseneaza() {
        int xv, yv;
        Point pv = puncte.get(0);
        xv = pv.x + x;
        yv = pv.y + y;

        for (Point p : puncte) {
            g.drawLine(xv, yv, p.x + x, p.y + y);
            xv = p.x + x;
            yv = p.y + y;
        }
    }

    @Override
    void redimensioneaza(int xm, int ym) {
    }

    @Override
    int[] getCoords() {
        return new int[]{x + dxm, y + dym, x + dxM, y + dyM};
    }
}
