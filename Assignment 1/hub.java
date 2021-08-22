import java.io.File;  
import java.io.FileNotFoundException;
import java.util.Scanner; 


public class hub
{
    static long startTime = 0;
    
    private static void tick()
    {
		startTime = System.currentTimeMillis();
	}
	private static float toc()
    {
		return (System.currentTimeMillis() - startTime) / 1000.0f; 
	}
    public static void main(String[] args) 
    {
        // reading in the file and populating 1D array
        try 
        {
            File file = new File("sampleInput100.txt"); //change to args later
            int filterSize = 3; //Change to args later
            Scanner darkly = new Scanner(file);
            int loops = Integer.parseInt(darkly.nextLine());
            float [] values = new float[loops];

            for (int i = 0; i < loops; i++)
            {
                String line = darkly.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter(" "); 
                lineScanner.nextInt();
                values[i] = lineScanner.nextFloat();
                lineScanner.close();
            }

            darkly.close();
        } 
        catch(FileNotFoundException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }

}