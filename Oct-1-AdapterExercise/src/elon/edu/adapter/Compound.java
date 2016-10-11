package elon.edu.adapter;

public class Compound implements ChemicalCompound {

	private String compound;
	private ChemicalDataBank cdb;
	
	public Compound(String string) {
		compound = string;
		cdb = new ChemicalDataBank();
	}

	@Override
	public String display() {
		String representation = "Compound: " + compound + "\n" +
				"Boiling point: " + getBoilingPoint() + "\n" +
				"Meling point: " + getMeltingPoint() + "\n" +
				"Molecular formula: " + getMolecularFormula() + "\n" +
				"Molecular weight: " + getMolecularWeight() + "\n";
		System.out.println(representation);
		return representation;
	}

	@Override
	public double getBoilingPoint() {
		return cdb.getCriticalPoint(compound, "");
	}

	@Override
	public double getMeltingPoint() {
		return cdb.getCriticalPoint(compound, "M");
	}

	@Override
	public String getMolecularFormula() {
		return cdb.getMolecularStructure(compound);
	}

	@Override
	public double getMolecularWeight() {
		return cdb.getMolecularWeight(compound);
	}

}
