

import java.util.Random;

public class Function {
    
    private double[] wsp;
    
    public Function(){
        Random rand = new Random();
        wsp = new double[12];
        for(int i=0;i<12;++i)
            wsp[i] = rand.nextFloat()*2.4-1.2;
    }
    
    public Function(double[] wsp){
        this.wsp = wsp;
    }
    
    public Point evaluate(Point p){
        double x = wsp[0]+wsp[1]*p.getX()+wsp[2]*p.getX()*p.getX()+wsp[3]*p.getX()*p.getY()+wsp[4]*p.getY()+wsp[5]*p.getY()*p.getY();
        double y = wsp[6]+wsp[7]*p.getX()+wsp[8]*p.getX()*p.getX()+wsp[9]*p.getX()*p.getY()+wsp[10]*p.getY()+wsp[11]*p.getY()*p.getY();
        return new Point(x,y);
    }
    
    public static void main(String[] args) {
        Function f = new Function();
        Point p = new Point(0, 0);
        for(int i=0;i<1000;++i){
            System.out.println(p);
            p = f.evaluate(p);
        }
        
    }
    
}
