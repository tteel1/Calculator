public class magicCalc extends Calc {

    public double squareRoot (double a){
        return Math.sqrt(a);
    }

    public double sin (double a){
        return Math.sin(a);
    }

    public double coSine (double a){
        return Math.cos(a);
    }

    public double tan (double a) {
        return Math.tan(a);
    }

    public int fact ( int a){
        int c = 1;
        for(int i = 1; i <= a; i++){
            c = c*i;

        }
        return c;
    }
}
