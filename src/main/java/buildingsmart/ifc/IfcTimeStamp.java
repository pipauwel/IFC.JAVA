package buildingsmart.ifc;

import java.util.Objects;

/**
 * An indication of date and time by measuring the number of seconds which
 * have elapsed since the beginning of the year 1970.
 */
public class IfcTimeStamp implements IfcDefinedType {
    private final long ifcTimeStamp;

    /**
     * @param ifcTimeStamp An indication of date and time by measuring the
     *                     number of seconds which have elapsed since the
     *                     beginning of the year 1970.
     */
    public IfcTimeStamp(long ifcTimeStamp) {
        this.ifcTimeStamp = ifcTimeStamp;
    }

    /**
     * @return The representation of the type in an IFC STEP file.
     */
    @Override
    public String serialize() {
        return Long.toString(ifcTimeStamp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IfcTimeStamp that = (IfcTimeStamp) o;
        return ifcTimeStamp == that.ifcTimeStamp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ifcTimeStamp);
    }
}
