package buildingsmart.ifc;

public class IfcTimeSeries {
    private String Name;
    private String Description;
    private IfcDateTimeSelect StartTime;
    private IfcDateTimeSelect EndTime;
    private IfcTimeSeriesDataTypeEnum TimeSeriesDataType;
    private IfcDataOriginEnum DataOrigin;
    private String UserDefinedDataOrigin;
    private IfcUnit Unit;
    private IfcTimeSeriesReferenceRelationship[] DocumentedBy;
}
