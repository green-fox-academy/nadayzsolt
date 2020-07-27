package sharpie;

public class Sharpie {
    private String color;
    private Float width;
    private Float inkAmount;

    public Sharpie (String color, Float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100.0f;
    }

    public String getColor() {
        return color;
    }

    public Float getWidth() {
        return width;
    }

    public Float getInkAmount() {
        return inkAmount;
    }

    public void use(){
        --inkAmount;
    }
}
