class Parameterizedconstructor {

    int marks;
    private Parameterizedconstructor(int marks){
        this.marks = marks;
        System.out.println("Marks scored :"+marks);
    }

    public static void main(String[] args) {

        Parameterizedconstructor m1 = new Parameterizedconstructor(78);
        Parameterizedconstructor m2 = new Parameterizedconstructor(98);
        Parameterizedconstructor m3 = new Parameterizedconstructor(64);
        Parameterizedconstructor m4 = new Parameterizedconstructor(83);
    }
}