class Stringop{
  public static void main(String[] args) {
    String Fname = "NAVNEET";
    System.out.println("FIRST NAME :"+Fname);
    String Lname = "SAHAY";
    System.out.println("LAST NAME :"+Lname);
    //Joining string
    String finalname = Fname.concat(Lname);
    System.out.println("FINAL NAME :"+finalname);
    System.out.println("FINAL NAME LENGTH :"+finalname.length());
  }
}