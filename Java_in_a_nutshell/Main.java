package Java_in_a_nutshell;

public class Main {
    public static void main(String[] args) {
        Espresso myOrder = new MyEspresso();

        System.out.println("Drink: " + myOrder.getDrink());
        System.out.println("Size: " + myOrder.getSize());
        System.out.println("Strength: " + myOrder.getStrength());
        System.out.println("Milk: " + myOrder.getMilk());
        System.out.println("Caffeine: " + myOrder.getCaffeine());
        System.out.println("Flags: " + myOrder.getFlags());
    }
}
