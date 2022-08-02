public class CafeJava {
  public static void main(String[] args) { 
      String generalGreeting = "Welcome to Cafe Java, ";
      String pendingMessage = ", your order will be ready shortly";
      String readyMessage = ", your order is ready";
      String displayTotalMessage = "Your total is $";
      
      // Menu variables (add yours below)

      double mochaPrice = 3.5;
      double dripCoffeePrice = 3.0;
      double lattePrice = 4.5;
      double cappuccinoPrice = 4.5;
      double newTotal = lattePrice - dripCoffeePrice;


    //Customer name variables (add yours below)

      String customer1 = "Cindhuri";
      String customer2 = "Sam";
      String customer3 = "Jimmy";
      String customer4 = "Noah";
  
      // Order completions (add yours below)

      boolean isReadyOrder1 = false;
      boolean isReadyOrder2 = true;
      boolean isReadyOrder3 = false;
      boolean isReadyOrder4 = true;
  
      // APP INTERACTION SIMULATION (Add your code for the challenges below)

      // Example:

      System.out.println(customer1 + isReadyOrder1 + pendingMessage);

    if(isReadyOrder4){
      System.out.println(customer4 + readyMessage + displayTotalMessage + cappuccinoPrice);
    }

    System.out.println(customer2 + displayTotalMessage + lattePrice * 2);

    if(isReadyOrder2){
      System.out.println(customer2 + readyMessage);
    }

    System.out.println(customer3 + displayTotalMessage + newTotal);


    // ** Your customer interaction print statements will go here ** //

  }
}
