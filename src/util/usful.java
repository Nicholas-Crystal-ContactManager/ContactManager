package util;

public class usful {
    public static int random(int x){
        int min = 1;
        return  (int)Math.floor(Math.random()*(x-min+1)+min);

    }

}
