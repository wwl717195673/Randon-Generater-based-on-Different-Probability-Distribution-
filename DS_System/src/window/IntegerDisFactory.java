package window;

import simulate.*;

public  class IntegerDisFactory {
	
	public AbstractIntegerDistribution CreateDis(int key,String[] p) {
		switch(key) {
		case 1:
			return new BinomialDistribution(Integer.parseInt(p[0]),Double.parseDouble(p[1]));
		case 2:
			return new GeometricDistribution(Double.parseDouble(p[0]));
		case 3:
			return new HypergeometricDistribution(Integer.parseInt(p[0]), Integer.parseInt(p[1]), Integer.parseInt(p[2]));
		case 4:
			return new PascalDistribution(Integer.parseInt(p[0]),Double.parseDouble(p[1]));
		case 5:
			return new PoissonDistribution(Double.parseDouble(p[0]));
		case 6:
			return new UniformIntegerDistribution(Integer.parseInt(p[0]), Integer.parseInt(p[1]));
		case 7:
			return new ZipfDistribution(Integer.parseInt(p[0]),Double.parseDouble(p[1]));
		default:
			return null;
		}
	};
}
