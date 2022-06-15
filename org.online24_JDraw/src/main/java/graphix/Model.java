package graphix;

import static graphix.Interface.figuri;
import javax.swing.table.AbstractTableModel;

public class Model extends AbstractTableModel {

    @Override
    public int getRowCount() {
        return figuri.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int n) {
        switch (n) {
            case 0:
                return "Layer";
            case 1:
                return "X";
            case 2:
                return "Y";
            case 3:
                return "Filled";
            case 4:
                return "Red";
            case 5:
                return "Green";
            default:
                return "Blue";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Figure f = figuri.get(rowIndex);
        switch (columnIndex) {
            case 0:
                if (f instanceof Circle) {
                    return "Cerc";
                }
                if (f instanceof Rectangle) {
                    return "Dreptunghi";
                }
                if (f instanceof Polygon) {
                    return "Poligon";
                }
                if (f instanceof Line) {
                    return "Linie";
                }
            case 1:
                return f.x;
            case 2:
                return f.y;
            case 3:
                return f.filled;
            case 4:
                return f.c.getRed();
            case 5:
                return f.c.getGreen();
            default:
                return f.c.getBlue();
        }
    }

    @Override
    public Class getColumnClass(int c) {
        switch (c) {
            case 0:
                return String.class;
            default:
                return Integer.class;
        }
    }

}
