public class Happy_Number {
    public boolean isHappy(int n){
        while(n > 9){
            n = getNum(n);
        }
        if(n == 7 || n==1) return true;
        return false;
    }
    public int getNum(int n){
        int[] result = new int[String.valueOf(n).length()];
        for(int i = 0; i < result.length; i++){
            result[i] = (int) (n / Math.pow(10, i)) % 10;
        }
        n = 0;
        for(int i = 0; i < result.length; i++){
            n += Math.pow(result[i], 2);
        }
        return n;
    }
    public static void main(String[] args) {
        Happy_Number hn = new Happy_Number();
        System.out.println(hn.isHappy(19));
    }
}
