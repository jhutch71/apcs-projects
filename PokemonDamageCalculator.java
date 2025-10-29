/*
 * Project: Pokémon Battle Damage Calculator
 * Description: Read Attack and Defense as doubles, compute a simplified damage
 * value using a fixed formula, and print the final damage as an integer.
 * Formula: damage = round((Attack / (Defense + 50.0)) * 100.0); minimum = 1.
 */

import java.util.Scanner;

public class PokemonDamageCalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // TODO: Prompt and read Attack and Defense (as doubles).
        // Example:
        System.out.print("Enter Attack and Defense: ");
        double attack = input.nextDouble();
        double defense = input.nextDouble();

        // TODO: Compute raw damage as a double using the provided formula.
        double damage = Math.round(((attack / (defense + 50.0)) * 100.0));
        // TODO: Round to nearest whole number and clamp to a minimum of 1.
        
        /* **hint** If you create a damage variable by rounding the raw damage 
           you can make sure it doesn't go below 1 with the code below */
        if (damage < 1)
        {
            damage = 1;
        }

        // TODO: Print ONLY the final damage integer on its own line.
        System.out.println((int)damage);
    }
}