package co.za.mmiholdings.GoldbergConversion.model;

public class ConversionData {

	private UNITS source;

	private UNITS target;

	public ConversionData(String input) {
		switch (input) {
		case "1":
			setSource(UNITS.MILLIMETER);
			setTarget(UNITS.INCHES);
			break;
		case "2":
			setSource(UNITS.INCHES);
			setTarget(UNITS.MILLIMETER);
			break;
		case "3":
			setSource(UNITS.KILOMETER);
			setTarget(UNITS.MILES);
			break;
		case "4":
			setSource(UNITS.MILES);
			setTarget(UNITS.KILOMETER);
			break;
		case "5":
			setSource(UNITS.KILOGRAM);
			setTarget(UNITS.POUNDS);
			break;
		case "6":
			setSource(UNITS.POUNDS);
			setTarget(UNITS.KILOGRAM);
			break;
		default:
			setSource(UNITS.NO_UNITS);
			setTarget(UNITS.NO_UNITS);
		}
	}

	public UNITS getSource() {
		return source;
	}

	public void setSource(UNITS source) {
		this.source = source;
	}

	public UNITS getTarget() {
		return target;
	}

	public void setTarget(UNITS target) {
		this.target = target;
	}

}
