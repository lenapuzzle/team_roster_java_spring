public class Player {
  private String name;
  private String position;

  public Player(String position, String name) {
    this.name = name;
    this.position = position;
  }

//  public Player() {
//
//  }
    public String getName() {
    return name;
  }

  private void setName(String name) {
    this.name = name;
  }

  public String getPosition() {
    return position;
  }

  private void setPosition(String position) {
    this.position = position;
  }
}
