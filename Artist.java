class Artist{

	private String name;

	Artist(String name){
		
		this.name = name;
	}

	public String getName(){
		return name;
	}

 	public void setName(String name){
		this.name = name;
	}

	public void Display(){

		System.out.println("Artist Name :" +name);
	}

}