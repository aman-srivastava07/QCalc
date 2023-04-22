package com.crio.qcalc;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		//SpringApplication.run(QcalcApplication.class, args);

		// System.out.println("Starting QCalc..");
		// StandardCalculator calc = new StandardCalculator();
		// calc.add(1,1);
		// System.out.println(calc.getResult());

		
		// StandardCalculator calc = new StandardCalculator();
		// calc.subtract(14,Double.MAX_VALUE);
		// calc.printResult();

		
		// LogicCalculator calc = new LogicCalculator();
		// calc.OR(8, 6);
		// calc.printResult();

		LogicCalculator calc = new LogicCalculator();
		calc.AND(8, 6);
		calc.printResult();


	}

}
