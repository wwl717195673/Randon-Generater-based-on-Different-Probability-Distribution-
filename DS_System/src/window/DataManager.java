package window;

import java.util.*;

public class DataManager {
	public static DataManager DM = new DataManager();
	//分布类型
	 String[] listData = new String[]{"Null","Discrete","Continuous"};
     String[] kindone = new String[]{"Null","Binomial","Geometric","Hypergeometric","Pascal","Poisson","UniformInteger","Zipf"};
     String[] kindtwo = new String[]{"Null","Beta","Cauchy","ChiSquared","ConstantReal","Exponential","F",
     		"Gamma","Gumbel","Laplace","Levy","Logistic","Nakagami","Normal","Pareto","T","Triangular","UniformReal","WeiBull"};
	//参数列表
    public  HashMap<Integer, String> map = new HashMap<>();
	public  void initParameterofDistribution() {
		map.put(1,"The number of trials,The probability of success:");
		map.put(2, "The probability of success");
		map.put(3, "Population size,Number of successes in the population,Sample size:");
		map.put(4, "Number of successes,Probability of success:");
		map.put(5, "Lambda:");
		map.put(6, "Lower,Higher:");
		map.put(7, "numberOfElements,exponent:");
		map.put(8, "alpha,beta:");
		map.put(9, "The median of this distribution,The scale of this distribution:");
		map.put(10, "Degrees of freedom:");
		map.put(11, "Constant value of the distribution:");
		map.put(12, "The mean of this distribution:");
		map.put(13, "The numerator degrees of freedom,The denominator degrees of freedom:");
		map.put(14, "The shape parameter,The scale parameter:");
		map.put(15, "The location parameter(mu),The scale parameter(beta):");
		map.put(16, "The location parameter(mu),The scale parameter(beta)");
		map.put(17, "The location parameter(mu),The scale parameter(c):");
		map.put(18, "The location parameter(mu),The scale parameter(s):");
		map.put(19, "The shape parameter(mu),The scale parameter(omega):");
		map.put(20, "Mean of this distribution,Standard deviation of this distribution:");
		map.put(21, "The scale parameter,The shape parameter:");
		map.put(22, "The degrees of freedom:");
		map.put(23, "Lower limit,Upper limit,Mode:");
		map.put(24, "Lower bound (inclusive),Upper bound (inclusive):");
		map.put(25, "The shape parameter,The scale parameter:");
	}
}
