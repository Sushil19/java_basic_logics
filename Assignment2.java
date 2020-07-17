public class Assignment2 {
	public static void main (String [] args){
		new worker().doasg();
		}
}

class worker{
	public void doasg(){
		double myDoubleVar;
		//Integer.MAX_VALUE;
		int myIntVar = Integer.MAX_VALUE;
		myDoubleVar = myIntVar ;	//widening conversion
		System.out.println(myDoubleVar);
		System.out.println(myIntVar+2);	//note this too

		}
	}

	//Double to Int conversion Will be a compiletime error
	//but the casting will be allowed i,e.
	//intVar = (int)doubleVar