/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wac.a.mole;

import java.util.Random;

/**
 *
 * @author bernicchi.davide
 */
public class ThreadManager extends Thread {
    ThreadBuco[] tb = {null,null,null,null,null,null,null,null,null,};
    Hole[] buchi;
    
    
    ThreadManager(Hole[] b){
        buchi= b;
        for(int i =0; i<tb.length; i++){
            tb[i] = new ThreadBuco(buchi[i]);
        }
    }
    
    void ThreadStarter(){
        Random ran = new Random();
        tb[ran.nextInt(1,9)].run();
        tb[ran.nextInt(1,9)].run();
        tb[ran.nextInt(1,9)].run();
    }
}
