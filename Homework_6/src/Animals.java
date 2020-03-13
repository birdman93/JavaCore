public abstract class Animals {

    protected String name;
    protected int maxRun;
    protected int maxSwim;
    protected double maxJump;

    public Animals (String name, int maxRun, int maxSwim, double maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
    }

    protected void running (int distanceRun) {
        if(maxRun >= distanceRun && distanceRun > 0)
            System.out.println(name + " пробежал: " + distanceRun + ".");
        else
            System.out.println(name + " не может пробежать такую дистанцию.");
    }

    protected void swimming (int distanceSwim) {
        if(maxSwim >= distanceSwim && distanceSwim > 0)
            System.out.println(name + " проплыл: " + distanceSwim + ".");
        else
            System.out.println(name + " не может проплыть такую дистанцию.");
    }

    protected void jumping (double heightJump) {
        if(maxJump >= heightJump && heightJump > 0)
            System.out.println(name + " прыгнул на высоту: " + heightJump + ".");
        else
            System.out.println(name + " не может прыгнуть на указанную высоту.");
    }
}
