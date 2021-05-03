import java.io.*;

public class Main {
    public static void main(String[] args) {
        double[] doubleValue = new double[361];
        double[] doubleValue_read = new double[361];
        double[] doubleValue_read_2 = new double[361];
        String out;
        try {
            PrintWriter writer_sin = new PrintWriter("date/sin.txt");
            for (int i = 0; i <= 360; i++) {
                out = "";
                out += Math.sin(i) + "\n";
                writer_sin.write(out);
            }
            writer_sin.flush(); //сбрасывает буфер
            writer_sin.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.print("Ошибка файла");
        }

        try {
            BufferedReader buff_reader_sin = new BufferedReader(new FileReader("date/sin.txt"));
            String line;
            for (int i = 0; i <= 360; i++) {
                line = buff_reader_sin.readLine();
                doubleValue[i] = Double.parseDouble(line);
            }
            buff_reader_sin.close();
            BufferedReader buff_reader_input = new BufferedReader(new FileReader("date/input.txt"));
            line = buff_reader_input.readLine();
            System.out.print("Sin " + line + " = " + doubleValue[Integer.parseInt(line)]);
            buff_reader_input.close();


            File file_sin2 = new File("date/sin2.dat");//сериализация для всего массива целиком
            FileOutputStream file = new FileOutputStream(file_sin2);
            ObjectOutputStream outt = new ObjectOutputStream(file);
            outt.writeObject(doubleValue);
            outt.close();
            file.close();

            FileInputStream filee = new FileInputStream(file_sin2);//десериализация для всего массива целиком
            ObjectInputStream in = new ObjectInputStream(filee);

            try {
                doubleValue_read = (double[]) in.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            File file_sin2_2 = new File("date/sin2.dat");           //серриализация поотдельности
            FileOutputStream file_2 = new FileOutputStream(file_sin2_2);
            ObjectOutputStream outt_2 = new ObjectOutputStream(file_2);

            for (int i = 0; i <= 360; i++) {
                outt_2.writeDouble(doubleValue[i]);
            }
            outt_2.close();
            file_2.close();

            FileInputStream filee_2 = new FileInputStream(file_sin2_2);     //десериализация Для массива по отдельности
            ObjectInputStream in_2 = new ObjectInputStream(filee_2);

            /*for (int i = 0; i <= 360; i++) doubleValue_read_2[i] = Double.parseDouble(String.valueOf(in_2.read()));*/
            for (int i = 0; i <= 360; i++) doubleValue_read_2[i] = Double.parseDouble(String.valueOf(in_2.read()));
            System.out.println("\n" + "Целиком:" + "\t\t\t\t" + "По отдельности");
            for (int i = 0; i < 100; i++) {
                System.out.println(doubleValue_read[i] + "\t\t\t\t" + doubleValue_read_2[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
