package swingsample1;

import javax.swing.*;
import java.awt.*;

public class CompressedSwing extends JFrame {
    private JLabel name, units, grade, imageLogo;
    private JButton button;
    
    public CompressedSwing(String n, double u, double g, ImageIcon logo){
        super("Exercise 11");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450,450);
        
        /* Setting a layout */
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        /* Adding text */
        name = new JLabel(n);
        name.setForeground(Color.black);
        name.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 35));
        this.add(name);

        units = new JLabel("units: " + u);
        units.setForeground(Color.black);
        units.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.add(units);
         
        grade = new JLabel("grades: " + g);
        grade.setForeground(Color.black);
        grade.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.add(grade);

        /* Adding an image */
        imageLogo = new JLabel();
        imageLogo.setIcon(logo);
        imageLogo.setHorizontalTextPosition(JLabel.CENTER);
        imageLogo.setVerticalTextPosition(JLabel.BOTTOM);
        this.add(imageLogo);
        
        /* Adding a button */
        button = new JButton("Next");
        button.setHorizontalTextPosition(JButton.LEFT);
        this.add(button);
        
        this.setVisible(true);
    }
}
