// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Guid("2a55825b-2385-4b12-bba1-1672cb441a35")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcIntersectionCurve.class, name = "IfcIntersectionCurve"), @JsonSubTypes.Type(value = IfcSeamCurve.class, name = "IfcSeamCurve")})
public class IfcSurfaceCurve extends IfcCurve implements IfcCurveOnSurface
{
	@Description("The curve which is the three-dimensional representation of the surface curve.")
	@DataMember(Order = 0)
	@Required()
	@Guid("8094bc56-8107-47d2-9c32-8c2105aba5ae")
	@JacksonXmlProperty(isAttribute=false, localName = "curve3D")
	private IfcCurve curve3D;

	@Description("A list of one or two pcurves which define the surface or surfaces associated with the surface curve. Two elements in this list indicate that the curve has two surface associations which need not be two distinct surfaces. Being a pcurve, it also associates a basis curve in the parameter space of this surface as an alternative representation of the surface curve.")
	@DataMember(Order = 1)
	@Required()
	@Guid("4059b391-4f07-4f1b-8db3-f5344a52acb1")
	@MinLength(1)
	@MaxLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcPcurve")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "associatedGeometry")
	private List<IfcPcurve> associatedGeometry;

	@Description("The <em<MasterRepresentation</em> defines the curve used to determine the unique parametrisation of the <em>IfcSurfaceCurve</em>.<br>   The master_representation takes one of the values <em>Curve3D</em>, <em>PCurve_S1</em> or <em>PCurve_S2</em> to indicate a preference for the 3D curve, or the first or second pcurve, in the associated geometry list, respectively. Multiple representations provide the ability to communicate data in more than one form, even though the data is expected to be geometrically identical.<br><br>  NOTE&nbsp; The master representation attribute acknowledges the impracticality of ensuring that multiple forms are indeed identical and allows the indication of a preferred form. This would probably be determined by the creator of the data. All characteristics, such as parametrisation, domain, and results of evaluation, for an entity having multiple representations, are derived from the master representation. Any use of the other representations is a compromise for practical considerations.")
	@DataMember(Order = 2)
	@Required()
	@Guid("edc24e91-75ef-46cc-837b-e293ee7439bc")
	@JacksonXmlProperty(isAttribute=true, localName = "masterRepresentation")
	private IfcPreferredSurfaceCurveRepresentation masterRepresentation;


	public IfcSurfaceCurve()
	{
	}

	public IfcSurfaceCurve(IfcCurve curve3D, IfcPcurve[] associatedGeometry, IfcPreferredSurfaceCurveRepresentation masterRepresentation)
	{
		this.curve3D = curve3D;
		this.associatedGeometry = new ArrayList<>(Arrays.asList(associatedGeometry));
		this.masterRepresentation = masterRepresentation;
	}

	public IfcCurve getCurve3D() {
		return this.curve3D;
	}

	public void setCurve3D(IfcCurve curve3D) {
		this.curve3D = curve3D;
	}

	public List<IfcPcurve> getAssociatedGeometry() {
		return this.associatedGeometry;
	}

	public IfcPreferredSurfaceCurveRepresentation getMasterRepresentation() {
		return this.masterRepresentation;
	}

	public void setMasterRepresentation(IfcPreferredSurfaceCurveRepresentation masterRepresentation) {
		this.masterRepresentation = masterRepresentation;
	}

	@JsonIgnore
	public Set<IfcSurface> getBasisSurface() {
		//TODO
		//	BasisSurface:=IfcGetBasisSurface(SELF)
		return null;
	}


}

