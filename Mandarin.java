public class Mandarin extends Canard {
  
  public Mandarin(){
    comportementCancan = new Coincoin();
    comportementVol = new NePasVoler();
  }
  public void afficher(){
    System.out.println("\n" + "Je suis un canard mandarin!");
  }
}