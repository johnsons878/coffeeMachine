//package machine;
//
//import java.util.Locale;
//import java.util.Scanner;
//
//public class CoffeeMachine {
//
//    public static final String
//            CHOICE_ACTION = "What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:",
//            MAIN_MENU = "Write action (buy, fill, take, remaining, exit):",
//            YES = "I have enough resources, making you a coffee!",
//            WATER = "water", //переделать
//            MILK = "milk",//переделать
//            COFFEE_BEANS = "coffee beans",//переделать
//            DISPOSABLE_CUPS = "disposable cups";//переделать
//
//    public static final int
//            ESPRESSO_WATER = 250,
//            ESPRESSO_BEANS = 16,
//            ESPRESSO_COST = 4,
//            LATTE_WATER = 350,
//            LATTE_MILK = 75,
//            LATTE_BEANS = 20,
//            LATTE_COST = 7,
//            CAPPUCCINO_WATER = 200,
//            CAPPUCCINO_MILK = 100,
//            CAPPUCCINO_BEANS = 12,
//            CAPPUCCINO_COST = 6;
//
//    public static String inputUser;
//
//    public static void main(String[] args) {
//        int waterSupply = 400, milkSupply = 540, coffeeBeansSupply = 120, cupsSupply = 9, money = 550;
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println(MAIN_MENU);
//            inputUser = sc.next();
//            switch (inputUser) {
//                case "buy": {
//                    System.out.println();
//                    System.out.println(CHOICE_ACTION);
//                    inputUser = sc.next();
//                    switch (inputUser) {
//                        case "1": {
//                            if(waterSupply - ESPRESSO_WATER < 0 ) {
//                                System.out.println("Sorry, not enough " + WATER + "!");
//                                System.out.println();
//                            } else if (coffeeBeansSupply - ESPRESSO_BEANS < 0){
//                                System.out.println("Sorry, not enough " + COFFEE_BEANS + "!");
//                                System.out.println();
//                            } else if (cupsSupply == 0) {
//                                System.out.println("Sorry, not enough " + COFFEE_BEANS + "!");
//                                System.out.println();
//                            } else {
//                                System.out.println(YES);
//                                System.out.println();
//                                waterSupply -= ESPRESSO_WATER;
//                                coffeeBeansSupply -= ESPRESSO_BEANS;
//                                money += ESPRESSO_COST;
//                                cupsSupply--;
//                            }
//                            break;
//                        }
//                        case "2": {
//                            if(waterSupply - LATTE_WATER < 0 ) {
//                                System.out.println("Sorry, not enough " + WATER + "!");
//                                System.out.println();
//                            } else if (coffeeBeansSupply - LATTE_BEANS < 0){
//                                System.out.println("Sorry, not enough " + COFFEE_BEANS + "!");
//                                System.out.println();
//                            } else if (cupsSupply == 0) {
//                                System.out.println("Sorry, not enough " + DISPOSABLE_CUPS + "!");
//                                System.out.println();
//                            } else if (milkSupply - LATTE_MILK < 0) {
//                                System.out.println("Sorry, not enough " + MILK + "!");
//                                System.out.println();
//                            } else {
//                                System.out.println(YES);
//                                System.out.println();
//                                waterSupply -= LATTE_WATER;
//                                coffeeBeansSupply -= LATTE_BEANS;
//                                milkSupply -= LATTE_MILK;
//                                money += LATTE_COST;
//                                cupsSupply--;
//                            }
//                            break;
//                        }
//                        case "3": {
//                            if(waterSupply - CAPPUCCINO_WATER < 0 ) {
//                                System.out.println("Sorry, not enough " + WATER + "!");
//                                System.out.println();
//                            } else if (coffeeBeansSupply - CAPPUCCINO_BEANS < 0){
//                                System.out.println("Sorry, not enough " + COFFEE_BEANS + "!");
//                                System.out.println();
//                            } else if (cupsSupply == 0) {
//                                System.out.println("Sorry, not enough " + DISPOSABLE_CUPS + "!");
//                                System.out.println();
//                            } else if (milkSupply - CAPPUCCINO_MILK < 0) {
//                                System.out.println("Sorry, not enough " + MILK + "!");
//                                System.out.println();
//                            } else {
//                                System.out.println();
//                                System.out.println(YES);
//                                waterSupply -= CAPPUCCINO_WATER;
//                                coffeeBeansSupply -= CAPPUCCINO_BEANS;
//                                milkSupply -= CAPPUCCINO_MILK;
//                                money += CAPPUCCINO_COST;
//                                cupsSupply--;
//                            }
//                            break;
//                        }
//                        case "back": {
//                            break;
//                        }
//                        default: {
//                            System.out.println("\nError input!");
//                            break;
//                        }
//                    }
//                    break;
//                }
//                case "fill": {
//                    System.out.println();
//                    System.out.println("Write how many ml of water you want to add:");
//                    int w = sc.nextInt();
//                    waterSupply += w;
//                    System.out.println("Write how many ml of milk you want to add:");
//                    w = sc.nextInt();
//                    milkSupply += w;
//                    System.out.println("Write how many grams of coffee beans you want to add");
//                    w = sc.nextInt();
//                    coffeeBeansSupply += w;
//                    System.out.println("Write how many disposable cups of coffee you want to add:");
//                    w = sc.nextInt();
//                    cupsSupply += w;
//                    break;
//                }
//                case "remaining": {
//                    System.out.println();
//                    System.out.println("The coffee machine has:");
//                    System.out.println(waterSupply + " ml of water");
//                    System.out.println(milkSupply + " ml of milk");
//                    System.out.println(coffeeBeansSupply + " g of coffee beans");
//                    System.out.println(cupsSupply + " disposable cups");
//                    System.out.println("$" + money + " of money");
//                    System.out.println();
//                    break;
//                }
//                case "take": {
//                    System.out.println();
//                    System.out.println("I gave you $" + money);
//                    money -= money;
//                    break;
//                }
//            }
//        } while (!inputUser.equals("exit"));
//    }
//}


package machine;

        import java.util.Locale;
        import java.util.Scanner;

enum StatusCoffeeMachine{
    BUY, FILL, TAKE, REMAINING, EXIT
}

public class CoffeeMachine {

    public static Scanner scanner = new Scanner(System.in);

    public int water, milk, coffeeBeans, cups, money;

    public static String inputUser;

    public static CoffeeMachine selectedTypeCoffee = new CoffeeMachine();
    public static CoffeeMachine machine = new CoffeeMachine(400, 540, 120, 9, 550);
    public static CoffeeMachine espressoRequired = new CoffeeMachine(250, 0, 16, 1, 4);
    public static CoffeeMachine latteRequired = new CoffeeMachine(350, 75, 20, 1, 7);
    public static CoffeeMachine cappuccinoRequired = new CoffeeMachine(200, 100, 12, 1, 6);

    CoffeeMachine(int water, int milk, int coffeeBeans, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.cups = cups;
        this.money = money;
    }//constructor of class
    CoffeeMachine() {

    }

    public static CoffeeMachine handledChoiceCoffee() {
        String inputUser = scanner.next();
            switch (inputUser) {
                case "1": {
                    selectedTypeCoffee = espressoRequired;
                    break;
                }
                case "2": {
                    selectedTypeCoffee = latteRequired;
                    break;
                }
                case "3": {
                    selectedTypeCoffee = cappuccinoRequired;
                    break;
                }
                case "back": {
                    break;
                }
            }
        return selectedTypeCoffee;
    }

    public static void makeCoffee(CoffeeMachine selectedTypeCoffee) {
        if(CoffeeMachine.machine.water < selectedTypeCoffee.water ) {
            System.out.println("Sorry, not enough water!\n");
        } else if (CoffeeMachine.machine.coffeeBeans < selectedTypeCoffee.coffeeBeans) {
            System.out.println("Sorry, not enough coffee beans!\n");
        } else if (CoffeeMachine.machine.milk < selectedTypeCoffee.milk) {
            System.out.println("Sorry, not enough milk!\n");
        } else if (CoffeeMachine.machine.cups == 0) {
            System.out.println("Sorry, not enough cups!\n");
        } else {
            System.out.println("I have enough resources, making you a coffee!\n");
            CoffeeMachine.machine.water -= selectedTypeCoffee.water;
            CoffeeMachine.machine.milk -= selectedTypeCoffee.milk;
            CoffeeMachine.machine.coffeeBeans -= selectedTypeCoffee.coffeeBeans;
            CoffeeMachine.machine.money += selectedTypeCoffee.money;
            CoffeeMachine.machine.cups -= selectedTypeCoffee.cups;
        }
    }

    public static void fillCoffeeMachineSupplies() {
        System.out.println("\nWrite how many ml of water you want to add:");
        int inputUser = scanner.nextInt();
        machine.water += inputUser;
        System.out.println("\nWrite how many ml of milk you want to add:");
        inputUser = scanner.nextInt();
        machine.milk += inputUser;
        System.out.println("\nWrite how many grams of coffee beans you want to add");
        inputUser = scanner.nextInt();
        machine.coffeeBeans += inputUser;
        System.out.println("\nWrite how many disposable cups of coffee you want to add:");
        inputUser = scanner.nextInt();
        machine.cups += inputUser;
    }

    public static void takeOfMoney() {
        System.out.println("\nI gave you $" + machine.money + "\n");
        machine.money -= machine.money;
    }

    public static void getRemainingIngredients() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(machine.water + " ml of water");
        System.out.println(machine.milk + " ml of milk");
        System.out.println(machine.coffeeBeans + " g of coffee beans");
        System.out.println(machine.cups + " disposable cups");
        System.out.println("$" + machine.money + " of money\n");
    }

    public static String displayMainMenu() {
        return "Write action (buy, fill, take, remaining, exit):";
    }

    public static String displayChoiceCoffeeMenu() {
        return "\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:";
    }

    public static void statusCoffeeMachine() {
        System.out.println(displayMainMenu());
        inputUser = scanner.next().toUpperCase(Locale.ROOT);
        switch (inputUser) {
            case "BUY" : {
                System.out.println(displayChoiceCoffeeMenu());
                if (inputUser.equals("BACK")) {
                    statusCoffeeMachine();
                } else {
                    makeCoffee(handledChoiceCoffee());
                }
                break;
            }
            case "FILL" : {
                fillCoffeeMachineSupplies();
                break;
            }
            case "TAKE" : {
                takeOfMoney();
                break;
            }
            case "REMAINING" : {
                getRemainingIngredients();
                break;
            }
        }
    }

    public static void main(String[] args) {
        do {
            statusCoffeeMachine();
        } while (!inputUser.equals("EXIT"));
    }

}
