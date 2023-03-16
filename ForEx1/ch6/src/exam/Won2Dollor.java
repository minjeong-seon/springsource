package exam;

public class Won2Dollor extends Converter {

	@Override
	public double convert(double src) {
		return src/1200;
	}

	@Override
	public String getSrcString() {
		return "원";
	}

	@Override
	public String getdesString() {
		return "달러";
	}

	}