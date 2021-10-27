public class Main {
    public static void main(String[] args) {

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10;
            System.out.println(array[i]);
        }

        System.out.println("***********************");

        for (int i = 0; i < array.length; i++) {
            if (i < 10){
                int apoio = array[array.length - (i + 1)];
                array[array.length - (i + 1)] = array[i];
                array[i] = apoio;
            }
            System.out.println(array[i]);
        }
        System.out.println("***********************");
        System.out.println(nOcorrencias(array, 100));
    }

    // Método que retorna quantas ocorrências de um elemento estão na lista

    public static int nOcorrencias(int[] l, Integer el){
        int qtd = 0;
        for (int i = 0; i < l.length; i++){
            if (l[i] == el){
                qtd++;
            }
        }
        return qtd;
    }

    // Método que retorna true se l tem elementos repetidos

    public static boolean hasRepeat(int[] l){
        for (int i = 0; i < l.length; i++){
            for (int j = 1; j < l.length; j++){
                if (l[i] == l[j]){
                    return true;
                }
            }
        }
        return false;
    }

    // Método que retorna o número de elementos repetidos em l

    public static int nroRepeat(int[] l){
        int repetidos = 0;
        for (int i = 0; i < l.length; i++){
            for (int j = 1; j < l.length; j++) {
                if (l[i] == l[j]) {
                    repetidos++;
                }
            }
        }
        return repetidos;
    }

    // Método que retorna uma lista de elementos repetidos de l

    public static int[] listRepeat(int[] l){
        int [] lista = new int [l.length - 1];
        int controle = 0;
        for (int i = 0; i < l.length; i++){
            for (int j = 1; j < l.length; j++){
                if (l[i] == l[j]){
                    lista[0] = l[i];
                    controle++;
                }
            }
        }
        return lista;
    }

    // Método que retorna a união de l1 e l2

    public static int[] union(int[] l1, int[] l2){
        int controle = 0;
        int [] lista;

        if (l1.length > l2.length){
            lista = new int [l1.length];
        }else{
            lista = new int [l2.length];
        }

        for (int i = 0; i < l1.length; i++){
            for (int j = 0; j < l2.length; j++){
                if (i == j){
                    lista[controle] = i;
                }
            }
        }
    }
}

