class Stringop2 {
  public static void main(String[] args) {
    String Example = "Navneet! Sahay";
    System.out.println("USING THE SUBSTRING :"+Example.substring(8));
    System.out.println("STRING IN LOWER CASE :"+Example.toLowerCase());
    System.out.println("STRING IN UPPER CASE :"+Example.toUpperCase());
    //REPLACING ! to _
    System.out.println("RENAMED NAME :"+Example.replace('!','_'));
    System.out.println("Character at 5:"+Example.charAt(5));
  }
}