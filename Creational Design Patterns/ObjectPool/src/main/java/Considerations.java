/*
    Implementation Considerations

    • The reset should not be a costly operation.
    • Pre-caching objects: Creating objects in advance in order for not slow down the code. But on the other
      side this approach increases memory consumption and start-up time.
    • Depending on the amount of time that the reset operation takes it might be a good ideia to take the
      reset code out of the synchronized block.


    Design Considerations
    • The get method can be parameterized to work similarly to a Factory Method.
    • Pooling objects is only beneficial if it involves a costly initialization because of external
      resources like connection or a thread. Don't pool objects to save memory.
    • Don't pool long-lived objects or only to save frequent call to new. This mat negatively impact
      performance.
 */

public class Considerations
{
}
