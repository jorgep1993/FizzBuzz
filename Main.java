import java.io.FileNotFoundException;


class Main  {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String[] res = fizzBuzz.getFizzBuzz(100);
        try{
            FizzBuzzTest tester = new FizzBuzzTest("FizzBuzz.txt");
            tester.test(res);
        } catch(FileNotFoundException e){
            System.out.println("File FizzBuzz.txt not found. Printing results without testing");
        }
        for (String s : res) {
            System.out.println(s);
        }
    }
}
