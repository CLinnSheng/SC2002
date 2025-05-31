public class Person {
    
    double height;
    double weight;

    public Person (double h, double w)
    {
        height = h;
        weight = w;
    }

    public double getHeight() 
    {
        return height;
    }

    public double getWeight()
    {
        return weight;
    }

    public double calculateBMI()
    {
        return calculateBMI(height, weight);
    }

    public static double calculateBMI(double h, double w)
    {
        return (h / (h * h));
    }

}
