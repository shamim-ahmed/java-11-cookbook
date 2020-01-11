package edu.buet.cse.ch02.model;

public class HomeOffice implements Home, Office {
  // If we don't override this method, compilation will fail
  @Override
  public String getAddress() {
    // note how we invoke the default implementation in super interfaces
    String addr1 = Home.super.getAddress();
    String addr2 = Office.super.getAddress();

    return String.format("%s and %s", addr1, addr2);
  }

  public static void main(String... args) {
    HomeOffice homeOffice = new HomeOffice();
    System.out.println(homeOffice.getAddress());
  }
}
