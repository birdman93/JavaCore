import java.util.ArrayList;
import java.util.List;

public class Plate implements Observed {

    private int food;

    List<Observer> observers = new ArrayList<>();

    public Plate(int food) {
        this.food = food;
    }

    // Реализуем методы "Наблюдателя"
    public void addObserver(Observer cat) {
        observers.add(cat);
    }
    public void removeObserver(Observer cat) {
        observers.remove(cat);
    }
    public void notifyObservers() {
        for (Observer cat : observers) {
            cat.handleEvent(this.food);
        }
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

interface Observer {
    void handleEvent(int food);
}

interface Observed {
    void addObserver (Observer cat);
    void removeObserver (Observer cat);
    void notifyObservers ();
}