package exercise.object;

public class Flower {
    private String name;
    private String color;
    private boolean wild;

    public Flower(String name, String color, boolean wild) {
        this.name = name;
        this.color = color;
        this.wild = wild;
    }

    public Flower(String name, String color) {
        this.name = name;
        this.color = color;
        this.wild = true;
    }

    public Flower(String name) {
        this.name = name;
        this.color = "알지못함";
        this.wild = true;
    }

    public boolean isWild() {
        return wild;
    }


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }


}
