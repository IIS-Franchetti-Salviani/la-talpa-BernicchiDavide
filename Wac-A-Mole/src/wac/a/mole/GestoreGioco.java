/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wac.a.mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author bernicchi.davide
 */
public class GestoreGioco {
            Timer rt = new Timer(1000, new ActionListener(){
                public void actionPerformed(ActionEvent e) {

            }
        });
  
    GestoreGioco(){
    }
    
    void iniziaRound(){

        rt.start();
    }
}
