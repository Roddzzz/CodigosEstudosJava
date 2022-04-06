import java.util.Scanner;

import javax.swing.JOptionPane;
public class exemplofat {
	public static void main(String [] args){
        int numero =
            Integer.parseInt(JOptionPane.showInputDialog("Digite seu numero aqui"));
        long fatorial = 1;
        int i = 1;

        while(i <= numero){
            fatorial = fatorial * i;
            i++;
        }
        System.out.println("o fatorial de " + numero + " eh " + fatorial);
    }
}
