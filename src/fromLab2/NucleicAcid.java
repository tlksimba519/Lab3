package fromLab2;

public class NucleicAcid {

	// properties
	private String name;
	private String chemicalFormula;
	private double molarMass;
	private double density;

	// constructor
	public NucleicAcid(char NA) {
		switch (NA) {
		case 'A':
			this.name = "Adenine";
			this.chemicalFormula = "C5H5N5";
			this.molarMass = 135.127;
			this.density = 1.6;
			break;
		case 'T':
			this.name = "Thymine";
			this.chemicalFormula = "C5H6N2O2";
			this.molarMass = 126.11334;
			this.density = 1.223;
			break;
		case 'C':
			this.name = "Cytosine";
			this.chemicalFormula = "C4H5N3O";
			this.molarMass = 111.102;
			this.density = 1.32;
			break;
		case 'G':
			this.name = "Guanine";
			this.chemicalFormula = "C5H5N5O";
			this.molarMass = 151.1261;
			this.density = 2.2;
			break;
		default:
			System.out.println("Error");
			break;
		}
	}

	// method
	public void print() {
		System.out.println("Name : " + getName());
		System.out.println("Chemical Formula : " + getChemicalFormula());
		System.out.println("Molar Mass : " + getMolarMass());
		System.out.println("Density : " + getDensity());
	}

	// getter&setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChemicalFormula() {
		return chemicalFormula;
	}

	public void setChemicalFormula(String chemicalFormula) {
		this.chemicalFormula = chemicalFormula;
	}

	public double getMolarMass() {
		return molarMass;
	}

	public void setMolarMass(double molarMass) {
		this.molarMass = molarMass;
	}

	public double getDensity() {
		return density;
	}

	public void setDensity(double density) {
		this.density = density;
	}

}
