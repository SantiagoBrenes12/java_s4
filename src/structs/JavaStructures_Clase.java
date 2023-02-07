/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structs;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Puta'
 */
public class JavaStructures_Clase {

    public static void funcSwitch() {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dia del 1 al 7"));
        switch (dia) {
            case 1:
                JOptionPane.showMessageDialog(null, "El dia seleccionado es Lunes");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "El dia seleccionado es Martes");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "El dia seleccionado es Miercoles");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "El dia seleccionado es Jueves");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "El dia seleccionado es Viernes");
                break;

            default:
                JOptionPane.showMessageDialog(null, "El dia seleccionado es invalido");

        }
    }

    public static void funcFor() {
        String diasDeLaSemana = "";
        for (int i = 1; i <= 7; i++) {
            switch (i) {
                case 1:
                    diasDeLaSemana = diasDeLaSemana + "Lunes";
                    break;
                case 2:
                    diasDeLaSemana = diasDeLaSemana + ", Martes";
                    break;
                case 3:
                    diasDeLaSemana = diasDeLaSemana + ", Miercoles";
                    break;
                case 4:
                    diasDeLaSemana = diasDeLaSemana + ", Jueves";
                    break;
                case 5:
                    diasDeLaSemana = diasDeLaSemana + ", Viernes";
                    break;
                case 6:
                    diasDeLaSemana = diasDeLaSemana + ", Sabado";
                    break;
                case 7:
                    diasDeLaSemana = diasDeLaSemana + ", Domingo";
                    break;

            }
        }
        JOptionPane.showMessageDialog(null, diasDeLaSemana);
    }

    public static void funcWhile() {
        String[] arrayMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        Map<Integer, String> mesesMap = new HashMap<Integer, String>();
        String meses = "";

        for (int i = 0; i < arrayMeses.length; i++) {
            mesesMap.put(i, arrayMeses[i]);
            meses = meses + mesesMap.get(i) + ", ";
        }

        meses = meses.substring(0, meses.lastIndexOf(", "));
        JOptionPane.showMessageDialog(null, meses);
    }

}
