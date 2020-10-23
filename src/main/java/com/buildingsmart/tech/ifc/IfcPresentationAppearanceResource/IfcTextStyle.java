// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("a79b1274-8b81-4827-baa7-03f278dc7a39")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTextStyle extends IfcPresentationStyle implements IfcPresentationStyleSelect
{
	@Description("A character style to be used for presented text.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Superfluous select type IfcCharacterStyleSelect has been removed.  </blockquote>")
	@DataMember(Order = 0)
	@Guid("f5bd01b9-4639-4066-8a62-d1d8a355a2f5")
	@JacksonXmlProperty(isAttribute=false, localName = "textCharacterAppearance")
	private IfcTextStyleForDefinedFont textCharacterAppearance;

	@Description("The style applied to the text block for its visual appearance.  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The attribute <em>TextBlockStyle</em> has been changed from SET[1:?] to a non-aggregated optional and renamed into <em>TextStyles</em>.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The IfcTextStyleWithBoxCharacteristics and the now superfluous select type IfcTextStyleSelect have been removed.  </blockquote>")
	@DataMember(Order = 1)
	@Guid("edc9e2db-5005-4bcf-ac88-0a7ee0830fe0")
	@JacksonXmlProperty(isAttribute=false, localName = "textStyle")
	private IfcTextStyleTextModel textStyle;

	@Description("The style applied to the text font for its visual appearance. It defines the font family, font style, weight and size.    <blockquote class=\"change-ifc2x2\">IFC2x2 Add2 CHANGE The attribute <em>TextFontStyle</em> is a new attribute attached to <em>IfcTextStyle</em>.    </blockquote>")
	@DataMember(Order = 2)
	@Required()
	@Guid("c335c62d-bf07-439a-afb9-033418fa2050")
	@JacksonXmlProperty(isAttribute=true, localName = "textFontStyle")
	private IfcTextFontSelect textFontStyle;

	@Description("Indication whether the length measures provided for the presentation style are model based, or draughting based.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute.  </blockquote>")
	@DataMember(Order = 3)
	@Guid("de6e20b2-8381-4b2e-b44e-399c8a61345d")
	@JacksonXmlProperty(isAttribute=true, localName = "modelOrDraughting")
	private IfcBoolean modelOrDraughting;


	public IfcTextStyle()
	{
	}

	public IfcTextStyle(IfcTextFontSelect textFontStyle)
	{
		this.textFontStyle = textFontStyle;
	}

	public IfcTextStyleForDefinedFont getTextCharacterAppearance() {
		return this.textCharacterAppearance;
	}

	public void setTextCharacterAppearance(IfcTextStyleForDefinedFont textCharacterAppearance) {
		this.textCharacterAppearance = textCharacterAppearance;
	}

	public IfcTextStyleTextModel getTextStyle() {
		return this.textStyle;
	}

	public void setTextStyle(IfcTextStyleTextModel textStyle) {
		this.textStyle = textStyle;
	}

	public IfcTextFontSelect getTextFontStyle() {
		return this.textFontStyle;
	}

	public void setTextFontStyle(IfcTextFontSelect textFontStyle) {
		this.textFontStyle = textFontStyle;
	}

	public IfcBoolean getModelOrDraughting() {
		return this.modelOrDraughting;
	}

	public void setModelOrDraughting(IfcBoolean modelOrDraughting) {
		this.modelOrDraughting = modelOrDraughting;
	}


}

