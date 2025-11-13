package fabrik;

public class ConcreteCafeCSVCreator extends Creator {

	@Override
	public Product factoryMethod(String typ) throws Exception {
		return new ConcreteCafeCSVProduct();
	}
}
