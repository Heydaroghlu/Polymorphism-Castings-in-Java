package Models;

public class Animal {
    public char AnimalSound()
    {
        System.out.println("Animal's sound");
        return 0;
    }
    //Overloading >>
    public  void  AnimalSound(int Command)
    {
        System.out.println("to do:"+Command);
    }


}
