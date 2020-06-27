public class Constructor1 {
    
    public static void main(String[] args) {

    // object is created in another class
        Info infoObj = new Info();
        System.out.println("MY NAME= "+ infoObj.Name);
    }
}
class Info {
    String Name;
    public Info(){
        Name = "NAVNEET SAHAY";
    }
}