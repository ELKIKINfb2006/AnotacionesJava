public class Funciones {

    /**
     * Lol
     * */
    public static void main(String[] args) {
        double y = 3;
        //Área de un círculo
        //pi + r2
        double area = circuleArea(y);
        System.out.println(area);

        //Área de una esfera
        //4*PI*r2
        sphereArea(y);
        System.out.println(sphereArea(y));

        //Volumen de una esfera
        //(4/3)*PI * r3
        sphereVolume(y);
        System.out.println(sphereVolume(y));

        System.out.println("PESOS A DÓLARES:" + convertToDollar(1000, "COP"));
    
    }

    public static double circuleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolume(double r) {
        return (double) (4 /3) * Math.PI * Math.pow(r,3);

    }

    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero dólares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MNX o COP
     * @return quantity Devuelve la cantidad actualizada en Dólares
     * */
    public static double convertToDollar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.054;
                break;
            case "COP":
                quantity = quantity * 0.00024;
                break;
        }
        return quantity;
    }
}

