import org.junit.Test;

public class TestDepositoSSR1 {

	
	 	private double depMax;
	    private double depNivel;
	    DepositoCombustible depo;
	
	@Test
	public void testDepositoCombustible() {
		depo = new DepositoCombustible(100,0);
		
	}

	@Test
	public void testGetDepositoNivel() {
		depo = new DepositoCombustible (100,20);
		
	}

	@Test
	public void testGetDepositoMax() {
		depo = new DepositoCombustible (100,0);
		
	}

	@Test
	public void testEstaVacio() {
		depo= new DepositoCombustible (100,0);
		AssertTrue(depo ,0 );
	}

	@Test
	public void testEstaLleno() {
		depo = new DepositoCombustible(100,100);
		AssertTrue(depo  ,100);
	}

	private void AssertTrue(DepositoCombustible depo2, int i) {
		// TODO Apéndice de método generado automáticamente
		
	}

	public double getDepNivel() {
		return depNivel;
	}

	public void setDepNivel(double depNivel) {
		this.depNivel = depNivel;
	}

	public double getDepMax() {
		return depMax;
	}

	public void setDepMax(double depMax) {
		this.depMax = depMax;
	}

}
