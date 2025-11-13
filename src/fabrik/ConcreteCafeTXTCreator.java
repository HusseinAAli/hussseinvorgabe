package fabrik;

public class ConcreteCafeTXTCreator extends Creator {

	@Override
	public Product factoryMethod(String typ) throws Exception {
		return new ConcreteCafeTXTProduct();
	}
}
