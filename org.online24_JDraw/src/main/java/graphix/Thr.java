package graphix;

import static graphix.Interface.wjPanel1;
import static graphix.Interface.hjPanel1;
import static graphix.Figure.o;
import static graphix.Interface.model;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Thr extends Thread {

    Figure f;

    Thr(Figure f) {
        this.f = f;
    }

    public void run() {
        int coords[], xm, xM, ym, yM;
        int i = new Random().nextInt(-1, 2);
        int j = new Random().nextInt(-1, 2);
        while (true) {
            synchronized (o) {
                f.muta(f.x + 1 * i, f.y + 1 * j);
                model.fireTableDataChanged();
                coords = f.getCoords();
                xm = coords[0];
                ym = coords[1];
                xM = coords[2];
                yM = coords[3];
//                System.out.println(xm + " " + ym + " " + xM + " " + yM + " " + ljPanel1 + " " + hjPanel1);
//                System.out.println(wjPanel1 + " " + hjPanel1);
                if (xm < 0 || xM > wjPanel1) {
                    i = -i;
                }
                if (ym < 0 || yM > hjPanel1) {
                    j = -j;
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thr.class.getName()).log(Level.SEVERE, null, ex);
            }
//            try {
//                Thread.sleep(new Random().nextInt(50));
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Thr.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }

    }
}
