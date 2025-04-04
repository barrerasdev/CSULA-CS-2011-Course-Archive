public class testing {
  public static void main (String[] args){
    int[] numbers = {75,65,24,11,45,22,3,54,5,7,60,0,20,66};
    maxMin(numbers);
  }
  public static void maxMin(int[]array){
    int min = array[0];
    int max = array[0];

    for (int i = 1; i <array.length;i++){
      if (array[i]<min){
        min = array[i];
      }
      if (array[i] > max){
        max = array[i];
      }
    }
    System.out.println("Max: "+max);
    System.out.println("Min: "+min);
  }
}
