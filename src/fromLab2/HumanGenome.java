package fromLab2;

public class HumanGenome {
	private String genomeName;
	private int numberOfGenes, numberOfChromosomes, numberOfCells;

	public HumanGenome(String name, int genes, int chromosomes, int cells) {
		genomeName = name;
		numberOfGenes = genes;
		numberOfChromosomes = chromosomes;
		numberOfCells = cells;
	}

	public String getGenomeName() {
		return genomeName;
	}

	public int getNumberOfCells() {
		return numberOfCells;
	}

	public int getNumberOfChromosomes() {
		return numberOfChromosomes;
	}

	public int getNumberOfGenes() {
		return numberOfGenes;
	}

	public void setGenomeName(String name) {
		genomeName = name;
	}

	public void setNumberOfCells(int cells) {
		numberOfCells = cells;
	}

	public void getNumberOfChromosomes(int chromosomes) {
		numberOfChromosomes = chromosomes;
	}

	public void setNumberOfGenes(int genes) {
		numberOfGenes = genes;
	}

	public void print() {
		System.out.println("\nHuman genome details");
		System.out.printf("Genome Name : %s\n", genomeName);
		System.out.printf("Number of genes : %d\n", numberOfGenes);
		System.out.printf("Number of chromosomes : %d\n", numberOfChromosomes);
		System.out.printf("Number of cells (Trillions): %d\n", numberOfCells);
	}

}
