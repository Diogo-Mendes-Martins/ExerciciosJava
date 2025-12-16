package Java_in_a_nutshell;

import java.util.EnumSet;
import java.util.Set;
/*
import Java_in_a_nutshell.Espresso.Caffeine;
import Java_in_a_nutshell.Espresso.Drink;
import Java_in_a_nutshell.Espresso.Flags;
import Java_in_a_nutshell.Espresso.Milk;
import Java_in_a_nutshell.Espresso.Size;
import Java_in_a_nutshell.Espresso.Strength;
*/

public class MyEspresso implements Espresso{
	 @Override
	    public Drink getDrink() {
	        return Drink.MOCHA;
	    }

	    @Override
	    public Size getSize() {
	        return Size.GRANDE;
	    }

	    @Override
	    public Strength getStrength() {
	        return Strength.DOUBLE;
	    }

	    @Override
	    public Milk getMilk() {
	        return Milk.WHOLE;
	    }

	    @Override
	    public Caffeine getCaffeine() {
	        return Caffeine.REGULAR;
	    }

	    @Override
	    public Set<Flags> getFlags() {
	        return EnumSet.of(Flags.EXTRA_HOT, Flags.WITH_ROOM);
	    }
	}