public class Cube {
    public static void main(String[] args) {
        int result,n,i;
        n=3;
        result=cube(n);
        System.out.print("CUBE OF 3 :"+result);
        n=4;
        result=cube(n);
        System.out.println("\nCUBE OF 4 :"+ result);
    }

    public static int cube(int i) {
        return i * i * i;
    }
}
