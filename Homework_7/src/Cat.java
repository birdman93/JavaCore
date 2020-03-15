public class Cat {

    private final String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }
// Коты едят
    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            satiety = true;
            plate.decreaseFood(appetite);
            System.out.println(name + " наелся, он доволен.");
        }
        else  {
            if (plate.getFood() == 0) {
                System.out.println(name + " не поел вовсе");
            } else {
                // int foodEat = plate.getFood() - appetite;
                appetite = appetite - plate.getFood();
                plate.decreaseFood(plate.getFood());
                System.out.println(name + "  поел, но не наелся. Он остался недоволен!");
            }
        }
    }
}
