public class Serial implements Copy {
    private String nameOfSerial;
    private int season;
    private int series;

    public Serial(String nameOfSerial, int season, int series) {
        this.nameOfSerial = nameOfSerial;
        this.season = season;
        this.series = series;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getNameOfSerial() {
        return nameOfSerial;
    }

    public void setNameOfSerial(String nameOfSerial) {
        this.nameOfSerial = nameOfSerial;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Serial{" +
                "nameOfSerial='" + nameOfSerial + '\'' +
                ", season=" + season +
                ", series=" + series +
                '}';
    }

    @Override
    public Object copy() {
        Serial copyOfSerial = new Serial(nameOfSerial, season, series);
        return copyOfSerial;
    }
}
