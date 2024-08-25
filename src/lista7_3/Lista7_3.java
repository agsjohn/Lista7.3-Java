package lista7_3;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lista7_3 {
    public static void main(String[] args) {
        final int LIMITEMAX = 100;
        final int LINHA = 5;
//        final int COLUNA = 5;
        int vet[][] = new int [LINHA][LINHA];
        int numRepetido = 0;
        for(int x=0; x < LINHA; x++){
            for(int y=0; y < LINHA; y++){
                vet[x][y] = (int) (Math.random() * (LIMITEMAX+1));
            }
        }
        for(int x=0; x < LINHA; x++){
            for(int y=0; y < LINHA; y++){
                for(int x1=0; x1 <= x; x1++){
                    for(int y1=0; y1 < y; y1++){
                        if(vet[x][y] == vet[x1][y1]){
                            numRepetido++;
                        }
                    }
                }
            }
        }
        String vetorOriginal = "";
        for (int x = 0; x < LINHA; x++) {
            vetorOriginal += Arrays.toString(vet[x]) + "\n";
        }
        JOptionPane.showMessageDialog(null, "Matriz original: \n" +vetorOriginal+ "\nNúmeros repetidos: " 
                +numRepetido);
    }    
}
