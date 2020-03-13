public class Cats extends Animals {

    public Cats(String name, int maxRun, int maxSwim, double maxJump) {
        super(name, maxRun, maxSwim, maxJump);
    }

    @Override
    public void swimming (int distanceSwim) {
        System.out.println("Команда не имеет смысла, коты не плавают.");
    }
}
