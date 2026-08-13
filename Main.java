public class Main {

    public static void meses(){
        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        System.out.println("Tamaño: " + mes.length);
        
        for(String m : mes){
            System.out.println(m);
        }
    }
    public static void main(String[] args) {
        meses();
    }
}