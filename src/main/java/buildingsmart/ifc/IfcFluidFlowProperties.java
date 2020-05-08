package buildingsmart.ifc;

public class IfcFluidFlowProperties extends IfcPropertySetDefinition {
    private IfcPropertySourceEnum PropertySource;
    private IfcTimeSeries FlowConditionTimeSeries;
    private IfcTimeSeries VelocityTimeSeries;
    private IfcTimeSeries FlowrateTimeSeries;
    private IfcMaterial Fluid;
    private IfcTimeSeries PressureTimeSeries;
    private String UserDefinedPropertySource;
    private double TemperatureSingleValue;
    private double WetBulbTemperatureSingleValue;
    private IfcTimeSeries WetBulbTemperatureTimeSeries;
    private IfcTimeSeries TemperatureTimeSeries;
    private IfcDerivedMeasureValue FlowrateSingleValue;
    private IfcRatioMeasure FlowConditionSingleValue;
    private double VelocitySingleValue;
    private double PressureSingleValue;
}
