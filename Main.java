class Main {
  public static void main(String[] args) {
    System.out.println("\n" + "****Les canards****" + "\n");

    Canard colvert = new Colvert();
    colvert.afficher();
    colvert.nager();
    colvert.effectuerVol();
    colvert.effectuerCancan();
    colvert.setComportementCancan(new Coincoin());
    colvert.setComportementVol(new NePasVoler());
  
    
    Canard plastique = new CanardEnPlastique();
    plastique.afficher();
    plastique.nager();
    plastique.effectuerVol();
    plastique.effectuerCancan();
    plastique.setComportementCancan(new Coincoin());
    plastique.setComportementVol(new VolerAvecDesAiles());

    Canard mandarin = new Mandarin();
    mandarin.afficher();
    mandarin.nager();
    mandarin.effectuerVol();
    mandarin.effectuerCancan(); 
    mandarin.setComportementCancan(new Coincoin());
    mandarin.setComportementVol(new VolerAvecDesAiles());
  }
}