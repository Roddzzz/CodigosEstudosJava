public class Exemplot {
    public static void main(String [] args){
        double galoes, litros;
        int count;

        count = 0;
        for (galoes = 1 ; galoes <= 100 ; galoes++){
            litros = galoes * 5;
            System.out.println(galoes + "equivalem a " + litros + "litros");
        
        
        count++;
        if(count == 10){
            System.out.println();
            count = 0;
            }
        }

    }
}
