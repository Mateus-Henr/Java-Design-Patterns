package implementation;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable>
{
    private final BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> creator, int count)
    {
        availablePool = new LinkedBlockingQueue<>();

        for (int i = 0; i < count; i++)
        {
            availablePool.offer(creator.get());
        }
    }

    public T get()
    {
        try
        {
            return availablePool.take();
        }
        catch (InterruptedException e) // If the pool is empty. Waiting until an object gets available.
        {
            System.err.println("take() was interrupted.");
        }

        return null;
    }


    public void release(T obj)
    {
        obj.reset();

        try
        {
            availablePool.put(obj);
        }
        catch (InterruptedException e) // If the pool is empty. Waiting until an object gets available.
        {
            System.err.println("put() was interrupted.");
        }
    }

}
