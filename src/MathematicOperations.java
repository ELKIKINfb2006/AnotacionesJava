public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //Devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));

        //Deuvuelve un entero hacia abajo
        System.out.println(Math.floor(x));

        //Devuelve un número elevado a otro
        System.out.println(Math.pow(x,y));

        //Devuelve el número mayor
        System.out.println(y);

        //Devuelve la raíz cuadrada
        System.out.println(Math.sqrt(y));

        //Área de un círculo
        //pi + r2
        System.out.println(Math.PI * Math.pow(y,2));

        //Área de una esfera
        //4*PI*r2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        //Volumen de una esfera
        //(4/3)*PI * r3
        System.out.println((double) (4 /3) * Math.PI * Math.pow(y,3));


    }
}
 