import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test3 {
    //统计一篇文章字符出现的次数；
    public static void getFile(File file){
        BufferedReader bfr=null;
        TreeMap<Character,Integer> map=new TreeMap<Character,Integer>();
        try {
            bfr=new BufferedReader(new FileReader(file));
            String a="";
            String b=null;
            while((a=bfr.readLine())!=null){
                        b=b+a.toLowerCase();
            }
            int len=b.length();
            char[] ch=b.toCharArray();
            for(int i=0;i<ch.length;i++){
                char c=ch[i];
                if(!map.containsKey(c)){
                    map.put(c,1);
                }else{
                    int count =map.get(c);
                    map.put(c,count+1);
                }
            }
            Set<Map.Entry<Character,Integer>> set=map.entrySet();
            Iterator<Map.Entry<Character,Integer>> iter=set.iterator();
            while(iter.hasNext()){
                Map.Entry<Character,Integer> maps=iter.next();
                char k=maps.getKey();
                int v=maps.getValue();
                System.out.println(k+"出现的次数是"+v);
            }
            /*for(int j=0;j<=map.size();j++){
                char c=ch[j];
                System.out.println(c+"-"+map.get(c));
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File f=new File("C:\\Users\\hasee\\Desktop\\a.txt");
        System.out.println(f.toString());
        getFile(f);
    }
}
