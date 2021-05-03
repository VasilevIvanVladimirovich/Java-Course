public class MyWindow implements Movable {

    private Point window;

    public MyWindow(Point obj) {
        this.window = obj;
    }

    public int getX() {
        return window.getX();
    }

    public int getY() {
        return window.getY();
    }

    public void moveTo(int x, int y) {
        window.moveTo(x, y);
        System.out.println("Координаты изменены на (" + x + ", " + y + ")");
    }

}
