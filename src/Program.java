class Program {
    public static int[] bubbleSort(int[] array) {

        int locked = array.length-1;
        boolean swapped = false;
        do{
            for(int i = 0; i < locked; i++){
                int temp = array[i];
                if(array[i] > array[i+1]){
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = true;
                }
            }
            locked--;
            if(locked == 0) swapped = false;
        }while(swapped);

        return array;
    }
}