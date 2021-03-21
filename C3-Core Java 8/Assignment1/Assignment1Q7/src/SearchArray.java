class SearchArray {
    private int[] ar;
    private int lengthOfArray;
    SearchArray(int[] ar,int lengthOfArray)
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
    public boolean searchArray(int search) {
        int high=lengthOfArray-1,low=0,middle;
        middle=high/2;
        while(high>low)
        {
            if(ar[middle] == search)
            {
                return true;
            }
            else
                if(ar[middle]>search)
                {
                    high=middle-1;
                }
                else{
                    low=middle+1;
                }
            middle=(high+low)/2;
        }
        return false;
    }

}