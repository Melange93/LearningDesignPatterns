package structural.decorator;

public class DataSourceDecorator implements DataSource {

    private DataSource wrapper;

    public DataSourceDecorator(DataSource wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void writeData(String data) {
        System.out.println("Write data in DataSourceDecorator class. Class, what this class wrapper: " + wrapper.getClass().getSimpleName());
        wrapper.writeData(data);
    }

    @Override
    public String readData() {
        System.out.println("Read data in DataSourceDecorator class. Class, what this class wrapper: " + wrapper.getClass().getSimpleName());
        return wrapper.readData();
    }
}
