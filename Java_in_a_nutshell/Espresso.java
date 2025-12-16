package Java_in_a_nutshell;


public interface Espresso {
    enum Drink { LATTE, MOCHA, AMERICANO, CAPPUCCINO, ESPRESSO }
    enum Size { SHORT, TALL, GRANDE }
    enum Strength { SINGLE, DOUBLE, TRIPLE, QUAD }
    enum Milk { SKINNY, ONE_PERCENT, TWO_PERCENT, WHOLE, SOY }
    enum Caffeine { REGULAR, SPLIT_SHOT, DECAF }
    enum Flags { WITH_ROOM, EXTRA_HOT, DRY }

    Drink getDrink();
    Size getSize();
    Strength getStrength();
    Milk getMilk();
    Caffeine getCaffeine();
    java.util.Set<Flags> getFlags();
}


