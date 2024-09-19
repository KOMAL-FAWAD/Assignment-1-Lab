class Artwork{ 
	
	private String artname;
	private int year;
	private Artist artist;

	Artwork(String artname, int year, Artist artist){
	        this.artname = artname;
		this.year = year;
		this.artist = artist.getName();
	}

	Artwork(String artname, int year, Artist artist){
		this.artname = artname;
		this.year = year;
		this.artist = artist;
	}

	public String getArtname(){
		return artname;
	}
	
	public void setArtname(String artname){
		this.artname = artname;
	}

	
	public int getyear(){
		return year;
	}

	public void setYear(int year){
		this.year = year;
	}

	public Artist getArtist(){
		return artist.getName();
	}

	public void setArtist(Artist artist){
		this.artist = artist;
	}

	public void displayart(){
		System.out.println("Title :" +artname);
		System.out.println("Year :" +year);		
		System.out.println("Artist:" +artist.getName());
	}
}