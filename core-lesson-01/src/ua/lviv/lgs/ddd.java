package ua.lviv.lgs;

public class ddd {

	public static void main(String[] args) {
		
		int a = 1;
		short b = 23;
		long c = 1230950191;
		byte d = 2;
		float f = 13.1f;
		double g = 2.123;
		char h = '\t';
		boolean j = true;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);

		int[] array2 = new int[10];
		for (int i = 0; i < array2.length; i++) {
		    array2[i] = (int) Math.round((Math.random() * 50));
		    System.out.println(array2[i]);
		}

		
		    int max = getMax(array2);
		    System.out.println("Максимальне значення з массива: "+max);
		 
	
		    int min = getMin(array2);
		    System.out.println("Мінімальне значення з массива: "+min);

	}
	
	  public static int getMax(int[] inputArray){ 
		    int maxValue = inputArray[0]; 
		    for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){ 
		         maxValue = inputArray[i]; 
		      } 
		    } 
		    return maxValue; 
		  }
		 
		
		  public static int getMin(int[] inputArray){ 
		    int minValue = inputArray[0]; 
		    for(int i=1;i<inputArray.length;i++){ 
		      if(inputArray[i] < minValue){ 
		        minValue = inputArray[i]; 
		      } 
		    } 
		    return minValue; 
		  } 
}


