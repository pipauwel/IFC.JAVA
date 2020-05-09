package buildingsmart.ifc;

public abstract class IfcLightSource extends IfcGeometricRepresentationItem {
    private String Name;
    private IfcColourRgb LightColour;
    private IfcRatioMeasure AmbientIntensity;
    private IfcRatioMeasure Intensity;
}
