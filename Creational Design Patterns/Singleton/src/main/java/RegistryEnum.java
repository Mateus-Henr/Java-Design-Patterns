/**
 * (Ref. Google I/O 2k8 Joshua Bloch)
 * Since Java 1.5 using enum we can create a singleton. It handles serialization using java's in-built
 * mechanism and still ensure single instance
 */
public enum RegistryEnum
{
    INSTANCE;

    public void getConfiguration()
    {

    }
}
// Some problems that come up when using an enum as a Singleton is that you cannot extend an enum and
// you cannot create any objects using the enum.