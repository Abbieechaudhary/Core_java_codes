class find_first_repeated_number {
    public int find_first(int[] num) {
       int min=-1;
       HashSet <Integer> set=new HashSet<>();
       for(int i=0;i<num.length;i++){
           if (set.contains(num[i])){
               min=i;
               break;
           }
           else{
               set.add(num[i]);
           }
       }
       return num[min];
    }

    public static void main(String[] args) {
        int input1[]={1,2,4,1,2,8};
        int input2[]={1,2,3,3,2,1};
        find_first_repeated_number ob=new find_first_repeated_number();
        int r1=ob.find_first(input1);
        int r2=ob.find_first(input2);
        System.out.println("output1 = "+r1);
        System.out.println("output2 = "+r2);

    }
}
