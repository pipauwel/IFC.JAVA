package buildingsmart.ifc;

public class IfcMechanicalSteelMaterialProperties extends IfcMechanicalMaterialProperties {
    private double YieldStress;
    private double UltimateStress;
    private IfcRatioMeasure UltimateStrain;
    private double HardeningModule;
    private double ProportionalStress;
    private IfcRatioMeasure PlasticStrain;
    private IfcRelaxation[] Relaxations;
}
