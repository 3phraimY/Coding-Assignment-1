
public class Main {

	public static void main(String[] args) {
		Salesman salesman1 = new Salesman("John", 0.1f);
		Salesman salesman2 = new Salesman("Bob", 0.4f);
		Salesman salesman3 = new Salesman("Jill", 0.3f);
		Salesman salesman4 = new Salesman("Jack", 0.7f);
		Salesman salesman5 = new Salesman("Ron", 0.8f);
		Salesman salesman6 = new Salesman("Tim", 0.5f);
		Salesman salesman7 = new Salesman("Phil", 0.2f);
		Salesman salesman8 = new Salesman("Mark", 0.6f);
		Salesman[] SalesmanArray = new Salesman[] {salesman1, salesman2, salesman3, salesman4, salesman5, salesman6, salesman7, salesman8};
		String[] TopFive = new String[5];
		float test = 0f;
		int currentMax = 0;
		int topFiveCounter = 0;
		for(int i =0; i<5; i++)
		{
			currentMax = 0;
			test = 0f;
			for(int j=0; j<SalesmanArray.length; j++)
			{
				if(SalesmanArray[j].getSales()> test)
				{
					test = SalesmanArray[j].getSales();
					currentMax = j;
				}
			}
			TopFive[topFiveCounter] = SalesmanArray[currentMax].getName();
			topFiveCounter++;
			System.out.println(SalesmanArray[currentMax].getName());
			SalesmanArray = removeAtIndex(SalesmanArray, currentMax);
		}
	}


	public static Salesman[] removeAtIndex(Salesman[] array, int index)
	{
		int counter = 0;
		Salesman[] returnArray = new Salesman[array.length -1];
		for(int i = 0; i<array.length; i++)
		{
			if(i != index)
			{
				returnArray[counter] = array[i];
				counter++;
			}
		}
		return returnArray;
	}
}
