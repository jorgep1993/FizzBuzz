import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;


class FizzBuzzTest  {
    String[] blueprint;

    public FizzBuzzTest(String filename) throws FileNotFoundException{
        ArrayList<String> lines = new ArrayList<>();
        Scanner s = new Scanner(new File(filename));
        while(s.hasNextLine()){
            lines.add(s.nextLine());
        }
        blueprint = lines.toArray(new String[lines.size()]);
    }

    public void test(String[] testData){
        if (blueprint.length != testData.length){
            System.out.println("Input data not same size as test data");
            System.exit(0);
        }
        for (int i = 0; i < blueprint.length; i++) {
            if (!blueprint[i].equals(testData[i])) {
                System.out.println(String.format("Results does not match for number %d. Blueprint: %s Data: %s", i+1, blueprint[i], testData[i]));
                System.exit(0);
            }
        }
        System.out.println("Test data matches blueprint");
    }
}
