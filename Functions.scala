package lectures.part1basics

object Functions extends App {

  //PARAMETRIZED FUNCTIONS
   def aFunction(a:String, b:Int):String = {
   a+" "+b
   }
  println(aFunction("Sharmila",1))

  //PARAMETERLESS FUNCTIONS can be called without parenthesis
  def anotherFunction():Int={
    43
  }
  println(anotherFunction())
  println(anotherFunction) //can be called without parenthesis

  //Recursive functions are preferred over loops in functional programming
  def aRecursiveFunction(a:String,b:Int):String={
    if (b==1) a
    else a+aRecursiveFunction(a,b-1)
  }
  println(aRecursiveFunction("Sharmila ",3))

  //WHEN U NEED LOOPS, USE RECURSION
  def aFunctionWithSideEffects(aString: String):Unit=println(aString)

  def aBigFunction(n:Int):Int={
    def aSmallerFunction(a:Int,b:Int):Int=a+b
    aSmallerFunction(n,n-1)
  }

  //TASK/EXERCISE

   def greeting(name:String,age:Int):Unit={
     println("Hi,my name is "+name+" and I am "+age+" years old")
   }
   greeting("Sharmila",24)

  def factorialFunc(n:Int):Int={
    if(n<=1) 1
    else n*factorialFunc(n-1)
  }
  println(factorialFunc(5))

  def fibonacciFunc(n:Int):Int={
    if (n<=2) 1
    else fibonacciFunc(n-1)+fibonacciFunc(n-2)
  }
  println(fibonacciFunc(2))
  println(fibonacciFunc(8))

def isPrime(n:Int):Boolean={
  def isPrimeUntil(t:Int):Boolean=
    if(t<=1) true
    else  n%t !=0 && isPrimeUntil(t-1)

  isPrimeUntil(n/2)
}
  println(if (isPrime(37)) "It is a prime number" else "Non-prime")
}
