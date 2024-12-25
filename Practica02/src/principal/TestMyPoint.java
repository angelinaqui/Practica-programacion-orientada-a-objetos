package principal;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint start;
        MyPoint end;
        MyPoint stray;
        start = new MyPoint();
        end = new MyPoint();
        start.x = 10;
        start.y = 10;
        end.x = 20;
        end.y = 30;
        stray = end;
        System.out.println("El valor de start es " + start.x+ "," +start.y);
        System.out.println("El valor de end es " + end.x+ "," +end.y);
        System.out.println("El valor de stray es " + stray.x+ "," +stray.y);
    }
}

