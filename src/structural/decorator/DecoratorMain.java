package structural.decorator;

/**
 * Description: https://refactoring.guru/design-patterns/decorator
 *
 * Decorator is a structural design pattern that lets you attach new behaviors to objects
 * by placing these objects inside special wrapper objects that contain the behaviors.
 */

public class DecoratorMain {

    public static void main(String[] args) {
        String data = "IMPORTANT DATA";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("alma")));
        encoded.writeData(data);
        DataSource plain = new FileDataSource("alma");

        System.out.println("- Input ----------------");
        System.out.println(data);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());

    }
}
