import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	/*Rectangle rectangle1 = new Rectangle(1,1,5,6,"Красный");
	System.out.println(rectangle1.Graph());
    Circle cirlce1 = new Circle(2,3,10,"Розовый");
    System.out.println(cirlce1.Graph());
    Ellipse ellipse1 = new Ellipse(4,5,5,7,"Зелёный");
    System.out.println(ellipse1.Graph());
    Background background1 = new Background("Серый","Сетка");
    System.out.println(background1.Graph());
    Point point1 = new Point(6,7,"Чёрный");
    System.out.println(point1.Graph());*/

//////////////////////////////////////////////////////////////////////////// №1
        MyWindow window = new MyWindow(new Point(1, 2, "КРасный"));
        System.out.println("x = " + window.getX() + "\n" + "y = " + window.getY());
        window.moveTo(4, 2);
//////////////////////////////////////////////////////////////////////////// №2-3
        ArrayList<Movable> movables = new ArrayList<Movable>(4);
        movables.add(new Rectangle(11, 11, 1, 1, "Чёрный"));
        movables.add(new Circle(10, 11, 11, "Красный"));
        movables.add(new Point(1, 3, "Жёлтый"));
        movables.add(new MyWindow(new Point(1, 2, "Красный")));

        try {
            swapXY(null);
        } catch (NullPointerException ex) {
            System.out.println("Error while swapping coordinates.");
            ex.printStackTrace();
        }

        for (Movable i : movables) {
            try {
                swapXY(movables.get(movables.indexOf(i)));
            } catch (NullPointerException ex) {
                System.out.println("Ошибка функции swapXY");
                ex.printStackTrace();
            }
        }
    }

    public static void swapXY(Movable object) throws NullPointerException {
        if (object == null) throw new NullPointerException("Объект не был создан");
        System.out.println("Старые координаты: (" + object.getX() + ", " + object.getY() + ")");
        object.moveTo(object.getY(), object.getX());
        System.out.println("Новые координаты: (" + object.getX() + ", " + object.getY() + ")");
    }
}
