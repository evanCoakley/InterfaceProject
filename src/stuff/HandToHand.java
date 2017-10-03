package stuff;

public interface HandToHand  {

    public String throwPunch();

    public String highKick();

    public String neckBreak();

    public String chokeOut();

    default String dropDead(){
        return "Can't take it no more";
    }


    }


