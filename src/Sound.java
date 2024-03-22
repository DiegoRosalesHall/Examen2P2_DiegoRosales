
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego
 */
public class Sound extends Thread {
    

        private Clip clip;
        private String inputFile;
        
        public Sound(String path) {
            this.inputFile = path;
            
        }
        
        @Override // sobreescribir
        public void run() {
            try {
                File archivo = new File(inputFile);                
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivo);
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
                
                while (!clip.isRunning()) {
                    Thread.sleep(10);
                    
                }
                while (clip.isRunning()) {
                    Thread.sleep(10);
                    
                }
                clip.stop();
                audioInputStream.close();
                
            } catch (Exception e) {
                e.printStackTrace();
                
            }
            return;
            
        }
        
    }

