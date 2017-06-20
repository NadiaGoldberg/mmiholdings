package co.za.mmiholdings.GoldbergConversion.converter;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import co.za.mmiholdings.GoldbergConversion.model.ConversionData;
import co.za.mmiholdings.GoldbergConversion.model.UNITS;

/**
 * @author Nadia
 *
 */
@Component
public class Converter {
	BigDecimal multiplier;

	/**
	 * This method will set the multiplier value for the conversion. This switch
	 * might be a bit over the top for just 6 conversions but thinking about
	 * future enhancements. :-)
	 * 
	 * @param conversionData
	 * @return
	 */
	public Converter setConversionType(ConversionData conversionData) {
		UNITS source = conversionData.getSource();
		UNITS target = conversionData.getTarget();

		switch (source) {
		case MILLIMETER:
			switch (target) {
			case INCHES:
				multiplier = new BigDecimal(0.039370);
				break;
			default:
				break;
			}
			break;
		case INCHES:
			switch (target) {
			case MILLIMETER:
				multiplier = new BigDecimal(25.40005);
				break;

			default:
				break;
			}
			break;
		case KILOMETER:
			switch (target) {
			case MILES:
				multiplier = new BigDecimal(0.62137);
				break;
			default:
				break;
			}
			break;
		case MILES:
			switch (target) {
			case KILOMETER:
				multiplier = new BigDecimal(1.609347);
				break;
			default:
				break;
			}
			break;
		case KILOGRAM:
			switch (target) {
			case POUNDS:
				multiplier = new BigDecimal(2.2046);
				break;
			default:
				break;
			}
		case POUNDS:
			switch (target) {
			case KILOGRAM:
				multiplier = new BigDecimal(0.45359);
				break;
			default:
				break;
			}
		default:			
			break;
		}

		return this;
	}

	/**
	 * Converts the input value.
	 *  
	 * @param inputValue
	 * 	the value to be converted
	 * @return
	 * 	the converted value
	 */
	public BigDecimal convert(BigDecimal inputValue) {
		BigDecimal outputValue = null;
	
		if (inputValue != null && multiplier != null) {
			 outputValue = inputValue.multiply(multiplier);
		}
		return outputValue;
	}

}
