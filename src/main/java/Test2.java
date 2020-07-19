/**
 * 给指定的字符串加一个字母使其形成回文字符串的添加方式有几种
 */
public class Test2 {
    public static boolean huiWen(String str){
        int l=0;
        int r=str.length()-1;
        while(l<r){
            if(str.charAt(l) !=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String a="aaa";
        String b="a";
        int count =0;
        for(int i=0;i<=a.length();i++){
            StringBuilder sb=new StringBuilder(a);
            sb.insert(i,b);
            if(huiWen(sb.toString())){
                count++;
            }
        }
        System.out.print(count);
    }
}
