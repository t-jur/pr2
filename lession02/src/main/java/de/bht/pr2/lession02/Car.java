package de.bht.pr2.lession02;

public class Car {

  private String brand = "";
  private String color = "";
  private String position = "";
  private int kmStatus = 0;
  private int speed = 0;

  public Car(String brand, String color, String position, int kmStatus) {
    this.brand = brand;
    this.color = color;
    this.position = position;
    this.kmStatus = kmStatus;
  }

  public void doBreak() {
    while (speed > 0) {
      speed--;
    }
  }

  public void drive(String targetPosition, int distanceInKm) {
    System.out.println("Das Auto faehrt von " + position + " nach " + targetPosition
        + " (" + distanceInKm + " Km entfernt).");
    position = targetPosition;
    kmStatus += distanceInKm;
  }

  public void accelerateUntil(int targetSpeed) {
    speed = targetSpeed;
  }

  public int getSpeed() {
    return speed;
  }

  public int getKmStatus() {
    return kmStatus;
  }

  public String getPosition() {
    return position;
  }

  public String toString() {
    return "Auto (" + brand + ", " + color + ")\n"
        + "\tStandort: " + position + "\n"
        + "\tKm-Stand: " + kmStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Car car = (Car) o;

    if (!brand.equals(car.brand)) {
      return false;
    }
    return color.equals(car.color);
  }

  @Override
  public int hashCode() {
    int result = brand.hashCode();
    result = 31 * result + color.hashCode();
    return result;
  }
}