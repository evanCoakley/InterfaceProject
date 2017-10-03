package stuff;

 public  class ArtillerizeGrunt extends Soldier implements AdvancedArtillerizable {


     @Override
     public String fireRPG() {
         return "FIRE IN THE HOLE!!";
     }

     @Override
     public String layClaymore() {
         return "Get on the TRIGGER";
     }

     @Override
     public String fireMortar() {
         return "INCOMING!!";
     }

     @Override
     protected String speak() {
         return "BLOW IT ALL TO HELL";
     }

     @Override
     public Bomb bomber() {
         return new Bomb();
     }
 }
