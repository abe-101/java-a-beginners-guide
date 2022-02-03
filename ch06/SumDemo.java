class SumIt {
    int sum(int ... n) {
        int results = 0;

        for(int i=0; i < n.length; i++)
            results =+ n[i];

        return results;
    }
}

class SumDemo {
    public static void main(String[] args) {

        SumIt siobj = new SumIt();

        int total = siobj.sum(1, 2, 3);
        System.out.println("Sum is " + total);
        
        total = siobj.sum(1, 2, 3, 4, 5);
        System.out.println("Sum is " + total);
    }
}
