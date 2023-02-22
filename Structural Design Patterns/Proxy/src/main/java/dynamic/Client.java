package dynamic;

import image.Image;
import image.Point2D;


public class Client
{
    public static void main(String[] args)
    {
        //Get image.Image from factory.
        Image img = ImageFactory.getImage("MyPic.bmp");
        //image.Client is again unaware of existence of proxy
        img.setLocation(new Point2D(10, 10));
        System.out.println("image.Image Location: " + img.getLocation());
        System.out.println("Starting render...");
        //Actual object should be created at this time
        img.render();
    }
}
