import ru.netology.sqr.SqrtService;

public class Main {

    public static void main(String[] args) {
        SqrtService service = new SqrtService();
        int q = service.calcSqrt(200, 300);
        System.out.println(q + " квадратных корня");
    }
}

