package structure.decroator;

import structure.decroator.decorators.*;

public class Demo {

    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith, 10000\nSteven Jobs, 912000";
        DataSourceDecorator encoded = new CompressionDecorator(new EncryptionDecorator(new FileDataSource("out/Output.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/Output.txt");
        System.out.println("- Input -------------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded -----------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded -----------------");
        System.out.println(encoded.readData());
    }
}
