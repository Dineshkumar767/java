public class sample {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2, int n3, int n4) {
        return n1 + n2 + n3 + n4;

    }

    public static void main(String[] args) {
        int a;
        a = 10;
        System.out.println(a);

        // int num1 = 5;
        // int num2 = 10;

        sample obj = new sample();
        int result = (int) obj.add(2, 3, 5, 6);
        System.out.println(result);
    }

}
