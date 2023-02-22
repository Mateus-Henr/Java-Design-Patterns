package gcp;

import factory.Storage;

// Represents a concrete product in a family "Google Cloud Platform".
public class GoogleCloudStorage implements Storage
{
    public GoogleCloudStorage(int capacityInMib)
    {
        //Use java.main.java.gcp api
        System.out.println("Allocated " + capacityInMib + " on Google Cloud java.main.java.factory.Storage");
    }

    @Override
    public String getId()
    {
        return "gcpcs1";
    }

    @Override
    public String toString()
    {
        return "Google cloud storage";
    }

}
