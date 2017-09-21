package stuff;

public abstract class Soldier {
    protected String name;
    protected String Rank;
    protected int serialNumber;
    protected int steps = 0;
    protected boolean hungry;
    protected boolean tired;


    protected void speak(){
        System.out.println("HOORRAAHH");
    }

    protected void march(){
        this.steps += 1;
        System.out.println("Marching");
    }
    protected void sleepyTime(){
        this.tired = true;
        System.out.println("Can't move another inch");
    }
    protected void stuffFace(){
        this.hungry = true;
        System.out.println("Pork and beans AGAIN??");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return Rank;
    }

    public void setRank(String rank) {
        Rank = rank;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}

