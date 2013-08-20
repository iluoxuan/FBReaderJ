package org.geometerplus.android.fbreader.api;

import android.os.Parcel;
import android.os.Parcelable;

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
	
	@Override
	public void writeToParcel(Parcel parcel, int flags) {
		super.writeToParcel(parcel, flags);
		parcel.writeLong(Numerator);
		parcel.writeLong(Denominator);
	}
	
	public static final Parcelable.Creator<RationalNumber> CREATOR =
			new Parcelable.Creator<RationalNumber>() {
				public RationalNumber createFromParcel(Parcel parcel) {
					parcel.readLong();
					return new RationalNumber(parcel.readLong(), parcel.readLong());
				}

				public RationalNumber[] newArray(int size) {
					return new RationalNumber[size];
				}
			};
}
