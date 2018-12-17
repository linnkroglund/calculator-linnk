package FinalProject;

import java.text.DecimalFormat;

/**
 * Klassen Basic innehåller de grundläggande fyra matematiska beräkningarna. 
 * Den innehåller fem variabler och två metoder
 * <p>
 * Klassen har fem variabler (Operator, Number, Result och Answer). 
 * - Operator är operatorn som skall användas vid beräkningen.
 * - FirstNum och SecNum är de siffror som skall användas vid beräkningen.
 * - Result är resultatet, fördefinierat till noll.
 * - Answer är svaret som skall levereras som en sträng, pga att svaret skall skrivas in i ett textfält.
 * Klassen har två metoder (doCalculation och getResult)
 * - doCalculation är själva matematiska beräkningen.
 * - getResult hämtar resultatet som har beräknats.
 * </p>
 */

public class Basic implements CalculatorBasicOperationsInterface {
	
	private char Operator;
	private double FirstNum, SecNum;
	private double Result = 0;
	private String Answer;
	
	/**
	 * Konstruktorn för Basic.
	 * <p>
	 * Konstruktorn tar emot tre parametrar.
	 * FirstNum - Siffran som skall användas för beräkning
	 * SecNum - Andra siffran som skall användas för beräkning
	 * Op - Operatorn som skall bestämma beräkningsmetod.
	 * </p>
	 *
	 * @param FNum Första siffran att beräkna
	 * @param Op Operatorn som skall användas
	 * @param SNum Andra siffran som skall beräknas
	 */
	
	public Basic (double FNum, char Op, double SNum) {
		FirstNum = FNum;
		SecNum = SNum;
		Operator = Op;
	}
	
	/**
	 * Metoden doCalculation utför den matematiska beräkningen.
	 * <p>
	 * doCalculation utför beräkning baserad på vilken operator som satts.
	 * Svaret sparas i variabeln Result
	 * </p>
	 */
	
	public void doCalculation() {
		
		switch (Operator) {
		case '+':
			Result = FirstNum + SecNum;
			break;
		case '-':
			Result = FirstNum - SecNum;
			break;
		case '*':
			Result = FirstNum * SecNum;
			break;
		case '/':
			Result = FirstNum / SecNum;
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
