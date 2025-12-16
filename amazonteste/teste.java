package amazonteste;


public class teste {
    public static int minStartingHealth(int[] power, int armor) {
        int totalDamage = 0;
        int maxDamage = 0;

        for (int p : power) {
            totalDamage += p;
            maxDamage = Math.max(maxDamage, p);
        }

        int effectiveReduction = Math.min(armor, maxDamage);
        return totalDamage - effectiveReduction + 1; // +1 to keep health > 0
    }

    public static void main(String[] args) {
        int[] power = {1, 2, 6, 7};
        int armor = 5;
        System.out.println(minStartingHealth(power, armor)); // Output: 12
    }
}
