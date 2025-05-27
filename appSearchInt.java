/*
 * NÃO ESTÁ EM COMPILANDO
 * 
 */

import SeqSearch.seqSearchInt;

public class AppSearchInt{
    public static void main(String[] args){
        int[] idades={12, 13, 18, 11};

        int idadeFound=SeqSearch.seqSearch(idades, 12);

        System.out.println("Idade encontrada: " + idadeFound);
    }
}