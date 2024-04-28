public class DoubleReversal {
    public static String reverse(String s){
        String out = "";
        for(int i=s.length()-1; i>=0; i--){
            out += s.charAt(i);
        }
        return out;
    }
    public static boolean isSameAfterReversals(int num) {
        String reversed = "" + num;
        reversed = reverse(reversed);
        int out = Integer.parseInt(reversed);
        reversed = reverse(out+"");
        out = Integer.parseInt(reversed);
        return out==num;
    }

    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(1800));
    }
}
