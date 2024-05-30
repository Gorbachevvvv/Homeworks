public class MinFinder implements Runnable {
    private int[] array;
    private int minValue;

    public MinFinder(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        minValue = array[0];
        for (int value : array) {
            if (value < minValue) {
                minValue = value;
            }
        }
    }

    public int getMinValue() {
        return minValue;
    }
}