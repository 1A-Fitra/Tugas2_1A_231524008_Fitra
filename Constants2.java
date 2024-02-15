public class Constants2 {
    public static final double CM_PER_INCH = 2.54;
    public static void main(String[] args) {
        double paperWidth = 8.5;
        double paperHeight = 11;

        System.out.println("Size in centimeters " 
        + CM_PER_INCH*paperWidth 
        + " by " 
        + CM_PER_INCH*paperHeight);
    }
}