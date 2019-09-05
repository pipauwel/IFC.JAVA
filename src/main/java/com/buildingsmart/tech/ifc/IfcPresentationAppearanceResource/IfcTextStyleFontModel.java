// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("7439723c-1271-4a1c-9d39-89b9279b1f54")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTextStyleFontModel extends IfcPreDefinedTextFont
{
	@JacksonXmlProperty(isAttribute=true, localName = "FontFamily")
	@Description("The value is a prioritized list of font family names and/or generic family names. The first list entry has the highest priority, if this font fails, the next list item shall be used. The last list item should (if possible) be a generic family.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute changed to being mandatory.  </blockquote>")
	@Required()
	@MinLength(1)
	@Guid("49edc9c1-a620-4fe5-bf00-03775f79342f")
	private List<String> fontFamily = new ArrayList<String>();

	@JacksonXmlProperty(isAttribute=true, localName = "FontStyle")
	@Description("The font style property selects between normal (sometimes referred to as \"roman\" or \"upright\"), italic and oblique faces within a font family.<br>")
	@Guid("be8c8ef7-984b-4dc6-ac1d-7734785491d7")
	private String fontStyle;

	@JacksonXmlProperty(isAttribute=true, localName = "FontVariant")
	@Description("The font variant property selects between normal and small-caps.    <blockquote class=\"note\">NOTE&nbsp; It has been introduced for later compliance to full CSS1 support.</blockquote>")
	@Guid("d9d340f1-ae0d-4a40-804f-85dea2f4c6f7")
	private String fontVariant;

	@JacksonXmlProperty(isAttribute=true, localName = "FontWeight")
	@Description("The font weight property selects the weight of the font.    <blockquote class=\"note\">NOTE&nbsp; Values other then 'normal' and 'bold' have been introduced for later compliance to full CSS1 support.</blockquote>")
	@Guid("1589c244-68d5-4db6-b286-d166f93c9d25")
	private String fontWeight;

	@Description("The font size provides the size or height of the text font.    <blockquote class=\"note\">NOTE&nbsp; The following values are allowed, <<em>IfcLengthMeasure<em>, with positive values, the length unit is globally defined at <em>IfcUnitAssignment</em>.</blockquote>")
	@Required()
	@Guid("ef2ef376-ffb2-443f-8885-ee01737be7a9")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSizeSelect fontSize;


	public IfcTextStyleFontModel()
	{
	}

	public IfcTextStyleFontModel(String name, String[] fontFamily, com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSizeSelect fontSize)
	{
		super(name);
		this.fontFamily = new ArrayList<>(Arrays.asList(fontFamily));
		this.fontSize = fontSize;
	}

	public List<String> getFontFamily() {
		return this.fontFamily;
	}

	public String getFontStyle() {
		return this.fontStyle;
	}

	public void setFontStyle(String fontStyle) {
		this.fontStyle = fontStyle;
	}

	public String getFontVariant() {
		return this.fontVariant;
	}

	public void setFontVariant(String fontVariant) {
		this.fontVariant = fontVariant;
	}

	public String getFontWeight() {
		return this.fontWeight;
	}

	public void setFontWeight(String fontWeight) {
		this.fontWeight = fontWeight;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSizeSelect getFontSize() {
		return this.fontSize;
	}

	public void setFontSize(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSizeSelect fontSize) {
		this.fontSize = fontSize;
	}


}

