class FizzBuzz  {


    /*
    * This method implements the number game FizzBuzz.
    * @param n The number to which the method will run
    * @return An array containg the first n values of FizzBuzz
    */
    public String[] getFizzBuzz(int n){
        String s;
        String[] res = new String[n];
        for (int i = 1; i <= n; i++) {
            s = "";
            if(i % 3 == 0){
                s += "Fizz";
            }
            if (i % 5 == 0){
                s += "Buzz";
            }
            if (s.isEmpty()){
                s += i;
            }
            res[i - 1]  = s;
        }
        return res;
    }

}
