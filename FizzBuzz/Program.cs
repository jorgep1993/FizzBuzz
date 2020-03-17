using System;

namespace FizzBuzz
{
    class Program
    {
        static void Main(string[] args)
        {
            FizzBuzzService fizzBuzzService = new FizzBuzzService();
            foreach (var result in fizzBuzzService.GetFizzBuzz(100))
            {
                Console.WriteLine(result);
            }
        }
    }
    
    class FizzBuzzService
    {
        public string[] GetFizzBuzz(int n)
        {
            string s;
            string[] res = new string[n];
            for (int i = 1; i <= n; i++)
            {
                s = "";
                if (i % 3 == 0)
                {
                    s += "Fizz";
                }
                
                if (i % 5 == 0)
                {
                    s += "Buzz";
                }

                if (s.Length == 0)
                {
                    s += i;
                }

                res[i - 1] = s;
            }

            return res;
        }
    }
}
