package org.geometerplus.zlibrary.core.util;

import java.io.Serializable;

public class RationalNumber implements Serializable {
	public final long Numerator;
	public final long Denominator;
	
	public RationalNumber(long numerator, long denominator) {
		Numerator = numerator;
		Denominator = denominator;
	}
}
