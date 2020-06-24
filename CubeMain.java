class CubeMain {
    public static void main(String[] args) {
        int result;

        // calling method nd storing from return
        result = cube(); 
        System.out.println("cube value of 5 : " + result);
    }

    public static int cube() {
        return 5 * 5 * 5;
    }
}
