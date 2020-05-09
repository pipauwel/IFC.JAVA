package buildingsmart.ifc;

public abstract class IfcFillAreaStyleTiles
        extends IfcGeometricRepresentationItem {
    private IfcOneDirectionRepeatFactor TilingPattern;
    private IfcFillAreaStyleTileShapeSelect[] Tiles;
    private IfcRatioMeasure TilingScale;
}
