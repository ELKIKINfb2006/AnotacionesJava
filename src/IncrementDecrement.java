public class IncrementDecrement {
    public static void main(String[] args) {

        int lives = 5;
        lives = lives - 1; //4

        //Posfija
        lives --; //Decremento
        System.out.println(lives); //3

        lives++; //Incremento
        System.out.println(lives); //4

        //Prefija
        //Gana un regalo por ganar una vida
        int gift = 100 + ++lives; //prefijo
        System.out.println(gift);
        System.out.println(lives); //5

        int money = 400;
        money = money - 1; //399

        money--;
        System.out.println(money); //398

        money++;
        System.out.println(money); //399

        int bonus = 100 + ++money;
        System.out.println(bonus);

        int bonus2 = 100 + money++;
        System.out.println(bonus2);

    }
}
