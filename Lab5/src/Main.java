import java.io.*;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        String out;

        Vector<Double> doubleValue = new Vector<Double>();

        PrintWriter writer_sin = new PrintWriter("date/sin.txt");
        for (int i = 0; i <= 360; i++) {
            out = "";
            out += Math.sin(i) + "\n";
            writer_sin.write(out);
        }
        writer_sin.flush(); //сбрасывает буфер
        writer_sin.close();


        BufferedReader buff_reader_sin = new BufferedReader(new FileReader("date/sin.txt"));
        String line;
        for (int i = 0; i <= 360; i++) {
            line = buff_reader_sin.readLine();
            doubleValue.add(Double.parseDouble(line));
        }
        buff_reader_sin.close();
        BufferedReader buff_reader_input = new BufferedReader(new FileReader("date/input.txt"));
        line = buff_reader_input.readLine();
        System.out.print("Sin " + line + " = " + doubleValue.elementAt(Integer.parseInt(line)) + "\n");
        buff_reader_input.close();

//Процесс сериализации
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("date/sin2.dat"));
        objectOutputStream.writeObject(doubleValue);
        objectOutputStream.close();

//процесс десириализации
        Vector<Double> vector = new Vector<Double>();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("date/sin2.dat"));
        Object readedValue = objectInputStream.readObject();
        vector = (Vector<Double>) readedValue;
        System.out.println(vector);
    }

}


//PrintWriter - печатает отформатированные представления объектов в поток вывода текста.
// Этот класс реализует все методы печати, которые находятся в printstream.

//BufferedReader оборачивает внутри него объект Reader,
// который автоматически считывает данные из источника (например, файла)
// и сохраняет их в buffer (буфер) BufferedReader.

// Для сериализации объектов в поток используется класс ObjectOutputStream.

// Класс ObjectInputStream отвечает за обратный процесс - чтение ранее сериализованных данных из потока
