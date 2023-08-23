// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }

        StopWatch stopWatch = new StopWatch();

        // Selection sort
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        stopWatch.stop();
        System.out.println("Elapsed time: " + stopWatch.getElapsedTime() + " milliseconds");

    }

    public static class StopWatch {
        private long startTime, endTime;

        public StopWatch() {
            this.startTime = System.currentTimeMillis();
        }

        public double getStartTime() {
            return this.startTime;
        }

        public double getEndTime() {
            return this.endTime;
        }

        public void start() {
            startTime = System.currentTimeMillis();
        }

        public void stop() {
            endTime = System.currentTimeMillis();
        }

        public double getElapsedTime() {
            return endTime - startTime;
        }
    }
}