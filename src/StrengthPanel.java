
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hannah
 */
public class StrengthPanel extends JPanel {
    
    private double [] strengthValues = new double[4];
    private int str = 0;
    private int value = 0;
          
    public void updateLeaguePanel(ArrayList<League> leagues, double strength1, double strength2, double strength3, double strength4){
        // Code to calculate the strength of each league
        // Finally writes the strength of the 4 leagues to a 
        // static array. The array values will be used as
        // values for the strength chart.
        
        //repaint() will call paint() which calls paintComponent()
        strengthValues[0] = strength1;
        strengthValues[1] = strength2;
        strengthValues[2] = strength3;
        strengthValues[3] = strength4;
        repaint();
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g;
        for(int i = 0; i < strengthValues.length; i ++){
        g.setColor(Color.red);
        g.fillRect((i * 70),0 , 40,(int)(strengthValues[i] * (100.0)));
        g.setColor(Color.black);
        g.drawString("L" + (i + 1), (i * 70) + 15, 12);
        DecimalFormat df = new DecimalFormat("#.##");
        strengthValues[i] = Double.valueOf(df.format(strengthValues[i]));
        g.drawString(String.valueOf(strengthValues[i]), (i * 70) + 10, (int)(strengthValues[i] * (100.0)) + 12);
        }
    }
    }
    
    
