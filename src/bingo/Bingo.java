/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Bingo {

    List<Integer>numeros_bingo= new ArrayList<>();
    
    public List<Integer> getNumeros_bingo() {
        return numeros_bingo;
    }

    public void setNumeros_bingo(List<Integer> numeros_bingo) {
        this.numeros_bingo = numeros_bingo;
    }
    
    public static void juego(){
        Juego j=new Juego();
        int opcion= JOptionPane.showConfirmDialog(null, "¿Quieres iniciar el bingo?");
        switch(opcion){
            case 0:
                j.contenidojuego();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Vuelve pronto");
                break;
        }
    }
}
