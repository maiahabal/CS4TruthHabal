/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingsample1;

import javax.swing.ImageIcon;

/**
 *
 * @author Lauan 03
 */
public class RunCompressedSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        //new CompressedSwing("Math", "4 Units", "1.75", logo);
        
        String subName = "math", fileName = subName+".png";
        double units = 0, grade = 0;
        
        switch (subName){
            case "math":
            units = 4;
            grade = 1.75;
            break;

            case "biology":
            units = 3;
            grade = 2.00;
            break;

            case "chemistry":
            units = 3;
            grade = 1.50;
            break;

            case "physics":
            units = 3;
            grade = 1.75;
            break;

            case "computer science":
            units = 1;
            grade = 1.50;
            break;
        }

        Subject subject= new Subject(subName, fileName, units, grade);
        ImageIcon logo = new ImageIcon(RunCompressedSwing.class.getResource(subject.getImgFileName()));
        new CompressedSwing(subName, subject.getUnits(), subject.getGrade(), logo);
    }
    
}
