

public class surfaceareacuboid {
    
    public static void main(String[] args) {

        int l = 5; 
        int b = 3;   
        int h = 4;   

        int surfaceArea = 2 * (l*b + b*h + l*h);
        int volume = l * b * h;

        System.out.println(surfaceArea);
        System.out.println(volume);
    }
}
