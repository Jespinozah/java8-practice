public class Chick {
  private String name = "Flappy";
  { System.out.println("Settings field"); }
  public Chick() {
    name = "Thiny";
    System.out.println("Setting constructor");
  }
  public static void main(String[] args) {
    Chick chick = new Chick();
    System.out.println(chick.name);

  }
}
