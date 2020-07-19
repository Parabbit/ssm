/**
 *获取英文字符串中首先出现3次的字母
 */
public class Test {
    public static void getThree(String str){
        char[] a=str.trim().toCharArray();
        int[] b=new int[127];
        for(char c : a){
            b[c]++;
            if((c>='a'&&c<='z'||c>='A'&&c<='Z')&&b[c]==3){
                System.out.print(c);
                break;
            }

        }
    }

    public static void main(String[] args) {
        String str="12525Hhhhavve you everh.....";
        getThree(str);
    }
}
