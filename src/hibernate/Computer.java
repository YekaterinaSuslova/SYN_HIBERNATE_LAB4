package hibernate;

public class Computer {

    private int id;
    private ComputerDescription computerDescription;
    private String producer;
    private String processor;
    private int cores;

    public Computer(Integer id, ComputerDescription computerDescription, String login) {
        this.id = id;
        this.computerDescription = computerDescription;
        this.producer = producer;
    }

    Computer() {
        
    }

    public ComputerDescription getComputerDescription() {
        return computerDescription;
    }

    public void setComputerDescription(ComputerDescription computerDesciption) {
        this.computerDescription = computerDesciption;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return getProducer();
    }

    public String getProcessor() {
        return processor;
    }

    public int getCores() {
        return cores;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    @Override
    public String toString() {
        return String.format("описание-%d %s, производитель-%s", computerDescription.getId(), computerDescription.getSeries(), producer);
    }

}
