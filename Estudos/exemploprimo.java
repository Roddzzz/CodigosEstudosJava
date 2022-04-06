import java.util.Scanner;

import javax.swing.JOptionPane;

public class exemploprimo {
    public static void main(String[] args){
        int numDivisores = 0;
        int numPrimo = 
            Integer.parseInt(JOptionPane.showInputDialog("digite o numero"));

        for(int i = 1; i <= 0; i++){
            if( numPrimo % i == 0){
                numDivisores++;
            }
        }
        if(numDivisores == 2){
            System.out.println("primo");
        } else{
            System.out.println("n primo");
        }



    }
}
