package Calculus;

public class Calculation {
    //?This class is responsible for all calculations
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

    private double conversion(double totalElements, double samples){
        percentage = (samples*100)/totalElements;
        return percentage;
    }

    private double remaining(double percentage){
        double remaining = 100 - percentage;
        return remaining;
    }

    @Override
    public String toString(){
        return "Percentage: "+String.format("%.2f", conversion(totalElements, samples)) + "%"
        +"\nRemaining: "+String.format("%.2f", remaining(percentage)) + "%";
    }

}
