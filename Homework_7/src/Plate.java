public class Plate {

    private Cat[] cats;
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void addCat(Cat cat) {
    }

    public int getFood() {
        return food;
    }
// Добавляем в миску указанное кол-во корма
    public void addFood(int food) {
        this.food += food;
    }
// Вывод о кол-ве еды в миске
    public void info() {
        System.out.println(this);
    }
// Убывание еды (если кормим котов и получаем отрицательное число, то приравниваем кол-во еды к 0
    public void decreaseFood (int foodCount) {
        if(food < 0)
            food = 0;
        else
        this.food -= foodCount;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }

}
