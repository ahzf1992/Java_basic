package concurrent;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;


public class Main {
    
    static final Point START = new Point(0, 0);
    static int minPath = Integer.MAX_VALUE;

    public static void main(String[] args) {
        
        InputDealer dealer = new InputDealer(System.in);
        dealer.deal();
        System.out.println(seekAll(dealer.getPoints(), 0));
    }

   
    public static int seekAll(Point[] points, int n) {
        if (n == points.length) {
            
            int sum = points[0].getLength(START);
            for (int i = 1; i < points.length; i++) {
                sum += points[i - 1].getLength(points[i]);
            }
           
            sum += points[points.length - 1].getLength(START);
            
            minPath = Math.min(minPath, sum);
            return minPath;
        }
       
        for (int i = n; i < points.length; i++) {
            swap(points, n, i);
            seekAll(points, n + 1);
            swap(points, n, i);
        }
        return minPath;
    }

    
    public static void swap(Point[] points, int i, int j) {
        if (i == j) {
            return;
        }
        Point temp = points[i];
        points[i] = points[j];
        points[j] = temp;
    }

}


class InputDealer {

    private Scanner scanner;
    private Point[] points;
    private int num;

    public InputDealer(InputStream in) {
        scanner = new Scanner(in);
    }
    public Point[] getPoints() {
        return points;
    }
    public int getNum() {
        return num;
    }
    
    public void deal() {
    	
    	Hashtable h= new Hashtable(); 
    	HashMap h1= new HashMap();
    	ConcurrentHashMap h3= new ConcurrentHashMap();
        Class c=Integer.class;
        for(Field f: c.getDeclaredFields())
        	//f.set(c, );
        
        
    	
        num = Integer.parseInt(scanner.nextLine().trim());
        points = new Point[num];
        
        for (int i = 0; i < num; i++) {
            String[] locations = scanner.nextLine().trim().split(",");
            points[i] = new Point(Integer.parseInt(locations[0]), Integer.parseInt(locations[1]));
        }
    }
}


class Point {
    int px;
    int py;

    public Point(int px, int py) {
        this.px = px;
        this.py = py;
    }

    
    public int getLength(Point p) {
        return Math.abs(px - p.px) + Math.abs(py - p.py);
    }
}


