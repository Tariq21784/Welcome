/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package welcome;
import javax.swing.*;
/**
 *
 * @author arnol
 */
//public class Welcome {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        JFrame frame = new JFrame();
//        // TODO code application logic here
//        String name = JOptionPane.showInputDialog(frame, "What is your name?");
//        JOptionPane.showMessageDialog(frame, "Welcome " + name);
//
//    }
//    
//}
public class Welcome {  
    JFrame f;  
    Welcome(){  
        f = new JFrame();   
        String name=JOptionPane.showInputDialog(f,"What is your name?");
        JOptionPane.showMessageDialog(f, "Welcome " + name);     
    }  
    public static void main(String[] args) {  
        new Welcome();
//        JOptionPane.showMessageDialog(f, "Welcome " + name);  
    }  
}  
