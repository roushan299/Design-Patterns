package structure.decroator.decorators;

public interface DataSource {
    void writeData(String data);
    String readData();
}
