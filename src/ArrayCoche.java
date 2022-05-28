/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ArrayCoche {

    public ArrayList LCoche;
    Coche Coche;

    public ArrayCoche() {
        LCoche = new ArrayList();
        Coche = new Coche();
    }

    public int getBuscarMatricula(String Dni) {
        int i;
        Coche temp = null;
        for (i = 0; i < LCoche.size(); i++) {
            temp = (Coche) LCoche.get(i);
            if (temp.getDni().equals(Dni)) {
                return i;
            }
        }
        return -1;
    }

    public void setAddCarro(
            JTextField jtfColor,
            JTextField jtfMarca,
            JTextField jtfModelo,
            JTextField Numc,
            String Matricula,
            JTextField NumeP
    ) {

        int posB = getBuscarMatricula(Matricula);
        if (posB != -1) {
            JOptionPane.showMessageDialog(null,
                    "La Matricula ya esta registrada. "
                    + "Intente nuevamente!");
        } else {
            Coche info = new Coche(
                    jtfColor.getText(),
                    jtfMarca.getText(),
                    Matricula,
                    jtfModelo.getText(),
                    Float.parseFloat(Numc.getText()),
                    Integer.parseInt(NumeP.getText())
            );
            LCoche.add(info);
            JOptionPane.showMessageDialog(null,
                    "¡Nuevo Carro registrado!");
            jtfColor.setText("");
            jtfMarca.setText("");
            jtfModelo.setText("");
            Numc.setText("");
            NumeP.setText("");
            jtfColor.requestFocus();
        }
    }

    public void setPersona(
            String idEmp
    ) {
        int posB = getBuscarMatricula(idEmp);
        if (posB == -1) {
            JOptionPane.showMessageDialog(null,
                    "¡El carro a eliminar no esta registrada!");
        } else {
            LCoche.remove(posB);
            JOptionPane.showMessageDialog(null,
                    "Carro eliminado de la posición: " + posB);
        }
    }

    public void setModificarEmpleado(
            String Matricula, String Color, String Marca, String Modelo, float NumeC, int NumP
    ) {
        int posB = getBuscarMatricula(Matricula);
        if (posB == -1) {
            JOptionPane.showMessageDialog(null,
                    "El Dato no se encuetra");
        } else {
            Coche info = new Coche(
                    Color, Marca, Matricula, Modelo, NumeC, NumP
            );
            LCoche.set(posB, info);
            JOptionPane.showMessageDialog(null,
                    "Datos del Carro fue modificado!");
        }
    }

    public void setRegistrarFilaJTable(DefaultTableModel miModelo,
            int Fila, int indiceArray) {

        Coche temp = (Coche) LCoche.get(indiceArray);
        miModelo.setValueAt(temp.getMarca(), Fila, 0);
        miModelo.setValueAt(temp.getModelo(), Fila, 1);
        miModelo.setValueAt(temp.getColor(), Fila, 2);
        miModelo.setValueAt(temp.getNumC(), Fila, 3);
        miModelo.setValueAt(temp.getNumP(), Fila, 4);
        miModelo.setValueAt(temp.getDni(), Fila, 5);
    }

    public void setLlenarJTable(JTable tab) {
        int indice = 0;
        int i = 0;
        DefaultTableModel miModelo = new DefaultTableModel();
        miModelo.addColumn("Marca");
        miModelo.addColumn("Modelo");
        miModelo.addColumn("Color");
        miModelo.addColumn("NumC");
        miModelo.addColumn("NumP");
        miModelo.addColumn("DNI");
        while (indice < LCoche.size()) {
            miModelo.addRow(new Object[]{"", "", "", "", "", ""});
            setRegistrarFilaJTable(miModelo, i, indice);
            i++;
            indice++;
        }
        tab.setModel(miModelo);
    }

    void setAddCarro2(String Marca, String Modelo, String Color, float NumC, int NumP, String Matricula) {

        int posB = getBuscarMatricula(Matricula);
        if (posB != -1) {
            JOptionPane.showMessageDialog(null,
                    "El idEmpleado ya esta registrado. "
                    + "Intente nuevamente!");
        } else {
            Coche info = new Coche(
            Color,
            Marca,
            Matricula,
            Modelo,
            NumC,
            NumP
            );
            LCoche.add(info);
            

        }
    }

 

}
