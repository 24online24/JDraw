package graphix;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import static graphix.Interface.g;

public class Circle extends Figure {

    int r;

    public Circle(int x, int y, int r, Color c, boolean filled) {
        super(x, y, c, filled);
        this.r = r;
    }

    Circle(DataInputStream dis) throws IOException {
        super(dis);
        r = Integer.parseInt(dis.readLine());
    }

    Circle(ArrayList<Integer> numere) throws IOException {
        super(numere);
        r = numere.remove(0);
    }

    Circle(DataInputStream dis, boolean citeste) throws IOException {
        super(dis, false);
        r = dis.readShort();
    }

    public void salveaza(PrintStream ps) {
        ps.println(0);
        super.salveaza(ps);
        ps.println(r);
    }

    public void salveaza2(PrintStream ps) {
        ps.print("0, ");
        super.salveaza2(ps);
        ps.println(r);
    }

    public void salveaza2(DataOutputStream dos) throws IOException {
        dos.writeByte(0);
        super.salveaza2(dos);
        dos.writeShort(r);
    }

    @Override
    void deseneaza() {
        if (filled) {
            g.fillOval(x - r, y - r, 2 * r, 2 * r);
        }
        g.drawOval(x - r, y - r, 2 * r, 2 * r);
    }

    @Override
    void redimensioneaza(int xm, int ym) {
        sterge();
        r = (int) Math.sqrt((x - xm) * (x - xm) + (y - ym) * (y - ym));
        afiseaza();
    }

    @Override
    int[] getCoords() {
        return new int[]{x - r, y - r, x + r, y + r};
    }

}
