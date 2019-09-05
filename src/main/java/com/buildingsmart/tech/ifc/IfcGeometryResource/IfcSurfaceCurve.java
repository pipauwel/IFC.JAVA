// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("2a55825b-2385-4b12-bba1-1672cb441a35")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSurfaceCurve extends IfcCurve implements IfcCurveOnSurface
{
	@Description("The curve which is the three-dimensional representation of the surface curve.")
	@Required()
	@Guid("8094bc56-8107-47d2-9c32-8c2105aba5ae")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve curve3D;

	@Description("A list of one or two pcurves which define the surface or surfaces associated with the surface curve. Two elements in this list indicate that the curve has two surface associations which need not be two distinct surfaces. Being a pcurve, it also associates a basis curve in the parameter space of this surface as an alternative representation of the surface curve.")
	@Required()
	@MinLength(1)
	@MaxLength(2)
	@Guid("4059b391-4f07-4f1b-8db3-f5344a52acb1")
	private List<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPcurve> associatedGeometry = new ArrayList<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPcurve>();

	@JacksonXmlProperty(isAttribute=true, localName = "MasterRepresentation")
	@Description("The <em<MasterRepresentation</em> defines the curve used to determine the unique parametrisation of the <em>IfcSurfaceCurve</em>.<br>   The master_representation takes one of the values <em>Curve3D</em>, <em>PCurve_S1</em> or <em>PCurve_S2</em> to indicate a preference for the 3D curve, or the first or second pcurve, in the associated geometry list, respectively. Multiple representations provide the ability to communicate data in more than one form, even though the data is expected to be geometrically identical.<br><br>  NOTE&nbsp; The master representation attribute acknowledges the impracticality of ensuring that multiple forms are indeed identical and allows the indication of a preferred form. This would probably be determined by the creator of the data. All characteristics, such as parametrisation, domain, and results of evaluation, for an entity having multiple representations, are derived from the master representation. Any use of the other representations is a compromise for practical considerations.")
	@Required()
	@Guid("edc24e91-75ef-46cc-837b-e293ee7439bc")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPreferredSurfaceCurveRepresentation masterRepresentation;


	public IfcSurfaceCurve()
	{
	}

	public IfcSurfaceCurve(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve curve3D, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPcurve[] associatedGeometry, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPreferredSurfaceCurveRepresentation masterRepresentation)
	{
		this.curve3D = curve3D;
		this.associatedGeometry = new ArrayList<>(Arrays.asList(associatedGeometry));
		this.masterRepresentation = masterRepresentation;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve getCurve3D() {
		return this.curve3D;
	}

	public void setCurve3D(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve curve3D) {
		this.curve3D = curve3D;
	}

	public List<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPcurve> getAssociatedGeometry() {
		return this.associatedGeometry;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPreferredSurfaceCurveRepresentation getMasterRepresentation() {
		return this.masterRepresentation;
	}

	public void setMasterRepresentation(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPreferredSurfaceCurveRepresentation masterRepresentation) {
		this.masterRepresentation = masterRepresentation;
	}

	public Set<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface> getBasisSurface() {
		return null;
	}


}

