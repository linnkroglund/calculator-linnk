package FinalProject;

import java.text.DecimalFormat;

/**
 * Klassen Advanced innehåller de avancerade matematiska beräkningarna. 
 * Den innehåller fyra variabler och två metoder
 * <p>
 * Klassen har fyra variabler (Operator, Number, Result och Answer). 
 * - Operator är operatorn som skall användas vid beräkningen.
 * - Number är den siffra som skall räknas med.
 * - Result är resultatet, fördefinierat till noll.
 * - Answer är svaret som skall levereras som en sträng, pga att svaret skall skrivas in i ett textfält.
 * Klassen har två metoder (doCalculation och getResult)
 * - doCalculation är själva matematiska beräkningen.
 * - getResult hämtar resultatet som har beräknats.
 * </p>
 */

public class Advanced implements CalculatorAdvancedOperationsInterface {

	private String Operator;
	private double Number;
	private double Result = 0;
	private String Answer;

	/**
	 * Konstruktorn för Advanced.
	 * <p>
	 * Konstruktorn tar emot två parametrar.
	 * Num - Siffran som skall användas för beräkning
	 * Op - Operatorn som skall bestämma beräkningsmetod.
	 * </p>
	 *
	 * @param  Num, Op
	 */
	
	public Advanced (double Num, String Op) {
		Number = Num;
		Operator = Op;
	}

	
	/**
	 * Metoden doCalculation utför den matematiska beräkningen.
	 * <p>
	 * doCalculation utför beräkning baserad på vilken operator som satts.
	 * Svaret sparas i variabeln Result
	 * </p>
	 *
	 * @param  array1, array2
	 * @return resultArray
	 */
	
	public void doCalculation() {
		
		switch (Operator) {
		case "Root":
			Result = Math.sqrt(Number);
			break;
		case "X2":
			Result = Number * Number;
			break;
		case "X3":
			Result = Number * Number * Number;
			break;
		case "Sin":
			Result = Math.sin(Number);
			break;
		case "Cos":
			Result = Math.cos(Number);
			break;
		case "Tan":
			Result = Math.tan(Number);
			break;
		}
	}
	
	/**
	 * Metoden getResult returner svaret på beräkningen.
	 * <p>
	 * getResult omvandlar svaret till en textsträng.
	 * Talet i strängen formateras även för antal decimaler.
	 * </p>
	 *
	 * @return Answer
	 */
	
	public String getResult () {
	    DecimalFormat df = new DecimalFormat("####0.#########");
		Answer = df.format(Result);
		return Answer;
	}
}
