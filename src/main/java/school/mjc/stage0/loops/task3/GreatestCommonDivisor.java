package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int count = 1;
        int temp = 0;
        while (count <= second){
            if (first%count == 0 && second%count == 0){
                temp = count;
            }
            count++;
        }
        System.out.println(temp);
    }
}
