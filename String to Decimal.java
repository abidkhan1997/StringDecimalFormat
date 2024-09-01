import java.util.Random;
import java.text.DecimalFormat;

public class Extra2 {
	public static void main(String[] args) 
	{

        Random rand = new Random();
        int bin = 10;
        int minput = 10000;
        double lambda = 0.1;
        int n=10;
        int[] o = new int[bin];//array list for numbers

        for (int experiment = 0; experiment < 200; experiment++) //200 experiments
        { 
            double tracker = 0;
            for (int i = 0; i < bin; i++)//10 bins
                o[i] = 0;
            for (int j = 0; j < minput; j++)//10000 minimum per bin
            {
                double firstrand = rand.nextDouble();//getting a random double
                for (int k = 1; k < n; k++)//Using n value and lambda
                {
                    double secondrand = rand.nextDouble();//getting second random double
                    if (secondrand > firstrand)//comparing
                        firstrand = Math.pow(secondrand, lambda*n);
                }
                double log = Math.exp(bin * Math.log(firstrand));
                int z = (int) (log * bin);
                o[z]++;
                tracker = 1 - (tracker +  Math.pow(o[z] - (minput / bin),2) / (minput / bin));
            }
            DecimalFormat dFormatter = new DecimalFormat("#.##");//getting two decimal points
            String formatted = dFormatter.format(tracker);
            System.out.println("Experiments = "+ formatted);
            }
        }
}
