import aws.AwsResourceFactory;
import factory.Instance;
import factory.ResourceFactory;
import factory.Storage;
import gcp.GoogleResourceFactory;

public class Client
{
    private ResourceFactory factory;

    public Client(ResourceFactory factory)
    {
        this.factory = factory;
    }

    // This will decide which cloud provider to use.
    public Instance createServer(Instance.Capacity cap, int storageMib)
    {
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);

        instance.attachStorage(storage);

        return instance;
    }

    public static void main(String[] args)
    {
        Client aws = new Client(new AwsResourceFactory());
        Instance instance = aws.createServer(Instance.Capacity.micro, 20480);

        instance.start();
        instance.stop();

        System.out.println("-------------------------------------");

        Client gcp = new Client(new GoogleResourceFactory());
        instance = gcp.createServer(Instance.Capacity.micro, 20480);

        instance.start();
        instance.stop();
    }

}
