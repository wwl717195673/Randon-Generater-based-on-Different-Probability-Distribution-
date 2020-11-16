package window;

import simulate.*;

public class RealDisFactory {
	public AbstractRealDistribution CreateDis(int key,String[] p) {
		switch(key) {
		case 1:
			return new BetaDistribution(Double.parseDouble(p[0]),Double.parseDouble(p[1]));
		case 2:
			return new CauchyDistribution(Double.parseDouble(p[0]),Double.parseDouble(p[1]));
		case 3:
			return new ChiSquaredDistribution(Double.parseDouble(p[0]),Double.parseDouble(p[1]));
		case 4:
			return new ConstantRealDistribution(Double.parseDouble(p[0]));
		case 5:
			return new ExponentialDistribution(Double.parseDouble(p[0]));
		case 6:
			return new FDistribution(Double.parseDouble(p[0]),Double.parseDouble(p[1]));
		case 7:
			return new GammaDistribution(Double.parseDouble(p[0]),Double.parseDouble(p[1]));
		case 8:
			return new GumbelDistribution(Double.parseDouble(p[0]),Double.parseDouble(p[1]));
		case 9:
			return new LaplaceDistribution(Double.parseDouble(p[0]),Double.parseDouble(p[1]));
		case 10:
			return new LevyDistribution(Double.parseDouble(p[0]),Double.parseDouble(p[1]));
		case 11:
			return new LogisticDistribution(Double.parseDouble(p[0]),Double.parseDouble(p[1]));
		case 12:
			return new NakagamiDistribution(Double.parseDouble(p[0]),Double.parseDouble(p[1]));
		case 13:
			return new NormalDistribution(Double.parseDouble(p[0]),Double.parseDouble(p[1]));
		case 14:
			return new ParetoDistribution(Double.parseDouble(p[0]),Double.parseDouble(p[1]));
		case 15:
			return new TDistribution(Double.parseDouble(p[0]));
		case 16:
			return new TriangularDistribution(Double.parseDouble(p[0]),Double.parseDouble(p[2]),Double.parseDouble(p[1]));
		case 17:
			return new UniformRealDistribution(Double.parseDouble(p[0]),Double.parseDouble(p[1]));
		case 18:
			return new WeibullDistribution(Double.parseDouble(p[0]),Double.parseDouble(p[1]));
		default:
			return null;
		}
	};
}
