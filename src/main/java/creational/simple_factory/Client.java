package creational.simple_factory;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Simple factory can be just a method in an existing class.
 * <p>
 * Simply move the instantiation logic away from client code, typically a static method.
 * <p>
 * With a separated class we are able to allow other parts of the code to use simple factory easily.
 * <p>
 * Simple factory is usually a static method because it is not concerned about the state of the object.
 * <p>
 * The java.text.NumberFormat class has a getInstance method, that is an example of simple factory.
 */
public class Client {

    public static void main(String[] args) {

        Post blog = PostFactory.createPost("blog");
        System.out.println(blog.getClass());

        Post news = PostFactory.createPost("news");
        System.out.println(news.getClass());

        NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());
        System.out.println(numberFormat);
    }
}
