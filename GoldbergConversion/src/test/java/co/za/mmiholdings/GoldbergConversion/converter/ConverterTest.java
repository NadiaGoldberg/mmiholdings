package co.za.mmiholdings.GoldbergConversion.converter;

import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Test;

import co.za.mmiholdings.GoldbergConversion.model.ConversionData;

public class ConverterTest {

	@Test
	public void testMMToInchesConverter() {
		ConversionData conversionData = new ConversionData("1");
		
		Converter converter = new Converter();
		BigDecimal convertedValue = converter.setConversionType(conversionData).convert(new BigDecimal(50)).setScale(4, RoundingMode.HALF_UP);
		
		BigDecimal outputTestValue = new BigDecimal(1.9685).setScale(4, RoundingMode.HALF_UP);
		
		if (!outputTestValue.equals(convertedValue)) {
			fail("MM to inches conversion failed.");
		}	
		
	}
	
	@Test
	public void testInchesToMMConverter() {
		ConversionData conversionData = new ConversionData("2");
		
		Converter converter = new Converter();
		BigDecimal convertedValue = converter.setConversionType(conversionData).convert(new BigDecimal(50)).setScale(4, RoundingMode.HALF_UP);
		
		BigDecimal outputTestValue = new BigDecimal(1270.0025).setScale(4, RoundingMode.HALF_UP);
		
		if (!outputTestValue.equals(convertedValue)) {
			fail("Inches to MM conversion failed.");
		}	
		
	}
	
	@Test
	public void testKMToMilesConverter() {
		ConversionData conversionData = new ConversionData("3");
		
		Converter converter = new Converter();
		BigDecimal convertedValue = converter.setConversionType(conversionData).convert(new BigDecimal(50)).setScale(4, RoundingMode.HALF_UP);
		
		BigDecimal outputTestValue = new BigDecimal(31.0685).setScale(4, RoundingMode.HALF_UP);
		
		if (!outputTestValue.equals(convertedValue)) {
			fail("KM to Miles conversion failed.");
		}	
		
	}
	
	@Test
	public void testMilesToKmConverter() {
		ConversionData conversionData = new ConversionData("4");
		
		Converter converter = new Converter();
		BigDecimal convertedValue = converter.setConversionType(conversionData).convert(new BigDecimal(50)).setScale(4, RoundingMode.HALF_UP);
		
		BigDecimal outputTestValue = new BigDecimal(80.4674).setScale(4, RoundingMode.HALF_UP);
		
		if (!outputTestValue.equals(convertedValue)) {
			fail("Miles to KM failed.");
		}	
		
	}
	
	@Test
	public void testKGToPoundsConverter() {
		ConversionData conversionData = new ConversionData("5");
		
		Converter converter = new Converter();
		BigDecimal convertedValue = converter.setConversionType(conversionData).convert(new BigDecimal(50)).setScale(4, RoundingMode.HALF_UP);
		
		BigDecimal outputTestValue = new BigDecimal(110.2300).setScale(4, RoundingMode.HALF_UP);
		
		if (!outputTestValue.equals(convertedValue)) {
			fail("KG to Pounds conversion failed.");
		}	
		
	}
	
	@Test
	public void testPoundsToKGConverter() {
		ConversionData conversionData = new ConversionData("6");
		
		Converter converter = new Converter();
		BigDecimal convertedValue = converter.setConversionType(conversionData).convert(new BigDecimal(50)).setScale(4, RoundingMode.HALF_UP);
		
		BigDecimal outputTestValue = new BigDecimal(22.6795).setScale(4, RoundingMode.HALF_UP);
		
		if (!outputTestValue.equals(convertedValue)) {
			fail("Pounds to KG conversion failed.");
		}	
		
	}
	
	@Test
	public void testConverterInvalidConversionType() {
		ConversionData conversionData = new ConversionData("9");
		
		Converter converter = new Converter();
		BigDecimal convertedValue = converter.setConversionType(conversionData).convert(new BigDecimal(50));
		
		
		
		if (convertedValue != null) {
			fail("INVALID conversion error.");
		}	
		
	}

}
