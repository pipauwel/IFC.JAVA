package buildingsmart.ifc;

public class IfcElectricalBaseProperties extends IfcEnergyProperties {
    private IfcElectricCurrentEnum ElectricCurrentType;
    private double InputVoltage;
    private double InputFrequency;
    private double FullLoadCurrent;
    private double MinimumCircuitCurrent;
    private double MaximumPowerInput;
    private double RatedPowerInput;
    private int InputPhase;
}
