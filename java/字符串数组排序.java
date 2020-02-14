import java.util.*;

public class TestChar {
    public static char rand(int min,int max){
        char ran2 = (char) (Math.random()*(max-min)+min);
        return ran2;
    }
    public static String str(){
        String str1="";
        for(int i=0;i<5;i++){
            switch(rand(1, 4)){
                case 1:
                str1 +=rand(48, 58);
                continue;
                case 2:
                str1 +=rand(65, 91);
                continue;
                case 3:
                str1 +=rand(97, 123);
                continue;
            }
        }
        return str1;
    }
    public static void main(String[] args) {
        String sz[] = new String[8];
        int in1 [] = new int [8];
        for(int i=0;i<8;i++){
            sz[i] = str();
            if(sz[i].charAt(0)>90){
                in1[i]=sz[i].charAt(0)-32;
            }else{
                in1[i]=sz[i].charAt(0);
            }

        }

        for(int i=1;i<in1.length;i++){
            for(int j=0;j<in1.length-i;j++){
                if(in1[j]>in1[j+1]){
                    String stemp = sz[j];
                    sz[j] = sz[j+1];
                    sz[j+1]=stemp;

                    int temp = in1[j];
                    in1[j] = in1[j+1];
                    in1[j+1]=temp;
                }

            }
        }
        for(int i=0;i<in1.length;i++){
            System.out.print(sz[i]+" ");
        }
        for(int i=0;i<in1.length;i++){
            System.out.print(in1[i]+" ");
        }
/*创建一个长度是8的字符串数组
使用8个长度是5的随机字符串初始化这个数组
对这个数组进行排序，按照每个字符串的首字母排序(无视大小写)

注1： 不能使用Arrays.sort() 要自己写
注2： 无视大小写，即 Axxxx 和 axxxxx 没有先后顺序*/
    }
}