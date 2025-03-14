public class Main {
    public static void main ( String[]args){
        Pizza laPizza = new
                Pizza("jamon y queso");
        laPizza.prepararMasa();
        laPizza.hornear();
        laPizza.entregar();
        System.out.println(laPizza.toString());
    }
}
