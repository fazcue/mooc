/**
 *
 * @author facu
 */
public class Fitbyte {
    private int age;
    private int rate;
    
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.rate = restingHeartRate;
    }
    
    private double maximunHeartRate() {
        return 206.3 - (0.711 * this.age);
    }
    
    public double targetHeartRate(double percentageOfMaximun) {
        return (this.maximunHeartRate() - this.rate) * percentageOfMaximun + this.rate;
    }
}
