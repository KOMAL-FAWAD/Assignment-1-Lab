public class Demo{

	public static void main(String arg[]){

		Artist a1 = new Artist("Komal");

		Artwork art1 = new Artwork("The Palace",2020 ,new Artist());

		Artwork art2 = new Artwork("Princess Diana", 2019,"Unknown artist");
		
		art2.setArtname("Grey");

		art2.setYear(2024);

		art2.displayart();
	}
}