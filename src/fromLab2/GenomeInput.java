package fromLab2;

import java.util.Scanner;

public class GenomeInput {
	public static HumanGenome input() {
		Scanner sc = new Scanner(System.in);
		String genomeName;
		int numberOfGenes, numberOfChromosomes, numberOfCells;
		System.out.println("\nEnter Human genome details");
		System.out.print("Genome Name : ");
		genomeName = sc.nextLine();
		System.out.print("Number of genes : ");
		numberOfGenes = sc.nextInt();
		System.out.print("Number of Chromosomes : ");
		numberOfChromosomes = sc.nextInt();
		System.out.print("Number of Cells (Trillions): ");
		numberOfCells = sc.nextInt();
		sc.close();
		return new HumanGenome(genomeName, numberOfGenes, numberOfChromosomes, numberOfCells);

	}

	public static void main(String[] args) {
		System.out.println("Human genome test run");
		HumanGenome MickeyMouse = input();
		HumanGenome DonaldDuck = input();
		HumanGenome Elsa = input();

		MickeyMouse.print();
		DonaldDuck.print();
		Elsa.print();
	}
}