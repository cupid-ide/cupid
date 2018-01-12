package org.earthsystemmodeling.cupid.trace.callgraph;

import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;

import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.common.core.NonNullUtils;

/**
 * Time format, it will take a time in nano seconds and convert it to a string
 * with 3 decimals max.
 *
 * examples:
 * <ul>
 * <li>100 -> "100 ns"</li>
 * <li>1001 -> "1.001 us" (mu)</li>
 * <li>314159264 -> "312.159 ms"</li>
 * <li>10000002000000 -> "1000.002 s"</li>
 * </ul>
 */
public class TimeFormatter extends NumberFormat {
	
	private static final long serialVersionUID = 3536536364492941613L;
	
	public static final String SECONDS = "s"; //$NON-NLS-1$
	public static final String NANOSECONDS = "ns"; //$NON-NLS-1$
	public static final String MILLISECONDS = "ms"; //$NON-NLS-1$
	public static final String MICROSECONDS = "\u00B5" + SECONDS; //$NON-NLS-1$
	
	public static final String DYNAMIC = "dynamic";

	private static final int NANOS_PER_SEC = 1000000000;
	private static final int NANOS_PER_MILLI = 1000000;
	private static final int NANOS_PER_MICRO = 1000;

	private final DecimalFormat fDecimalFormat;
	
	private String fFixedUnit = DYNAMIC;
	private boolean fIncludeUnits = true;

	public void setFixedUnit(String fixedUnit) {
		this.fFixedUnit = fixedUnit;
	}
	
	public void setIncludeUnits(boolean includeUnits) {
		this.fIncludeUnits = includeUnits;
	}
	
	public TimeFormatter() {
		this (new DecimalFormat("#.000"));
	}
	
	public TimeFormatter(DecimalFormat decimalFormat) {
		fDecimalFormat = decimalFormat;
	}
	
	//@Override
	//public Object parseObject(@Nullable String source, @Nullable ParsePosition pos) {
	//	return source == null ? "" : source; //$NON-NLS-1$
	//}

	/*
	@Override
	public StringBuffer format(@Nullable Object obj, @Nullable StringBuffer toAppendTo, @Nullable FieldPosition pos) {
		final @Nullable StringBuffer appender = toAppendTo;
		if ((obj != null) && (obj instanceof Double || obj instanceof Long)) {
			double formattedTime = obj instanceof Long ? ((Long) obj).doubleValue() : ((Double) obj).doubleValue();
			if (Double.isNaN(formattedTime)) {
				return appender == null ? new StringBuffer() : NonNullUtils.checkNotNull(appender.append("---")); //$NON-NLS-1$
			}
			
			String unit;
			if (fFixedUnit == null || fFixedUnit.equals(DYNAMIC)) {
				unit = NANOSECONDS;
				if (formattedTime >= NANOS_PER_SEC) {
					unit = SECONDS;
				} else if (formattedTime >= NANOS_PER_MILLI) {
					unit = MILLISECONDS;
				} else if (formattedTime >= NANOS_PER_MICRO) {
					unit = MICROSECONDS;
				}
			}
			else {
				unit = fFixedUnit;
			}
			
			if (unit == SECONDS) {
				formattedTime /= NANOS_PER_SEC;
			}
			else if (unit == MILLISECONDS) {
				formattedTime /= NANOS_PER_MILLI;
			}
			else if (unit == MICROSECONDS) {
				formattedTime /= NANOS_PER_MICRO;
			}
			
			if (formattedTime == 0) {
				return appender == null ? new StringBuffer() : NonNullUtils.checkNotNull(appender.append(0));
			}
			String timeString = unit.equals(NANOSECONDS) ? Long.toString((long) formattedTime) : fDecimalFormat.format(formattedTime);
			return appender == null ? new StringBuffer() : NonNullUtils.checkNotNull(appender.append(timeString).append(' ').append(fIncludeUnits ? unit : ""));
		}
		return new StringBuffer();
	}
	*/
	
	@Override
	public StringBuffer format(double number, StringBuffer toAppendTo, FieldPosition pos) {
		
		final @Nullable StringBuffer appender = toAppendTo;
		if (Double.isNaN(number)) {
			return appender == null ? new StringBuffer() : NonNullUtils.checkNotNull(appender.append("---")); //$NON-NLS-1$
		}
		
		String unit;
		if (fFixedUnit == null || fFixedUnit.equals(DYNAMIC)) {
			unit = NANOSECONDS;
			if (number >= NANOS_PER_SEC) {
				unit = SECONDS;
			} else if (number >= NANOS_PER_MILLI) {
				unit = MILLISECONDS;
			} else if (number >= NANOS_PER_MICRO) {
				unit = MICROSECONDS;
			}
		}
		else {
			unit = fFixedUnit;
		}
		
		if (unit == SECONDS) {
			number /= NANOS_PER_SEC;
		}
		else if (unit == MILLISECONDS) {
			number /= NANOS_PER_MILLI;
		}
		else if (unit == MICROSECONDS) {
			number /= NANOS_PER_MICRO;
		}
		
		if (number == 0) {
			return appender == null ? new StringBuffer() : NonNullUtils.checkNotNull(appender.append(0));
		}
		String timeString = unit.equals(NANOSECONDS) ? Long.toString((long) number) : fDecimalFormat.format(number);
		return appender == null ? new StringBuffer() : NonNullUtils.checkNotNull(appender.append(timeString).append(' ').append(fIncludeUnits ? unit : ""));
				
	}

	@Override
	public StringBuffer format(long number, StringBuffer toAppendTo, FieldPosition pos) {
		return format((double) number, toAppendTo, pos);
	}

	@Override
	public Number parse(String source, ParsePosition parsePosition) {		
		return null;
	}
}

