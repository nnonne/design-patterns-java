/**
 * Літак
 */
public class Plane {

  /**
   * Чи злетів літак
   */
  private boolean isInTheAir;

  /**
   * Ідентифікатор літака
   */
  private int id;

  /**
   * Злітно-посадкова смуга
   */
  private Runway runway;

  /**
   * Список літаків у польоті
   */
  private PlanesInFlight planesInFlight;

  /**
   * Список літаків, що приземлилися
   */
  private PlanesOnGround planesOnGround;

  private Mediator mediator;


  public Plane(int id) {
    this.id = id;
    isInTheAir = false;
    runway = new Runway();
    planesInFlight = new PlanesInFlight();
    planesOnGround = new PlanesOnGround();
    planesOnGround.addPlane(this);
  }

  /**
   * Зліт літака
   */
  public void takeOff() {
    if(!isInTheAir && runway.getIsAvailable()) {
      System.out.println("Plane " + id + " is taking off...");
      planesOnGround.removePlane(this);
      planesInFlight.addPlane(this);
      setIsInTheAir(true);
      runway.setIsAvailable(false);
    }
  }

  /**
   * Повертає ознаку чи літак в повітрі
   * @return стан літака - чи в повітрі
   */
  public boolean getIsInTheAir() {
    return isInTheAir;
  }

  /**
   * Встановити ознаку чи злетів літак
   * @param isInTheAir чи злетів літак
   */
  public void setIsInTheAir(boolean isInTheAir) {
    this.isInTheAir = isInTheAir;
  }

  /**
   * Ідентифікатор літака
   * @return ідентифікатор
   */
  public int getId() {
    return id;
  }


  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }
  public void sendMessage(String message) {
    if (mediator != null){
      mediator.broadcast(this, message);
    }
  }
  public void handleMessage(Plane from, String message) {
    System.out.println("Plane " + this.getId() + " received message " + message + " from plane " + from.getId());
  }
}
