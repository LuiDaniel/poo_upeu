public class Main {

    public static void meses(){
        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        System.out.println("Tamaño: " + mes.length);
        
        for(String m : mes){
            System.out.println(m);
        }

        mes[0] = "";

        for(String m : mes){
            if(!m.equals(mes)){
                System.out.println(m);
            }
            
        }
    }

    public static void imprimirMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] != 0){
                    System.out.print(matriz[i][j] + " \t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }

    public static int[][] matrizf5(int tamanio, int num){
        int matriz [][] = new int[tamanio][tamanio];
        for(int i = 0; i <matriz.length; i++){
            for(int j = matriz[i].length - 1; j > matriz[i].length - 1 - i; j--){
                matriz[i][j] = num;
                num++;
            }
        }
        return matriz;
    }

    public static int[][] matrizf9(int tamanio, int num){
        int matriz [][] = new int[tamanio][tamanio];
        for(int i = 0; i < matriz.length; i++){
            for(int j = matriz[i].length - 1; j > matriz[i].length - 1 - i; j--){
                matriz[i][j] = num;
                num++;
            }
        }
        return matriz;
    }
  
    public static int[][] matrizf13(int tamanio, int num){
        int matriz[][] = new int[tamanio][tamanio];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length-i; j++){
                matriz[j][i] = num++;
            }
        }
        return matriz;
    }
    public static void main(String[] args) {
        //meses();
        //int [][] m = {
        //    {0, 2},
        //    {3, 4}
        imprimirMatriz(matrizf13(5, 0));

        
    }
}