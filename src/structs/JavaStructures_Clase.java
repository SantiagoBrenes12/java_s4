/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structs;

import javax.swing.JOptionPane;

/**
 *
 * @author Puta'
 */
public class JavaStructures_Clase {
     public static void funcSwitch(){
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
     
     public static void funcFor(){
         String diasDeLaSemana = "";
         for (int i = 1; i <= 7; i++) {
             switch (i) {
                 case 1:
                     diasDeLaSemana = diasDeLaSemana+ "Lunes";
                     break;
                case 2:
                    diasDeLaSemana = diasDeLaSemana+ ", Martes";
                    break;
                case 3:
                     diasDeLaSemana = diasDeLaSemana+ ", Miercoles";
                     break;
                case 4:
                     diasDeLaSemana = diasDeLaSemana+ ", Jueves";
                     break;
                case 5:
                     diasDeLaSemana = diasDeLaSemana+ ", Viernes";
                     break;
                case 6:
                     diasDeLaSemana = diasDeLaSemana+ ", Sabado";
                     break;
                case 7:
                     diasDeLaSemana = diasDeLaSemana+ ", Domingo";
                     break;
            
             }
         }
         JOptionPane.showMessageDialog(null, diasDeLaSemana);
     }
     
     public static void funcWhile(){
         String meses = "";
         int i = 1;
         
         while (i<=12) {                          
             switch (i) {
                 case 1:
                     meses = meses+ "Enero";
                     break;
                case 2:
                    meses = meses+ ", Febrero";
                    break;
                case 3:
                     meses = meses+ ", Marzo";
                     break;
                case 4:
                     meses = meses+ ", Abril";
                     break;
                case 5:
                     meses = meses+ ", Mayo";
                     break;
                case 6:
                     meses = meses+ ", Junio";
                     break;
                case 7:
                     meses = meses+ ", Julio";
                     break;
                case 8:
                     meses = meses+ ", Agosto";
                     break;
                case 9:
                     meses = meses+ ", Septiembre";
                     break;
                case 10:
                     meses = meses+ ", Octubre";
                     break;
                case 11:
                     meses = meses+ ", Noviembre";
                     break;
                case 12:
                     meses = meses+ ", Diciembre";
                     break;
             }
            i++;
         }
         JOptionPane.showMessageDialog(null, meses);
     }
    
}
