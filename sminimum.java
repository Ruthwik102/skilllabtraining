
public class sminimum{
    public static void main(String[] args) {
        double[] numbers={12.5,9.2,4.5,19.5,2.5,56.8};
        double min=Double.MAX_VALUE;
        double secmin=Double.MAX_VALUE;
        for(int i=1;i<numbers.length;i++)
        {
            if(numbers[i]<min)
            {
            secmin=min;
            min=numbers[i];
            }
           else if(numbers[i]<secmin && secmin>min) 
            secmin=numbers[i];
        }
        System.err.println(""+secmin);
    }
}