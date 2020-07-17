public class Assignment1{
  public static void main(
                        String args[]){
    new Worker().doAsg();
  }
}
class Worker{
  public void doAsg(){
    double myVar;
    myVar = 3.0;
    myVar += 4.0;
    System.out.println(myVar);
  }
}