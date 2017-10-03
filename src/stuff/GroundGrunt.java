package stuff;

public class GroundGrunt extends Soldier implements HandToHand {


    @Override
    public String throwPunch() {
        return "GET SOME!";
    }

    @Override
    public String highKick() {
        return "WHATCHA!!";
    }

    @Override
    public String neckBreak() {
        return "And scene...";
    }

    @Override
    public String chokeOut() {
        return "just think happy thoughts big guy";
    }

    @Override
    protected String speak() {
        return "Don't mean nothin";
    }

    @Override
    public String dropDead() {
        return "Cant take it";
    }
}
