

public class Casting {
    public static void main(String[] args) {

        //En un año ubicar 30 perritos
        //Cuántos perritos ubiqué al mes

        double montlyDogs = 30/12.;
        System.out.println(montlyDogs);

        //Estimación
        int estimatedMonthlyDogs = (int) montlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //Trunca el valor a un entero
        System.out.println(((int) Math.sqrt(3)));


        //Exactitud
        int a = 30;
        int b = 12;

        System.out.println((double) a/ b);

        double c = (double) a/b;
        System.out.println(c);

        //Obtener PI de un círculo
        double e = 30.1592895;
        double r = 9.6;

        System.out.println(e/r);

        char n = '1';
        int nI = n;
        System.out.println(nI);

        //Es necesario castear a short porque un char es mucho más grande (casteo explícito)
        short nS = (short) n;
        System.out.println(nS);

        System.out. println(nS);

        var z = 8.2;
        var x = 5.46;
        System.out.println(z * x);

        double d = 9.78;
        int num = (int) d; // Explicit casting from double to int
        System.out.println(d); // Output: 9

    }
}
