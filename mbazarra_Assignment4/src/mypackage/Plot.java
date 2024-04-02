/*
 * Class: CMSC203 
 * Instructor: Dr. Grinberg
 * Description: using arrays
 * Due: 04/01/24
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Montana Bazarragchaa
*/

package mypackage;

public class Plot {
    private int x;
    private int y;
    private int width;
    private int depth;

    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }
    
    public boolean encompasses(Plot plot) {
        int x2 = x + width;
        int y2 = y + depth;
        int plotX2 = plot.x + plot.width;
        int plotY2 = plot.y + plot.depth;

        return plot.x >= x && plot.y >= y && plotX2 <= x2 && plotY2 <= y2;
    }

    public boolean overlaps(Plot plot) {
        int x2 = plot.x + plot.width;
        int y2 = plot.y + plot.depth;
        
        return (plot.x >= x && plot.x <= x + width && plot.y >= y && plot.y <= y + depth) ||
               (x >= plot.x && x <= x2 && plot.y >= y && plot.y <= y + depth) ||
               (plot.x >= x && plot.x <= x + width && y >= plot.y && y <= y2) ||
               (x >= plot.x && x <= x2 && y >= plot.y && y <= y2);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    @Override
    public String toString() {
        return x + "," + y + "," + width + "," + depth;
    }
}
