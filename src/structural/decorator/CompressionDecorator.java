package structural.decorator;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource wrapper) {
        super(wrapper);
    }

    @Override
    public void writeData(String data) {
        System.out.println("Write data in CompressionDecorator class");
        super.writeData(data);
    }

    @Override
    public String readData() {
        System.out.println("Read data in CompressionDecorator class");
        return super.readData();
    }
}
