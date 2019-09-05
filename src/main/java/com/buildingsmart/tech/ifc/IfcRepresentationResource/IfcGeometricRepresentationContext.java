// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0eca3f63-ee99-4b79-bd1a-4602d00d24d9")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcGeometricRepresentationContext extends IfcRepresentationContext implements IfcCoordinateReferenceSystemSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "CoordinateSpaceDimension")
	@Description("The integer dimension count of the coordinate space modeled in a geometric representation context.  <br>")
	@Required()
	@Guid("9b485f73-0c6c-43ff-81b5-d7c39ee5ee67")
	private int coordinateSpaceDimension;

	@JacksonXmlProperty(isAttribute=true, localName = "Precision")
	@Description("Value of the model precision for geometric models. It is a double value (REAL), typically in 1E-5 to 1E-8 range, that indicates the tolerance under which two given points are still assumed to be identical. The value can be used e.g. to sets the maximum distance from an edge curve to the underlying face surface in brep models.")
	@Guid("382390c9-360a-42c7-a7a3-700fefef9737")
	private double precision;

	@JacksonXmlProperty(isAttribute=false, localName = "WorldCoordinateSystem")
	@Description("Establishment of the engineering coordinate system (often referred to as the world coordinate system in CAD) for all representation contexts used by the project.     <blockquote class=\"note\">NOTE&nbsp; It can be used to provide better numeric stability if the placement of the building(s) is far away from the origin. In most cases however it would be set to origin: (0.,0.,0.) and directions x(1.,0.,0.), y(0.,1.,0.), z(0.,0.,1.).</blockquote>    If an geographic placement is provided using <em>IfcMapConversion</em> then the <em>WorldCoordinateSystem</em> atttibute is used to define the offset between the zero point of the local engineering coordinate system and the geographic reference point to which the <em>IfcMapConversion</em> offset relates. In preferred practise both points (also called \"project base point\" and \"survey point\") should be coincidental. However it is possible to offset the geographic reference point from the local zero point.")
	@Required()
	@Guid("e0225b8f-ba56-4539-bc5f-7bfffbe8edc1")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement worldCoordinateSystem;

	@JacksonXmlProperty(isAttribute=false, localName = "TrueNorth")
	@Description("Direction of the true north, or geographic northing direction, relative to the underlying project coordinate system. It is given by a 2 dimensional direction within the xy-plane of the project coordinate system. If not present, it defaults to 0. 1., meaning that the positive Y axis of the project coordinate system equals the geographic northing direction.    <blockquote class=\"note\">NOTE&nbsp; If a geographic placement is provided using <em>IfcMapConversion</em> then the true north is for information only. In case of inconsistency, the value provided with <em>IfcMapConversion</em> shall take precedence.</blockquote>")
	@Guid("b64811d8-8918-4d38-b58f-7a8bc6f03c0f")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection trueNorth;

	@JacksonXmlProperty(isAttribute=false, localName = "HasSubContexts")
	@Description("The set of <em>IfcGeometricRepresentationSubContexts</em> that refer to this <em>IfcGeometricRepresentationContext</em>.")
	@Guid("2af7d963-9ff0-43fe-a2b2-e2766bb83443")
	private Set<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcGeometricRepresentationSubContext> hasSubContexts = new HashSet<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcGeometricRepresentationSubContext>();

	@JacksonXmlProperty(isAttribute=false, localName = "HasCoordinateOperation")
	@Description("Indicates conversion between coordinate systems. In particular it refers to an <em>IfcCoordinateOperation</em> between a Geographic map coordinate reference system, and the engineering coordinate system of this construction project. If there is more then one <em>IfcGeometricRepresentationContext</em> provided to the <em>IfcProject</em> then all contexts shall have an identical instance of <em>IfcCoordinateOperation</em> as <em>HasCoordinateOperation</em> refering to the same instance of <em>IfcCoordinateReferenceSystem</em>.")
	@MaxLength(1)
	@Guid("d5175543-19ac-432c-ae3b-5b13d4d04785")
	private Set<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcCoordinateOperation> hasCoordinateOperation = new HashSet<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcCoordinateOperation>();


	public IfcGeometricRepresentationContext()
	{
	}

	public IfcGeometricRepresentationContext(int coordinateSpaceDimension, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement worldCoordinateSystem)
	{
		this.coordinateSpaceDimension = coordinateSpaceDimension;
		this.worldCoordinateSystem = worldCoordinateSystem;
	}

	public int getCoordinateSpaceDimension() {
		return this.coordinateSpaceDimension;
	}

	public void setCoordinateSpaceDimension(int coordinateSpaceDimension) {
		this.coordinateSpaceDimension = coordinateSpaceDimension;
	}

	public double getPrecision() {
		return this.precision;
	}

	public void setPrecision(double precision) {
		this.precision = precision;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement getWorldCoordinateSystem() {
		return this.worldCoordinateSystem;
	}

	public void setWorldCoordinateSystem(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement worldCoordinateSystem) {
		this.worldCoordinateSystem = worldCoordinateSystem;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection getTrueNorth() {
		return this.trueNorth;
	}

	public void setTrueNorth(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection trueNorth) {
		this.trueNorth = trueNorth;
	}

	public Set<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcGeometricRepresentationSubContext> getHasSubContexts() {
		return this.hasSubContexts;
	}

	public Set<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcCoordinateOperation> getHasCoordinateOperation() {
		return this.hasCoordinateOperation;
	}


}

