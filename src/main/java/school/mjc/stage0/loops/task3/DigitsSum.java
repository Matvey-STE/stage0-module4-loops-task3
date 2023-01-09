package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int counter = t;
        int result = 0;
        if (t<0){
            counter = counter*-1;
        }
        String temp = Integer.toString(t);
        for (int i = 0; i<temp.length(); i++){
            result += counter%10;
            counter = counter/10;
        }
        System.out.println(result);
    }
}
