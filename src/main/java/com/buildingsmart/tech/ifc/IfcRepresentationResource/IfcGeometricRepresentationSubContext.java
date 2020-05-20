// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDimensionCount;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcReal;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("2e4bdfcf-4532-4cf3-b45f-4372edb5bfb3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcGeometricRepresentationSubContext extends IfcGeometricRepresentationContext
{
	@Description("Parent context from which the sub context derives its world coordinate system, precision, space coordinate dimension and true north.")
	@DataMember(Order = 0)
	@Required()
	@Guid("7cb376a0-9c58-4443-96fa-afc3a59e7ba1")
	@JsonIgnore
	private IfcGeometricRepresentationContext parentContext;

	@Description("The target <font color=\"#ff0000\">plot</font> scale of the representation   to which this representation context applies.  <blockquote class=\"note\">NOTE&nbsp; Scale indicates the target plot scale for  the representation sub context, all annotation styles are given in plot  dimensions according to this target plot scale.<br>  If multiple instances of <em>IfcGeometricRepresentationSubContext</em>  are given having the same <em>TargetView</em> value, the target plot scale   applies up to the next smaller scale, or up to unlimited small scale.</blockquote>    <blockquote class=\"note\">NOTE&nbsp; Scale 1:100 (given as 0.01 within <em>TargetScale</em>)  is bigger then 1:200 (given as 0.005 within <em>TargetScale</em>).</blockquote>")
	@DataMember(Order = 1)
	@Guid("073455e4-1a2b-4354-9ff3-c1f32182a254")
	@JacksonXmlProperty(isAttribute=false, localName = "targetScale")
	private IfcPositiveRatioMeasure targetScale;

	@Description("Target view of the representation to which this representation context applies.")
	@DataMember(Order = 2)
	@Required()
	@Guid("13b3e0ec-6a77-4adb-a4cb-5fc77d4a7644")
	@JacksonXmlProperty(isAttribute=true, localName = "targetView")
	private IfcGeometricProjectionEnum targetView;

	@Description("User defined target view, this attribute value shall be given, if the TargetView attribute is set to USERDEFINED.")
	@DataMember(Order = 3)
	@Guid("f9374710-c549-4fc2-be03-03bb62121bb5")
	@JacksonXmlProperty(isAttribute=false, localName = "userDefinedTargetView")
	private IfcLabel userDefinedTargetView;


	public IfcGeometricRepresentationSubContext()
	{
	}

	public IfcGeometricRepresentationSubContext(IfcDimensionCount coordinateSpaceDimension, IfcAxis2Placement worldCoordinateSystem, IfcGeometricRepresentationContext parentContext, IfcGeometricProjectionEnum targetView)
	{
		super(coordinateSpaceDimension, worldCoordinateSystem);
		this.parentContext = parentContext;
		this.targetView = targetView;
	}

	public IfcGeometricRepresentationContext getParentContext() {
		return this.parentContext;
	}

	public void setParentContext(IfcGeometricRepresentationContext parentContext) {
		this.parentContext = parentContext;
	}

	public IfcPositiveRatioMeasure getTargetScale() {
		return this.targetScale;
	}

	public void setTargetScale(IfcPositiveRatioMeasure targetScale) {
		this.targetScale = targetScale;
	}

	public IfcGeometricProjectionEnum getTargetView() {
		return this.targetView;
	}

	public void setTargetView(IfcGeometricProjectionEnum targetView) {
		this.targetView = targetView;
	}

	public IfcLabel getUserDefinedTargetView() {
		return this.userDefinedTargetView;
	}

	public void setUserDefinedTargetView(IfcLabel userDefinedTargetView) {
		this.userDefinedTargetView = userDefinedTargetView;
	}

	@JsonIgnore
	public IfcAxis2Placement getWorldCoordinateSystem() {
		//WorldCoordinateSystem
		//:=ParentContext.WorldCoordinateSystem
		return parentContext.getWorldCoordinateSystem();
	}

	@JsonIgnore
	public IfcDimensionCount getCoordinateSpaceDimension() {
		//	CoordinateSpaceDimension
		//:=ParentContext.CoordinateSpaceDimension
		return parentContext.getCoordinateSpaceDimension();
	}

	@JsonIgnore
	public IfcDirection getTrueNorth() {
		//TODO
		//	TrueNorth:=NVL(ParentContext.TrueNorth, IfcConvertDirectionInto2D(SELF\IfcGeometricRepresentationContext.WorldCoordinateSystem.P[2]))
		return null;
	}

	@JsonIgnore
	public IfcReal getPrecision() {
		//	Precision:=NVL(ParentContext.Precision,1.E-5)
		if(parentContext!=null && parentContext.getPrecision() != null)
			return parentContext.getPrecision();
		else
			return new IfcReal(1.E-5);
	}
}

