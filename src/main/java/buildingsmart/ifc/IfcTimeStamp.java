package buildingsmart.ifc;

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
}
