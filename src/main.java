import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        System.out.println("Hola mundo 1");
        Scanner entrada = new Scanner(System.in);
        System.out.println("cual su nombre");
        String nombre= entrada.nextLine();
        System.out.printf("su nombre es %s",nombre);

    }
}
