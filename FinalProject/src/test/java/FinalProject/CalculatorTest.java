package FinalProject;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Test;

public class CalculatorTest {

	double randomNumber;
	double randomNumber2;
	double rightAnswer;
	String testResult;
	double calcAnswer;

	
		@Test
		public void addTest() {
			for (int i=0;i<50;i++) {
				randomNumber = -10 + (int)(Math.random() * 21);
				randomNumber2 = -10 + (int)(Math.random() * 21);
				Basic b = new Basic (randomNumber, '+', randomNumber2);
				b.doCalculation();
				testResult = b.getResult();
				rightAnswer = randomNumber + randomNumber2;
				calcAnswer = Double.parseDouble(testResult);
				// System.out.println("Testing Addition method with " + randomNumber + " and " + randomNumber2 + " which is " + rightAnswer + " - testResult: " + calcAnswer);
				assertEquals(calcAnswer,rightAnswer,0.001);
			}
		}
		
		@Test
		public void subTest() {
			for (int i=0;i<50;i++) {
				randomNumber = -10 + (int)(Math.random() * 21);
				randomNumber2 = -10 + (int)(Math.random() * 21);
				Basic b = new Basic (randomNumber, '-', randomNumber2);
				b.doCalculation();
				testResult = b.getResult();
				rightAnswer = randomNumber - randomNumber2;
				calcAnswer = Double.parseDouble(testResult);
				// System.out.println("Testing Subtraction method with " + randomNumber + " and " + randomNumber2 + " which is " + rightAnswer + " - testResult: " + calcAnswer);
				assertEquals(calcAnswer,rightAnswer,0.001);
			}
		}
		
		
		@Test
		public void mulTest() {
			for (int i=0;i<50;i++) {
				randomNumber = -10 + (int)(Math.random() * 21);
				randomNumber2 = -10 + (int)(Math.random() * 21);
				Basic b = new Basic (randomNumber, '*', randomNumber2);
				b.doCalculation();
				testResult = b.getResult();
				rightAnswer = randomNumber * randomNumber2;
				calcAnswer = Double.parseDouble(testResult);
				// System.out.println("Testing Multiplication method with " + randomNumber + " and " + randomNumber2 + " which is " + rightAnswer + " - testResult: " + calcAnswer);
				assertEquals(calcAnswer,rightAnswer,0.001);
			}
		}
		
		
		@Test
		public void divTest() {
			for (int i=0;i<50;i++) {
				randomNumber = -10 + (int)(Math.random() * 21);
				randomNumber2 = -10 + (int)(Math.random() * 21);
				Basic b = new Basic (randomNumber, '/', randomNumber2);
				b.doCalculation();
				testResult = b.getResult();
				if (randomNumber2 == 0) {
					rightAnswer = 0;
					calcAnswer = 0;
				} else {
					rightAnswer = randomNumber / randomNumber2;
					calcAnswer = Double.parseDouble(testResult);
				}
				// System.out.println("Testing Division method with " + randomNumber + " and " + randomNumber2 + " which is " + rightAnswer + " - testResult: " + calcAnswer);
				assertEquals(calcAnswer,rightAnswer,0.001);
			}
		}
		
		@Test
		public void x2Test() {
			for (int i=0;i<50;i++) {
				randomNumber = -10 + (int)(Math.random() * 21);
				Advanced a = new Advanced (randomNumber, "X2");
				a.doCalculation();
				testResult = a.getResult();
				rightAnswer = randomNumber * randomNumber;
				calcAnswer = Double.parseDouble(testResult);
				// System.out.println("Testing Square method with " + randomNumber + " which is " + rightAnswer + " - testResult: " + calcAnswer);
				assertEquals(calcAnswer,rightAnswer,0.001);
			}
		}
		
		@Test
		public void sqrTest() {
			for (int i=0;i<50;i++) {
				randomNumber = -10 + (int)(Math.random() * 21);
				Advanced a = new Advanced (randomNumber, "Root");
				a.doCalculation();
				testResult = a.getResult();
				rightAnswer = Math.sqrt(randomNumber);
			    DecimalFormat df = new DecimalFormat("####0.#########");
			    String Answer = df.format(rightAnswer);
				// System.out.println("Testing Square Root method with " + randomNumber + " which is " + Answer + " - testResult: " + calcAnswer);
				assertEquals(testResult,Answer);
			}
		}
		
		@Test
		public void x3Test() {
			for (int i=0;i<50;i++) {
				randomNumber = -10 + (int)(Math.random() * 21);
				Advanced a = new Advanced (randomNumber, "X3");
				a.doCalculation();
				testResult = a.getResult();
				rightAnswer = randomNumber * randomNumber * randomNumber;
				calcAnswer = Double.parseDouble(testResult);
				// System.out.println("Testing X3 method with " + randomNumber + " which is " + rightAnswer + " - testResult: " + calcAnswer);
				assertEquals(calcAnswer,rightAnswer,0.001);
			}
		}
		
		@Test
		public void cosTest() {
			for (int i=0;i<50;i++) {
				randomNumber = -10 + (int)(Math.random() * 21);
				Advanced a = new Advanced (randomNumber, "Cos");
				a.doCalculation();
				testResult = a.getResult();
				rightAnswer = Math.cos(randomNumber);
				calcAnswer = Double.parseDouble(testResult);
				// System.out.println("Testing Cos method with " + randomNumber + " which is " + rightAnswer + " - testResult: " + calcAnswer);
				assertEquals(calcAnswer,rightAnswer, 0.001);
			}
		}
		
		@Test
		public void sinTest() {
			for (int i=0;i<50;i++) {
				randomNumber = -10 + (int)(Math.random() * 21);
				Advanced a = new Advanced (randomNumber, "Sin");
				a.doCalculation();
				testResult = a.getResult();
				rightAnswer = Math.sin(randomNumber);
				calcAnswer = Double.parseDouble(testResult);
				// System.out.println("Testing Sin method with " + randomNumber + " which is " + rightAnswer + " - testResult: " + calcAnswer);
				assertEquals(calcAnswer,rightAnswer, 0.001);
			}
		}
		
		@Test
		public void tanTest() {
			for (int i=0;i<50;i++) {
				randomNumber = -10 + (int)(Math.random() * 21);
				Advanced a = new Advanced (randomNumber, "Tan");
				a.doCalculation();
				testResult = a.getResult();
				rightAnswer = Math.tan(randomNumber);
				calcAnswer = Double.parseDouble(testResult);
				// System.out.println("Testing Tan method with " + randomNumber + " which is " + rightAnswer + " - testResult: " + calcAnswer);
				assertEquals(calcAnswer,rightAnswer, 0.001);
			}
		}
}