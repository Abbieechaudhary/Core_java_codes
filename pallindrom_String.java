public class pallindrom_String {
    public static void main(String[] args) {

        String str="heh";
        String pallin="";
        for (int i=str.length()-1;i>=0;i--){
            pallin+=str.charAt(i);
        }
        if (str.equals(pallin)){
            System.out.println(" pallindrom possible ");
        }
        else{
            System.out.println("none");
        }
    }
}
