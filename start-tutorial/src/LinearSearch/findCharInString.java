package LinearSearch;

public class findCharInString {
    public static void main(String[] args) {
        String name="Alen";
        char target='l';
            boolean result = charString(name,target);
        System.out.println(result);
    }
    static boolean charString(String str,char tar){
        int i=0;
        while( i<str.length()){
            if(tar==str.charAt(i)) return true;
            i++;
        }
return false;
    }
}
