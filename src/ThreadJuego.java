
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego
 */
public class ThreadJuego extends Thread{
    Carro carro1,carro2;
    JProgressBar jpb1,jpb2;
    JFrame frame;
    JLabel tiemp;

    public ThreadJuego(Carro carro1, Carro carro2, JProgressBar jpb1, JProgressBar jpb2, JFrame frame, JLabel tiemp) {
        this.carro1 = carro1;
        this.carro2 = carro2;
        this.jpb1 = jpb1;
        this.jpb2 = jpb2;
        this.frame = frame;
        this.tiemp=tiemp;
    }

    @Override
    public void run() {
        jpb1.setValue(0);
        jpb2.setValue(0);
        boolean victory1=false;
        boolean victory2=false;
        
        while(victory1==false || victory2==false){
            jpb1.setValue(jpb1.getValue()+carro1.getVelocidad());
            jpb2.setValue(jpb2.getValue()+carro2.getVelocidad());
            if(jpb1.getValue()>=1000){
                victory1=true;
                
            }
            if(jpb2.getValue()>=1000){
                victory2=true;
            }
            
            
            if(victory1||victory2){
                break;
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadJuego.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        if(victory1 && victory2){
            
            JOptionPane.showMessageDialog(frame, "Empate \n Tiempo: "+tiemp.getText());
            }
        else if(victory1 == true){
            
            JOptionPane.showMessageDialog(frame, "Jugador 1 ha ganado \n Tiempo: "+tiemp.getText());
        }
        else if(victory2 == true){
            JOptionPane.showMessageDialog(frame, "Jugador 2 ha ganado \n Tiempo: "+tiemp.getText());
        }
        jpb1.setValue(0);
        jpb2.setValue(0);
    }
    
    
}
