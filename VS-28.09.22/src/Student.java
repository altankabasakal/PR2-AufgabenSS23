
public class Student {

	private String name;
	private String vorname;
	private String studiengang;
	private int matrikelnr;

	public Student() {

	}

	public Student(String name, String vorname, String studiengang, int matrikelnr) {
		this.name = name;
		this.vorname = vorname;
		this.studiengang = studiengang;
		this.matrikelnr = matrikelnr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getStudiengang() {
		return studiengang;
	}

	public void setStudiengang(String studiengang) {
		this.studiengang = studiengang;
	}

	public int getMatrikelnr() {
		return matrikelnr;
	}

	public void setMatrikelnr(int matrikelnr) {
		this.matrikelnr = matrikelnr;
	}

}
