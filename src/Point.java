public class Point {

    // two int instance variables named x and y
    private int x;
    private int y;

    // a constructor that accepts and sets both instance variables
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    // a constructor that accepts one value and sets both x and y to the same value
    public Point(int x){
        this.x = x;
        y = x;
    }

    // a constructor that has no parameters and sets x and y to 0 (the origin)
    public Point(){
        x = 0;
        y = 0;
    }

    // a "getter" method for x, name it getX (it should return an int)
    public int getX(){
        return x;
    }

    // a "getter" method for y, name it getY (it should return an int)
    public int getY(){
        return y;
    }

    // a "setter" method for x, name it setX (it should be a void method and have an int parameter)
    public void setX(int newX){
        x = newX;
    }

    // a "setter" method for y, name it setY (it should be a void method and have an int parameter)
    public void setY(int newY){
        y = newY;
    }

    // a method named coordinate that has no parameters and returns the x and y value as a String coordinate in this format: "(5, 8)"
    public String coordinate(){
        return "(" + x + ", " + y + ")";
    }

    // a method named quadrant that has no parameters and returns as a String the quadrant the point is in, either "I", "II", "III", "IV", "origin", or "on an axis"
    public String quadrant(){
        String quadrant = "none";
        if (x > 0 && y > 0){
            quadrant = "I";
        }if (x < 0 && y > 0){
            quadrant = "II";
        }if (x < 0 && y < 0){
            quadrant = "III";
        }if (x > 0 && y < 0){
            quadrant = "IV";
        }if (x == 0 && y == 0){
            quadrant = "origin";
        }if (x == 0 && y > 0){
            quadrant = "on an axis";
        }if (y == 0 && x > 0){
            quadrant = "on an axis";
        }
        return quadrant;
    }
}
