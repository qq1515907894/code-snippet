import java.util.*;

public class Main {
    public static char rand(int min,int max){
        char ran2 = (char) (Math.random()*(max-min)+min);
        return ran2;
    }
    public static String str(int n){
        String str1="";
        for(int i=0;i<n;i++){
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
        String password = str(3);
        System.out.println("密码为："+password);
        String str = "";
        for(int i=48;i<123;i++){
            for(int j=48;j<123;j++){
                for(int k=48;k<123;k++){
                    str=(char)i+""+(char)j+(char)k+"";

                    if(str.equals(password)){
                        System.out.println("破译结果为："+str);
                        break;
                    }

        }
        }
        }


    }
}