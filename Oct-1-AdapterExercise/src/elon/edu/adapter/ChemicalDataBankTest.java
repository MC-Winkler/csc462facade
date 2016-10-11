package elon.edu.adapter;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChemicalDataBankTest {
	
	ChemicalDataBank cdb = new ChemicalDataBank();
	
	@Test
	public void testGetCriticalPoint() {
		assertEquals(cdb.getCriticalPoint("Water", "M"), 0.0f, 0);
		assertEquals(cdb.getCriticalPoint("Benzene", "M"), 5.5f, 0);
		assertEquals(cdb.getCriticalPoint("Alcohol", "M"), -114.1f, 0);
		assertEquals(cdb.getCriticalPoint("water", ""), 100.0f, 0);
		assertEquals(cdb.getCriticalPoint("benzene", ""), 80.1f, 0);
		assertEquals(cdb.getCriticalPoint("alcohol", ""), 78.3f, 0);
	}

	@Test
	public void testGetMolecularStructure() {
		assertEquals(cdb.getMolecularStructure("Water"),"H2O");
		assertEquals(cdb.getMolecularStructure("Benzene"),"C6H6");
		assertEquals(cdb.getMolecularStructure("Alcohol"),"C2H6O2");
	}

	@Test
	public void testGetMolecularWeight() {
		assertEquals(cdb.getMolecularWeight("Water"),18.015,0);
		assertEquals(cdb.getMolecularWeight("Benzene"),78.1134,0);
		assertEquals(cdb.getMolecularWeight("Alcohol"),46.0688,0);
	}

}
