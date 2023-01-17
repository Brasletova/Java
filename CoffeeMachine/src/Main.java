public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;

        boolean isBlocked = false;

        int capucinoMilkRequired = 60;
        int capucinoCoffeeRequired = 15;

        boolean milkIsEnough =  skimmedMilkAmount >= capucinoMilkRequired ||
                milkAmount >= capucinoMilkRequired;
        boolean coffeeIsEnough = coffeeAmount >= capucinoCoffeeRequired;

        if ( !isBlocked && coffeeIsEnough &&
             milkIsEnough) {
            System.out.println("Готовим кофе!");
        } else {
            System.out.println("Что-то пошло не так!");
        }
    }
}