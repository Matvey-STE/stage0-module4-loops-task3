package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int result = 0;
        int tempDigit = 9;
        for(int i = 0; i < lengthOfLastNumber; i++){
            result += tempDigit;
            tempDigit = (tempDigit*10)+9;
        }
        System.out.println(result);
    }
}
