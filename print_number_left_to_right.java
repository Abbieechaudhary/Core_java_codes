public class print_number_left_to_right {
    public static void main(String[] args) {
     int n=756;
     int node=0;
     int temp=n;
     while(temp!=0){
         temp/=10;
         node++;
     }
     int div=(int)Math.pow(10,node-1);
     while(div!=0){
         int q=n/div;
         System.out.println(q);
         n%=div;
         div/=10;


     }


        }

    }

