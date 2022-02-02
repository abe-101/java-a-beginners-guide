class Avg {
    public static void main(String[] args) {
        double [] arr = {1.2, 4.5, 4.5, 23, 6.5, 2, 7.1, 5.4, 4.5, 6.4};
        double sum = 0;
        
        for(int i=0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The average of arr is: " + sum/arr.length);
    }
}
