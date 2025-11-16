import java.util.ArrayList;

public class ObjectAnalyzerTest
{
    private int a;
    public int b;

    public void setA(int a) { this.a = a; }

    public static void main(String[] args) throws ReflectiveOperationException
    {
        int[] iarr = {1, 2, 3, 4, 5};

        System.out.println(new ObjectAnalyzer().toString(iarr));
        new ObjectAnalyzer().setNum(iarr);
        System.out.println(new ObjectAnalyzer().toString(iarr));

        String str = "hello world";

        System.out.println(new ObjectAnalyzer().toString(str));

        ObjectAnalyzerTest[] oa = new ObjectAnalyzerTest[2];
        oa[0] = new ObjectAnalyzerTest();
        oa[1] = new ObjectAnalyzerTest();
        oa[0].setA(1);
        oa[0].b = 2;
        oa[1].setA(3);
        oa[1].b = 4;
        System.out.println(new ObjectAnalyzer().toString(oa));

        ArrayList<Integer> squares = new ArrayList<>();

        for (int i = 1; i <= 5; i ++) {
            squares.add(i * i);
        }

        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
