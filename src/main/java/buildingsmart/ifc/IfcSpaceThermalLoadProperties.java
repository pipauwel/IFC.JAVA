package buildingsmart.ifc;

public class IfcSpaceThermalLoadProperties extends IfcPropertySetDefinition {
    private IfcRatioMeasure ApplicableValueRatio;
    private IfcThermalLoadSourceEnum ThermalLoadSource;
    private IfcPropertySourceEnum PropertySource;
    private String SourceDescription;
    private double MaximumValue;
    private double MinimumValue;
    private IfcTimeSeries ThermalLoadTimeSeriesValues;
    private String UserDefinedThermalLoadSource;
    private String UserDefinedPropertySource;
    private IfcThermalLoadTypeEnum ThermalLoadType;
}
