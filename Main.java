import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        List<String> colaimpresion = new ArrayList<>();

        colaimpresion.add("Documento1.xlsx");
        colaimpresion.add("Documento2.xlsx");
        colaimpresion.add("Documento3.xlsx");
        System.out.println("La cola de impresion es: " + colaimpresion);

        colaimpresion.remove(0);
        System.out.println("Se ha impreso el Documento1.xlsx " + colaimpresion);

        colaimpresion.add("Documento4.xlsx");
        System.out.println("Se ha agregado el Documento4.xlsx " + colaimpresion);
    }
}