package buildingsmart.ifc;

public abstract class IfcLightSourceGoniometric extends IfcLightSource {
    private IfcAxis2Placement3D Position;
    private IfcColourRgb ColourAppearance;
    private double ColourTemperature;
    private double LuminousFlux;
    private IfcLightEmissionSourceEnum LightEmissionSource;
    private IfcLightDistributionDataSourceSelect LightDistributionDataSource;
}
