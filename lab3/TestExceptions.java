class TestExceptions {
  public static void main(String[] args) {
 
  String vehicles[] = { "Car", "Bus", "Bike", "Plane", "Ship" };
 
  try {
    for (int i = 1; i <= 5; i++) {
      System.out.println(vehicles[i]);
    }
  }
  catch (Exception e) {
    System.out.println(e);
  }
  }
}
