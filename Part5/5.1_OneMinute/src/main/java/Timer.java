public class Timer {

    private int seconds;
    private int hunredthsOfSecond;

    public Timer() {
        this.seconds = 0;
        this.hunredthsOfSecond = 0;
    }

    public void advance() {
        this.hunredthsOfSecond += 1;
        if (this.hunredthsOfSecond == 100) {
            this.seconds += 1;
        }
        if (this.hunredthsOfSecond == 100) {
            this.hunredthsOfSecond = 0;
        }
        if (this.seconds == 60) {
            this.seconds = 0;
        }
    }

    public String toString() {
        if (this.seconds == 0 && this.hunredthsOfSecond == 0) {
            return "00:00";
        } else if ( this.seconds == 0 && this.hunredthsOfSecond < 10) {
            return this.seconds + "0:0" + this.hunredthsOfSecond;
        } else if (this.seconds < 10) {
            return "0" + this.seconds + ":" + this.hunredthsOfSecond;
        }
        return this.seconds + ":" + this.hunredthsOfSecond;
    }
}
