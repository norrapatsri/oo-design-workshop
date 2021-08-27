public class Range {
    public String x;

    public Range(String x) {
        this.x = x;
    }
    public boolean isStartWithInclusive() {
        return this.x.startsWith("[");
    }
}
