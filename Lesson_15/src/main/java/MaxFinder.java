public class MaxFinder implements Runnable {
    private int[] array;
    private int maxValue;

    public MaxFinder(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        maxValue = array[0];
        for (int value : array) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
    }

    public int getMaxValue() {
        return maxValue;
    }
}