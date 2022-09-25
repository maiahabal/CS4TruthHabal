
package q1ex1;

public class q1ex1 {

    public static void main(String[] args) {

        String magic1 = "Fire Dragon Slayer";
        String birthyear1 = "X765";
        int height1 = 171;
        String magic2 = "Spatial Magic";
        String birthyear2 = "X765";
        int height2 = 169;
        String magic3 = "Ice-Make";
        String birthyear3 = "X766";
        int height3 = 180;
        int aveheight = (height1 + height2 + height3) / 3;
        
        System.out.println("Fairy Tail Characters\n");
        System.out.println("Natsu Dragneel\nMagic Type: " + magic1 + "\nYear of Birth: " + birthyear1 + "\nHeight (cm): " + height1 + "\n");
        System.out.println("Erza Scarlet\nMagic Type: " + magic2 + "\nYear of Birth: " + birthyear2 + "\nHeight (cm): " + height2 + "\n");
        System.out.println("Gray Fullbuster\nMagic Type: " + magic3 + "\nYear of Birth: " + birthyear3 + "\nHeight (cm): " + height3 + "\n");
        System.out.println("Average height in cm: " + aveheight);
        if(magic1 == magic2 && magic2 == magic3){
            System.out.println("All characters have the same magic type: True");
        } else {System.out.println("All characters have the same magic type: False");}
        if(birthyear1 == birthyear2 && birthyear2 == birthyear3){
            System.out.println("All characters born in the same year: True");
        } else {System.out.println("All characters born in the same year: False");}
        
    }
    
}
