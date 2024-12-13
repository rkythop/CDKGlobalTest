package RightShift;

public class RightShift {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3};

        if(arr.length > 0){
            int last = arr[arr.length-1];
            for(int j = arr.length-1; j > 0; j--){    
                //Shift element to right    
                arr[j] = arr[j-1];    
            }      
            arr[0] = last;    
        }    
    }
}
    

