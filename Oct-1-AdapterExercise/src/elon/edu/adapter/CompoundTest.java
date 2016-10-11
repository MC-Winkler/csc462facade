package elon.edu.adapter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CompoundTest {

	ChemicalCompound waterCompound = new Compound("water");
	ChemicalCompound benzeneCompound = new Compound("benzene");
	ChemicalCompound alcoholCompound = new Compound("alcohol");
	
	@Test
	public void testDisplay() {
		String representation = "Compound: water\n" +
				"Boiling point: 100.0\n" +
				"Meling point: 0.0\n" +
				"Molecular formula: H2O\n" +
				"Molecular weight: 18.015\n";
		assertEquals(waterCompound.display(),representation);
	}

	@Test
	public void testGetBoilingPoint() {
		assertEquals(waterCompound.getBoilingPoint(), 100.0f, 0);
		assertEquals(benzeneCompound.getBoilingPoint(), 80.1f, 0);
		assertEquals(alcoholCompound.getBoilingPoint(), 78.3f, 0);
	}

	@Test
	public void testGetMeltingPoint() {
		assertEquals(waterCompound.getMeltingPoint(), 0.0f, 0);
		assertEquals(benzeneCompound.getMeltingPoint(), 5.5f, 0);
		assertEquals(alcoholCompound.getMeltingPoint(), -114.1f, 0);

	}

	@Test
	public void testGetMolecularFormula() {
		assertEquals(waterCompound.getMolecularFormula(),"H2O");
		assertEquals(benzeneCompound.getMolecularFormula(),"C6H6");
		assertEquals(alcoholCompound.getMolecularFormula(),"C2H6O2");
	}

	@Test
	public void testGetMolecularWeight() {
		assertEquals(waterCompound.getMolecularWeight(),18.015,0);
		assertEquals(benzeneCompound.getMolecularWeight(),78.1134,0);
		assertEquals(alcoholCompound.getMolecularWeight(),46.0688,0);
	}

}
