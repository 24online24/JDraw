package graphix;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import static java.lang.Math.abs;
import java.util.ArrayList;
import static graphix.Interface.g;

public class Rectangle extends Figure {

    int w, h;

    public Rectangle(int x, int y, int w, int h, Color c, boolean filled) {
        super(x, y, c, filled);
        this.w = w;
        this.h = h;
    }

    Rectangle(DataInputStream dis) throws IOException {
        super(dis);
        w = Integer.parseInt(dis.readLine());
        h = Integer.parseInt(dis.readLine());
    }

    Rectangle(ArrayList<Integer> numere) throws IOException {
        super(numere);
        w = numere.remove(0); // nu am idee ce argument trebuie
        h = numere.remove(0); // 0 e la cerc
    }

    Rectangle(DataInputStream dis, boolean citeste) throws IOException {
        super(dis, false);
        w = dis.readShort();
        h = dis.readShort();
    }

    public void save(PrintStream ps) {
        ps.println(1);
        super.save(ps);
        ps.println(w);
        ps.println(h);
    }

    public void save2(PrintStream ps) {
        ps.print("1, ");
        super.save2(ps);
        ps.print(w + ", ");
        ps.println(h);
    }

    public void save2(DataOutputStream dos) throws IOException {
        dos.writeByte(1);
        super.save2(dos);
        dos.writeShort(w);
        dos.writeShort(h);
    }

    @Override
    void draw() {
        if (filled) {
            g.fillRect(x - (int) (w / 2), y - (int) (h / 2), w, h);
        }
        g.drawRect(x - (int) (w / 2), y - (int) (h / 2), w, h);
    }

    @Override
    void resize(int xm, int ym) {
        delete();
        w = abs(xm - x) * 2;
        h = abs(ym - y) * 2;
        show();
    }
    
    @Override
    int[] getCoords() {
        return new int[]{x - (int) (w / 2), y - (int) (h / 2), x + (int) (w / 2), y + (int) (h / 2)};
    }
}
