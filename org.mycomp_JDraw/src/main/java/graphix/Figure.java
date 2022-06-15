package graphix;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import static graphix.Interface.g;

abstract class Figure {

    int x, y;
    Color c;
    boolean filled;
    public static int EPS = 25;
    static int marcDist = 3;
    static Object o = new Object();

    public Figure(int x, int y, Color c, boolean filled) {
        this.x = x;
        this.y = y;
        this.c = c;
        this.filled = filled;
    }

    Figure(DataInputStream dis) throws IOException {
        c = new Color(Integer.parseInt(dis.readLine()));
        filled = Boolean.parseBoolean(dis.readLine());
        x = Integer.parseInt(dis.readLine());
        y = Integer.parseInt(dis.readLine());
    }

    Figure(ArrayList<Integer> numere) {
        c = new Color(numere.remove(0));
        filled = numere.remove(0) == 1;
        x = numere.remove(0);
        y = numere.remove(0);
    }

    Figure(DataInputStream dis, boolean citeste) throws IOException {
        c = new Color(dis.readInt());
        short shortFilled = dis.readShort();
        filled = shortFilled == 1;
        x = dis.readShort();
        y = dis.readShort();
    }

    public void salveaza(PrintStream ps) {
        ps.println(c.getRGB());
        ps.println(filled);
        ps.println(x);
        ps.println(y);
    }

    public void salveaza2(PrintStream ps) {
        ps.print(c.getRGB() + ", ");
        int intFilled = filled ? 1 : 0;
        ps.print(intFilled + ", ");
        ps.print(x + ", ");
        ps.print(y + ", ");
    }

    public void salveaza2(DataOutputStream dos) throws IOException {
        dos.writeInt(c.getRGB());
        short shortFilled = (short) (filled ? 1 : 0);
        dos.writeShort(shortFilled);
        dos.writeShort((short) x);
        dos.writeShort(y);
    }

    abstract void deseneaza();

    abstract void redimensioneaza(int xm, int ym);

    void afiseaza() {
        g.setColor(c);
        deseneaza();
    }

    void sterge() {
        g.setColor(Color.WHITE);
        deseneaza();
    }

    void muta(int xm, int ym) {
        sterge();
        x = xm;
        y = ym;
        afiseaza();
    }

    public void afiseazaMarcaj() {
        g.setColor(Color.BLUE);
        deseneazaMarcaj();
    }

    public void stergeMarcaj() {
        g.setColor(Color.WHITE);
        deseneazaMarcaj();
    }

    abstract int[] getCoords();

    public void deseneazaMarcaj() {
        int coords[], xm, xM, ym, yM;
        coords = getCoords();
        xm = coords[0];
        ym = coords[1];
        xM = coords[2];
        yM = coords[3];

        g.drawRect(xm - marcDist, ym - marcDist, xM - xm + marcDist * 2, yM - ym + marcDist * 2);
        
        g.drawRect(xm - marcDist * 2, ym - marcDist * 2, marcDist*2, marcDist*2);
        g.drawRect(xM, ym - marcDist * 2, marcDist*2, marcDist*2);
        g.drawRect(xm - marcDist * 2, yM, marcDist*2, marcDist*2);
        g.drawRect(xM, yM, marcDist*2, marcDist*2);
    }

    public boolean aproape(int xm, int ym) {
        return Math.abs(x - xm) < EPS && Math.abs(y - ym) < EPS;
    }

    public boolean adauga(int xm, int ym) {
        return true;
    }

    public void incheie() {
    }
    
//    public void moveRandomly(){
//        int coords[], xm, xM, ym, yM;
//        coords = getCoords();
//        xm = coords[0];
//        ym = coords[1];
//        xM = coords[2];
//        yM = coords[3];
//        
//        
//    }
}
