package promocoes;

public class Promocoes {
    public static void main(String[] args) {
        byte a = 10;
        // a vai ser promovido para int
        int b = a + 2;

        // c vai ser promovido para long
        int c = 10;
        long d = 15L;
        long e = c + d;

        // e vai ser promovido para float
        int f = 10;
        float g = 1.5f;
        float h = f + g;
    }
}
