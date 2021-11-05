import java.util.Random;

public class Dice
{
    public void roll(int roll)
    {
        Random random = new Random();
        int x = random.nextInt(roll);
        System.out.println("Dice rolled a " + x);
    }
}
