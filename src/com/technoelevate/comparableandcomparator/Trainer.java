package com.technoelevate.comparableandcomparator;

public class Trainer  implements Comparable<Trainer> {
	int id;
	String name;
	String experince;
	public Trainer(int id, String name, String experince) {
		super();
		this.id = id;
		this.name = name;
		this.experince = experince;
	}
	
	@Override
	public int compareTo(Trainer o) {
		return this.experince.compareTo(o.experince);
	}

	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", experince=" + experince + "]";
	}

}
