/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package koznaznajava;

import java.awt.Color;

/**
 *
 * @author WIN 10
 */
public class KoZnaZnaJava {
    public static final String QUESTIONS_DATABASE_URL = "jdbc:ucanaccess://src/resursi/questionsAndAnswers.accdb";
    public static final String RESULTS_DATABASE_URL = "jdbc:ucanaccess://src/resursi/results.accdb";
    
    public static final Color NEW_BLUE = new Color(0, 140, 186);
    public static final Color NEW_GREEN = new Color(123, 178, 116);
    public static final Color NEW_RED = new Color(211, 73, 78);
    public static final Color NEW_YELLOW = new Color(246,190,0);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StartingWindow sw = new StartingWindow();
        sw.setLocation(200, 100);
        sw.setVisible(true);
    }
    
}
