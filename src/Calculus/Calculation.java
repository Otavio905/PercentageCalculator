package Calculus;

public class Calculation {
    private double totalElements;
    private double samples;
    private double percentage;

    public Calculation(double totalElements, double samples) {
        this.totalElements = totalElements;
        this.samples = samples;
    }

    public double getTotalElements() {
        return totalElements;
    }
    public double getSamples() {
        return samples;
    }

    public double conversion(double totalElements, double samples){
        percentage = (samples*100)/totalElements;
        return percentage;
    }

    @Override
    public String toString(){
        return "Percentage: "+String.format("%.2f", conversion(totalElements, samples))
        +"%";
    }

}
