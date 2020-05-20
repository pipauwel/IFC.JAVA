// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLogical;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcPresentationStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("d58d8ae7-e309-454d-b3f1-2b58ce4d583d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPresentationLayerWithStyle extends IfcPresentationLayerAssignment
{
	@Description("A logical setting, TRUE indicates that the layer is set to 'On', FALSE that the layer is set to 'Off', UNKNOWN that such information is not available.")
	@DataMember(Order = 0)
	@Required()
	@Guid("c35508db-bb0f-4b65-8ebe-1263d8d30880")
	@JacksonXmlProperty(isAttribute=false, localName = "layerOn")
	private IfcLogical layerOn;

	@Description("A logical setting, TRUE indicates that the layer is set to 'Frozen', FALSE that the layer is set to 'Not frozen', UNKNOWN that such information is not available.")
	@DataMember(Order = 1)
	@Required()
	@Guid("cd1d47f4-0d9b-443b-99a8-e11337ce2807")
	@JacksonXmlProperty(isAttribute=false, localName = "layerFrozen")
	private IfcLogical layerFrozen;

	@Description("A logical setting, TRUE indicates that the layer is set to 'Blocked', FALSE that the layer is set to 'Not blocked', UNKNOWN that such information is not available.")
	@DataMember(Order = 2)
	@Required()
	@Guid("30057b28-65bc-49de-8333-f563a5910322")
	@JacksonXmlProperty(isAttribute=false, localName = "layerBlocked")
	private IfcLogical layerBlocked;

	@Description("Assignment of presentation styles to the layer to provide a default style for representation items.  <blockquote class=\"note\">NOTE&nbsp; In most cases the assignment of styles to a layer is restricted to an <em>IfcCurveStyle</em> representing the layer curve colour, layer curve thickness, and layer curve type.    </blockquote>    <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; The data type has been changed from <em>IfcPresentationStyleSelect</em> (now deprecated) to <em>IfcPresentationStyle</em>.  </blockquote>")
	@DataMember(Order = 3)
	@Required()
	@Guid("e8b3dbe7-1765-4f94-95ef-729981109562")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcPresentationStyle")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "layerStyles")
	private Set<IfcPresentationStyle> layerStyles;


	public IfcPresentationLayerWithStyle()
	{
	}

	public IfcPresentationLayerWithStyle(IfcLabel name, IfcLayeredItem[] assignedItems, IfcLogical layerOn,
										 IfcLogical layerFrozen, IfcLogical layerBlocked, IfcPresentationStyle[] layerStyles)
	{
		super(name, assignedItems);
		this.layerOn = layerOn;
		this.layerFrozen = layerFrozen;
		this.layerBlocked = layerBlocked;
		this.layerStyles = new HashSet<>(Arrays.asList(layerStyles));
	}

	public IfcLogical getLayerOn() {
		return this.layerOn;
	}

	public void setLayerOn(IfcLogical layerOn) {
		this.layerOn = layerOn;
	}

	public IfcLogical getLayerFrozen() {
		return this.layerFrozen;
	}

	public void setLayerFrozen(IfcLogical layerFrozen) {
		this.layerFrozen = layerFrozen;
	}

	public IfcLogical getLayerBlocked() {
		return this.layerBlocked;
	}

	public void setLayerBlocked(IfcLogical layerBlocked) {
		this.layerBlocked = layerBlocked;
	}

	public Set<IfcPresentationStyle> getLayerStyles() {
		return this.layerStyles;
	}


}

