import java.util.ArrayList;
public class fibonacci{
  public ArrayList<Integer> fib(int x){
    ArrayList<Integer> fibonacci = new ArrayList<Integer>();
    fibonacci.add(0);
    fibonacci.add(0);
    if(x < 2) return fibonacci;
    for(int i = 2;i<=x;i++){
      int sum = (i - 1) + (i - 2);
      fibonacci.add(sum);
    }

      return fibonacci;
  }

  public static void main(String[] args){
    fibonacci pd = new fibonacci();


    System.out.println(pd.fib(6));

  }
} 
