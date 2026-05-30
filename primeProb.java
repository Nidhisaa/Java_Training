
public class primeProb
{
   @SuppressWarnings("unused")
   int add(int a, int b){// parameters
        int c = a+b;
        return c;
    }
    
   @SuppressWarnings("unused")
    boolean isPrime(){
        int number = 6;
      
      int count = 0;
        for(int i = 1;i<=number;i++){
            if(number%i == 0)
                count++;
        }
        return count == 2;
    }
    
  /*  void sort(int []array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] > array[j]){
                    int t = array[i];
                    array[i]= array[j];
                    array[j] = t;
                }
            }
        }
    }
    
    void duplicateMain()
    {
        Scanner sc = new Scanner(System.in);
        
        Main d = new Main();
        int num = sc.nextInt();
        int c = d.add(num,76);
        System.out.println("Hello "+c);
        
    }
    boolean linearSearch(int[]array, int target){
        for(int i=0;i<array.length;i++){
            if(array[i] == target)
               return true;
        }
        return false;
    }
    
    boolean binarySearch(int []array, int target){
        // step 1: sorting
        
        Arrays.sort(array);
        int left = 0, right = array.length - 1;
        
        while(left <= right){
            int mid = (left+right)/2;
            
            if(array[mid]==target)
                return true;
            if(target > array[mid])
                left = mid+1;
            else
                right = mid - 1;
        }
        
        return false;
    }*/
	/*public static void main(String[] args) {
	    Main m = new Main();
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		
		for(int i = 0;i<size;i++){
		    array[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		boolean search = m.binarySearch(array, target);
		System.out.println(search?"Element found":"Not Found");
	}
    */
}
// Searching :
// 1. linear Search
// 2. binary search






/*Sample i/p:

5
10 4 2 6 8

2

Sample o/p: Element Found*/