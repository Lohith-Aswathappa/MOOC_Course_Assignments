import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height){
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }

    public NightSky(double density, int width, int height){
        this.density = density;
        this.height = height;
        this.width = width;
    }

    public void printLine(){
        Random random = new Random();
        String ToPrint = " ";
        for(int i = 0; i < this.width; i++){
            if(random.nextDouble() <= this.density){
                ToPrint += "*";
                starsInLastPrint++;
            }else{
                ToPrint += " ";
            }
        }
        System.out.println(ToPrint);
    }

    public void print(){
        starsInLastPrint = 0;
        for(int i = 0; i < this.height; i++){
            this.printLine();
        }
        System.out.println("");
    }

    public int starsInLastPrint(){
        return starsInLastPrint;
    }
}
