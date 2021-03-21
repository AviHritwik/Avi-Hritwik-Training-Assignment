public class BubbleSort {
    private int[] ar;
    private int lengthOfArray;
    BubbleSort(int[] ar,int lengthOfArray)
    {
        this.ar=ar;
        this.lengthOfArray=lengthOfArray;
    }

    public void getAr() {
        for (int i: ar) {
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }
    public boolean sort()
    {
        int swap;
        for(int i=0;i<lengthOfArray-1;i++)
        {
            for(int j=0;j<lengthOfArray-i-1;j++)
            {
                if(ar[j]>ar[j+1]) {
                    swap = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = swap;
                }
            }
        }
        return true;
    }
}

