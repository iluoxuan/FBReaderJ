package org.geometerplus.android.fbreader.api;

public class RationalNumber extends ApiObject {
	public final long Numerator;
	public final long Denominator;
	
	public RationalNumber(long numerator, long denominator) {
		Numerator = numerator;
		Denominator = denominator;
	}

	@Override
	protected int type() {
		return Type.RATIONAL_NUMBER;
	}
}
