package hibernate;

public class ComputerDescription {

    private Integer id;
    private String series;
    private String drive;

    public ComputerDescription() {
    }

    public ComputerDescription(String series, String drive) {
        this.series = series;
        this.drive = drive;
    }

    

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    @Override
    public String toString() {
        return String.format("ComputerDescription [id=%s, series=%s, drive=%s]", id, series, drive);
    }
}
