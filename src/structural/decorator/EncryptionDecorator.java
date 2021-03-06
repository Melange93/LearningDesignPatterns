package structural.decorator;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource wrapper) {
        super(wrapper);
    }

    @Override
    public void writeData(String data) {
        System.out.println("Write data in EncryptionDecorator class");
        super.writeData(data);
    }

    @Override
    public String readData() {
        System.out.println("Read data in EncryptionDecorator class");
        return super.readData();
    }
}
