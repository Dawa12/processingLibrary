import processing.core.PApplet;

public class Main extends PApplet {
    public static void main(String[] args){
        PApplet.main("Main", args);
    }

    public void settings() {
        size(800, 800);
    }

    public void draw() {
        if (mousePressed) {
            fill(0);
        } else {
            fill(255);
        }

        ellipse(mouseX, mouseY, 40, 40);

        int[] x = {
                50, 61, 83, 69, 71, 50, 29, 31, 17, 39
        };

        fill(255);
        // Read one array element each time through the for loop
        for (int i = 0; i < x.length; i++) {
            rect(0, i*10, x[i], 8);

        }
    }
}
