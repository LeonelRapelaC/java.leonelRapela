import java.util.Scanner;

public class leonelRapela{
    public static void main(String[] args) {

        int var1 = 400;
        System.out.println(var1);

        boolean isPCAvailacle;
        isPCAvailacle = true;

        System.out.println(isPCAvailacle);

        //Narrowing
        int precioEuro = 236;
        byte euroEnByte = (byte) precioEuro;
        System.out.println(euroEnByte);


        //Widening
        byte var2 = 8;
        int var3 = var2;
        System.out.println(var3);

        int modulo = var2 % 8;

        System.out.println("modulo " + modulo);

        int y = 10;
        System.out.println(++y);
        System.out.println(y);

        int k = 30;
        System.out.println(k++);
        System.out.println(k);

        byte j = 4;

        char letra = '4';

        System.out.println(j == letra);

        float valor4 = 500;
        float valor5 = 300;
        System.out.println(valor4 >= valor5);

        float capitalSolisitado = 140000;
        float interes = 0.2f;

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el periodo del mes: ");
        int periodoEnMeses;
        periodoEnMeses = sc .nextInt();
        float intereses = capitalSolisitado * interes * periodoEnMeses;
        float loQueVamosAPagar = intereses + capitalSolisitado;
        System.out.println(loQueVamosAPagar);







    }

}
