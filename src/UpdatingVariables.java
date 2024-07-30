public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //bono $200
        salary = salary + 200;
        System.out.println(salary);

        //pensión: $50 descuento
        salary = salary - 50;
        System.out.println(salary);

        //2 horas extra $30 3/u
        //Comida: $45 45

        salary = salary + (30*2) - 45;
        System.out.println(salary);


        //Actualizando cadenas de texto
        String employeeName = "Lisandro";
        employeeName = employeeName + " Flores Brito";
        System.out.println(employeeName);

        employeeName = "Enrique " + employeeName;
        System.out.println(employeeName);

        System.out.println("Tu nombre es: " + employeeName);

        String pepe = "El pepe";
        String sech = " Ete sech";

        System.out.println(pepe + " y" + sech + " son amigos");


    }
}
