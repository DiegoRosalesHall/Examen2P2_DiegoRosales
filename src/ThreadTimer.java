
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego
 */
public class ThreadTimer extends Thread{
    JLabel timer;
    Thread t;

    public ThreadTimer(JLabel timer,Thread t) {
        this.timer = timer;
        this.t=t;
    }

    public JLabel getTimer() {
        return timer;
    }

    public void setTimer(JLabel timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        int segundos=00;
        int minutos=00;
        
        while(t.isAlive()){
            if(segundos<60){
                segundos++;
                timer.setText(minutos+":"+segundos);
            }
            else{
                minutos++;
                segundos=00;
                timer.setText(minutos+":"+segundos);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadTimer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        timer.setText("00:00");
        
    }
    
}
