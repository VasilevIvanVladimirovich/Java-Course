package pac;
import ru.novsu.povt.viv.graphics.*;
public class Main {
    public static void main(String[] args) {
       Rectangle rectangle1 = new Rectangle(1,1,5,6,"Красный");
        System.out.println(rectangle1.Graph());
        Circle circle1 = new Circle(2,3,10,"Розовый");
        System.out.println(circle1.Graph());
        Ellipse ellipse1 = new Ellipse(4,5,5,7,"Зелёный");
        System.out.println(ellipse1.Graph());
        Background background1 = new Background("Серый","Сетка");
        System.out.println(background1.Graph());
        Point point1 = new Point(6,7,"Чёрный");
        System.out.println(point1.Graph());
    }
}
//java -classpath B:\PRoG\Git-repos\Java-Course\Lab3.2\out\production\Lab3.2;B:\PRoG\Git-repos\Java-Course\Lab3.1\out\artifacts\Lab3_jar\Lab3.jar pac.Main