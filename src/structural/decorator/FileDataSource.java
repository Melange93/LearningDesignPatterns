package structural.decorator;

public class FileDataSource implements DataSource {

    private String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(String data) {
        System.out.printf("Write data in FileDataSource class: %s%n", data);
    }

    @Override
    public String readData() {
        return "Read data in FileDataSource class";
    }
}
