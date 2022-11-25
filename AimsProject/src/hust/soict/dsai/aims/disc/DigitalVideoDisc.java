package hust.soict.dsai.aims.disc;


public class DigitalVideoDisc {
	private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;}
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLength() {
        return length;}
    public float getCost() {
        return cost;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
    public void setTitle(String title) {
		this.title = title;
	}
    @Override
	public String toString() {
		return "DigitalVideoDisc [title=" + title + ", category=" + category + ", director=" + director + ", length="
				+ length + ", cost=" + cost + ", id=" + id + ", getTitle()=" + getTitle() + ", getCategory()="
				+ getCategory() + ", getDirector()=" + getDirector() + ", getId()=" + getId() + ", getLength()="
				+ getLength() + ", getCost()=" + getCost() + ", printDetail()=" + printDetail() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void setCategory(String category) {
		this.category = category;
	}
    public void setDirector(String director) {
		this.director = director;
	}
    public void setLength(int length) {
		this.length = length;
	}
    public void setCost(float cost) {
		this.cost = cost;
	}
    public DigitalVideoDisc() {
		super();
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public DigitalVideoDisc(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}
	public DigitalVideoDisc(String title, String category, String director) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
	}
	
	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}
	public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
		DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
	}

	private static int nbDigitalVideoDiscs = 0;	
	
	public String printDetail() {
		return(getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": " + getCost() + " $");
	}
	
	public boolean isMatch(String title) {
		String[] tmp = title.split(" ", 0);
		
		for(String x: tmp) {
			
			if(getTitle().toLowerCase().contains(x.toLowerCase())) return true;
		}
		
		return false;
	}
	
	public boolean isMatch(int id) {
		return this.id == id;
	}
	
		
	
	
	
}
