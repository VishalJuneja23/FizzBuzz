/**
 * Created by jvishal on 12/25/16.
 */
public class FizzBuzzGame {

    public void FizzBuzz()
    {
        for(int i=1; i<=100; i++)
        {
            if(i%3 == 0)
            {
                if(i%5 == 0)
                    System.out.println("FizzBuzz\n");

                else
                    System.out.println("Fizz\n");
            }

            else if(i%5 == 0 )
            {
                System.out.println("Buzz\n");
            }

            else
            {
                System.out.println(i+"\n");
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzzGame obj = new FizzBuzzGame();
        obj.FizzBuzz();
    }
}
