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
        LazyRegistryWithDCL lazySingleton = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL lazySingleton1 = LazyRegistryWithDCL.getInstance();

        System.out.println(lazySingleton == lazySingleton1);

        // Lazy Singleton with Holder Class
        LazyRegistryIODH singleton;
        LazyRegistryIODH.getInstance();
        LazyRegistryIODH.getInstance();
        LazyRegistryIODH.getInstance();
        LazyRegistryIODH.getInstance();
    }

}
