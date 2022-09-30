package Models;

public class Dog extends Animal{
    //overriding
    @Override
    public char AnimalSound()
    {
        System.out.println("Hav hav");
        return 0;
    }

    @Override
    public  void  AnimalSound(int Command)
    {
        if(Command==1)
        {
            System.out.println("little dog'sound :");

        }
        System.out.println("Hav hav");

    }
}
