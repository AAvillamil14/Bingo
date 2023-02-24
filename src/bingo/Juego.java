/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Juego extends Bingo {

    private List<Integer> numeros = new ArrayList<>();
    HashMap<List,List> map = new HashMap<>();
    private final List<String> letras = new ArrayList<>(Arrays.asList("B", "B", "B", "B", "I", "I", "I", "I", "I", "N", "N", "N", "N", "N", "G", "G", "G", "G", "G", "O", "O", "O", "O", "O"));

    public void contenidojuego() {
        Random aleatorios = new Random();
        int b = 0;
        for (int i = 1; i < 75; i++) {
            super.numeros_bingo.add(i);
//            numeros.add(super.numeros_bingo.get(aleatorios.nextInt(numeros_bingo.size())));
        }
        for (int a = 0; a < 30; a++) {
                try {
                    numeros.add(super.numeros_bingo.get(aleatorios.nextInt(numeros_bingo.size())));
                    JOptionPane.showMessageDialog(null, "La letra es " + letras.get(aleatorios.nextInt(letras.size())) + "\nel numero es: " + numeros.get(a));
                    map.put(letras, numeros);
                    if (a>23) {
                        Thread.sleep(2000);
                        int opcion = JOptionPane.showConfirmDialog(null, "¿Hiciste bingo?");
                        if (opcion == 0) {
                            JOptionPane.showMessageDialog(null, "¡Felicitaciones!, ganaste");
                            JOptionPane.showMessageDialog(null," Tu tablero es  \n"+ map);
                            break;
                        } else if (opcion == 1) {
                            JOptionPane.showMessageDialog(null, "¡Gracias por participar sera en otra ocasion!");
                            break;
                        } else {
                            break;
                        }
                    }
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    JOptionPane.showConfirmDialog(null, "No funciono");
                }
            }
            
            
    }
}
