package HomeWork02;

public class Movie {

	String title;
	String genre;
	int runtime;
	
	boolean result;
	
	
	public Movie() {
	}

	public Movie(int runtime) {
		this.runtime = runtime;
	}

	public boolean isLongMovie(int runtine) {
	if(runtime >= 120) {
		return true;
	}else
		return false;
	}
	}
	
