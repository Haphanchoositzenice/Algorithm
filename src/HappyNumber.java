public class HappyNumber {
    public boolean isHappy(int n){
        while(n > 9){
            n = getNum(n);
        }
        if(n == 7) return true; 
        if(n != 1 && n < 10) return false;
        return true;
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
        HappyNumber hn = new HappyNumber();
        System.out.println(hn.isHappy(19));
    }
}
