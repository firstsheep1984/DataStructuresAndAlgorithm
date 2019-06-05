package Bank.Multithread;

public class StockIndexs {
    public static class NASDAQ implements Runnable {
        private double nasdaqIndex;

       public NASDAQ(double nasdaqIndex) {
            this.nasdaqIndex = nasdaqIndex;
        }



        @Override
        public void run() {
            System.out.println(" NASDAQ index is now " + nasdaqIndex);
        }
    }

    public static class DowJones implements Runnable {
        private double dowJonesIndex;

        public DowJones(double dowJonesIndex) {
            this.dowJonesIndex = dowJonesIndex;
        }

        @Override
        public void run() {
            System.out.println(" Dow Jones index is now " + dowJonesIndex);
        }
    }
}
