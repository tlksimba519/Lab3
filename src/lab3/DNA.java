package lab3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import fromLab2.NucleicAcid;

public class DNA {

	private ArrayList<NucleicAcid> LtoRHelix = new ArrayList<NucleicAcid>();
	private ArrayList<NucleicAcid> RtoLHelix = new ArrayList<NucleicAcid>();

	private Map<Character, Character> NAMap = new HashMap<Character, Character>();

	public DNA() {
		this.LtoRHelix = null;
		this.RtoLHelix = null;
	}

	public DNA(String strand) {

		initMap(NAMap);
		LtoRHelixpopulate(strand);

	}

	private void LtoRHelixpopulate(String strand) {
		for (int i = 0; i < strand.length(); i++) {
			LtoRHelix.add(new NucleicAcid(strand.charAt(i)));
			RtoLHelix.add(new NucleicAcid(NAMap.get(strand.charAt(i))));
		}
	}

	public void initMap(Map<Character, Character> map) {
		map.put('A', 'T');
		map.put('T', 'A');
		map.put('C', 'G');
		map.put('G', 'C');
	}

	public void print() {
		for (int i = 0; i < LtoRHelix.size(); i++) {
			LtoRHelix.get(i).print();
			RtoLHelix.get(i).print();
		}
	}

	public void highestMolarMass() {

		// G質量最大
		ArrayList<Integer> indexValuesL = new ArrayList<Integer>();
		ArrayList<Integer> indexValuesR = new ArrayList<Integer>();
		double molarMass = 151.1261;

		for (int i = 0; i < LtoRHelix.size(); i++) {
			if (LtoRHelix.get(i).getName().equals("Guanine")) {
				indexValuesL.add(i);
			}
			if (RtoLHelix.get(i).getName().equals("Guanine")) {
				indexValuesR.add(i);
			}
		}

		System.out.println("L-Helix : " + indexValuesL);
		System.out.println("R-Helix : " + indexValuesR);
		System.out.println("Highest Molar Mass : " + molarMass);

	}

	public void totalDensity() {

		double totalDensityL = 0;
		double totalDensityR = 0;

		for (int i = 0; i < LtoRHelix.size(); i++) {
			totalDensityL += LtoRHelix.get(i).getDensity();
			totalDensityR += RtoLHelix.get(i).getDensity();
		}

		System.out.println("L-Helix total density : " + totalDensityL);
		System.out.println("R-Helix total density : " + totalDensityR);

	}
}
