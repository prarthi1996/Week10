public class Specific_Value {
    public static void main(String args[]){
        int[] myArray = {55, 45, 69, 44};
        int num = 66;

        for(int i = 0; i<myArray.length; i++){
            if(num == myArray[i]){
                System.out.println("Array contains the given element");
            }
            else
            {
                System.out.println("Array does not contain the given element");
            }
        }
    }
}

