package implementation;

public class Client
{
    public static void main(String[] args)
    {
        // Eager Singleton
        EagerRegistry registry = EagerRegistry.getInstance();
        EagerRegistry registry1 = EagerRegistry.getInstance();

        System.out.println(registry == registry1);

        // Lazy Singleton
    }

}
