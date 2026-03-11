/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wac.a.mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author bernicchi.davide
 */
public class GestoreGioco {
    Mole[] talpe = {new Mole(TypeMole.Norm),new Mole(TypeMole.Oro),new Mole(TypeMole.Albina)}; 
    Hole[] buchi = {new Hole(talpe),new Hole(talpe),new Hole(talpe),new Hole(talpe),new Hole(talpe),new Hole(talpe),new Hole(talpe),new Hole(talpe),new Hole(talpe)};
    ThreadManager tm= new ThreadManager(buchi);    
    
    //implementare runnable
    Timer rt = new Timer(1000, new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                riempiBuchi();
        }
    });
  
    GestoreGioco(){
    }
    
    void iniziaRound(){
        rt.start();
    }
    
    void riempiBuchi(){
        /*Random ran = new Random();
        Hole[] output = {buchi[ran.nextInt(1,9)], buchi[ran.nextInt(1,9)], buchi[ran.nextInt(1,9)]};
        return output; */
        tm.ThreadStarter();
    }
}
