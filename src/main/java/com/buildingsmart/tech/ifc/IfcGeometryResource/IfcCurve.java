// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("e39241f5-7436-4f04-91f5-7a80393f242d")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcBoundedCurve.class, name = "IfcBoundedCurve"), @JsonSubTypes.Type(value = IfcConic.class, name = "IfcConic"), @JsonSubTypes.Type(value = IfcLine.class, name = "IfcLine"), @JsonSubTypes.Type(value = IfcOffsetCurve2D.class, name = "IfcOffsetCurve2D"), @JsonSubTypes.Type(value = IfcOffsetCurve3D.class, name = "IfcOffsetCurve3D"), @JsonSubTypes.Type(value = IfcPcurve.class, name = "IfcPcurve"), @JsonSubTypes.Type(value = IfcSurfaceCurve.class, name = "IfcSurfaceCurve")})
public abstract class IfcCurve extends IfcGeometricRepresentationItem implements com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcGeometricSetSelect
{

	public IfcCurve()
	{
	}

	@JsonIgnore
	public int getDim() {
		return this.getCurveDim();
	}

	@JsonIgnore
	private int getCurveDim(){
		if(this instanceof IfcLine)
			return ((IfcLine) this).getPnt().getDim();
		else if(this instanceof IfcConic)
			return ((IfcPlacement)((IfcConic) this).getPosition()).getDim();
		else if(this instanceof IfcPolyline)
			return ((IfcPolyline) this).getPoints().get(1).getDim();
		/*else if(this instanceof IfcTrimmedCurve)
			return ((IfcTrimmedCurve) this).getPoints().get(1).getDim();*/
		else
			return 0;

		//TODO
	}
	/*IF ('IFCGEOMETRYRESOURCE.IfcLine' IN TYPEOF(Curve))
	THEN RETURN(Curve\IfcLine.Pnt.Dim);
	END_IF;
	IF ('IFCGEOMETRYRESOURCE.IfcConic' IN TYPEOF(Curve))
	THEN RETURN(Curve\IfcConic.Position.Dim);
	END_IF;
	IF ('IFCGEOMETRYRESOURCE.IfcPolyline' IN TYPEOF(Curve))
	THEN RETURN(Curve\IfcPolyline.Points[1].Dim);
	END_IF;
	IF ('IFCGEOMETRYRESOURCE.IfcTrimmedCurve' IN TYPEOF(Curve))
	THEN RETURN(IfcCurveDim(Curve\IfcTrimmedCurve.BasisCurve));
	END_IF;
	IF ('IFCGEOMETRYRESOURCE.IfcCompositeCurve' IN TYPEOF(Curve))
	THEN RETURN(Curve\IfcCompositeCurve.Segments[1].Dim);
	END_IF;
	IF ('IFCGEOMETRYRESOURCE.IfcBSplineCurve' IN TYPEOF(Curve))
	THEN RETURN(Curve\IfcBSplineCurve.ControlPointsList[1].Dim);
	END_IF;
	IF ('IFCGEOMETRYRESOURCE.IfcOffsetCurve2D' IN TYPEOF(Curve))
	THEN RETURN(2);
	END_IF;
	IF ('IFCGEOMETRYRESOURCE.IfcOffsetCurve3D' IN TYPEOF(Curve))
	THEN RETURN(3);
	END_IF;
	IF ('IFCGEOMETRYRESOURCE.IfcPcurve' IN TYPEOF(Curve))
	THEN RETURN(3);
	END_IF;
	IF ('IFC4.IfcIndexedPolyCurve' IN TYPEOF(Curve))
	THEN RETURN(Curve\IfcIndexedPolyCurve.Points.Dim);
	END_IF;
	RETURN (?);
*/
}

