// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("59ceb694-4afb-4c76-9a16-127226c2f9f1")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTextStyleTextModel extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem
{
	@Description("The property specifies the indentation that appears before the first formatted line.    <blockquote class=\"note\">NOTE&nbsp; It has been introduced for later compliance to full CSS support.</blockquote>")
	@Guid("f0117f35-2e03-4ea2-9924-bd490c8fa331")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSizeSelect textIndent;

	@JacksonXmlProperty(isAttribute=true, localName = "TextAlign")
	@Description("This property describes how text is aligned horizontally within the element. The actual justification algorithm used is dependent on the rendering algorithm.")
	@Guid("47ae34b7-031d-41db-96d7-bf54c78482a2")
	private String textAlign;

	@JacksonXmlProperty(isAttribute=true, localName = "TextDecoration")
	@Description("This property describes decorations that are added to the text of an element.")
	@Guid("209760cf-b102-4531-a492-b7328a9ef26b")
	private String textDecoration;

	@Description("The length unit indicates an addition to the default space between characters. Values can be negative, but there may be implementation-specific limits. The importing application is free to select the exact spacing algorithm. The letter spacing may also be influenced by justification (which is a value of the <em>TextAlign</em> attribute).  <blockquote class=\"note\">NOTE&nbsp; The following values are allowed, <em>IfcDescriptiveMeasure</em> with value='normal', <em>IfcRatioMeasure</em>, or <em>IfcLengthMeasure</em>, where the length unit is globally defined at <em>IfcUnitAssignment</em>.</blockquote>")
	@Guid("67f38bcd-c711-4feb-8d70-7b389f7877f5")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSizeSelect letterSpacing;

	@Description("The length unit indicates an addition to the default space between words. Values can be negative, but there may be implementation-specific limits. The importing application is free to select the exact spacing algorithm. The word spacing may also be influenced by justification (which is a value of the 'text-align' property).    <blockquote class=\"note\">NOTE&nbsp; It has been introduced for later compliance to full CSS support.</blockquote>")
	@Guid("fad83a93-a548-4cf6-8329-87893148c863")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSizeSelect wordSpacing;

	@JacksonXmlProperty(isAttribute=true, localName = "TextTransform")
	@Description("This property describes how text characters may transform to upper case, lower case, or capitalized case, independent of the character case used in the text literal.    <blockquote class=\"note\">NOTE&nbsp; It has been introduced for later compliance to full CSS support.</blockquote>")
	@Guid("3def65a2-04e8-4dd9-b36d-100a15a831fb")
	private String textTransform;

	@Description("The property sets the distance between two adjacent lines' baselines.<br>  When a ratio value is specified, the line height is given by the font size of the current element multiplied with the numerical value. A value of 'normal' sets the line height to a reasonable value for the element's font. It is suggested that importing applications set the 'normal' value to be a ratio number in the range of 1.0 to 1.2.    <blockquote class=\"note\">NOTE&nbsp; The following values are allowed: <em>IfcDescriptiveMeasure</em> with value='normal', or   <em>IfcLengthMeasure<em>, with non-negative values, the length unit is globally defined at <em>IfcUnitAssignment</em>, or <em>IfcRatioMeasure</em>.</blockquote>")
	@Guid("baf993d3-bde7-40b2-8809-170b5ab31fa4")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSizeSelect lineHeight;


	public IfcTextStyleTextModel()
	{
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSizeSelect getTextIndent() {
		return this.textIndent;
	}

	public void setTextIndent(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSizeSelect textIndent) {
		this.textIndent = textIndent;
	}

	public String getTextAlign() {
		return this.textAlign;
	}

	public void setTextAlign(String textAlign) {
		this.textAlign = textAlign;
	}

	public String getTextDecoration() {
		return this.textDecoration;
	}

	public void setTextDecoration(String textDecoration) {
		this.textDecoration = textDecoration;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSizeSelect getLetterSpacing() {
		return this.letterSpacing;
	}

	public void setLetterSpacing(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSizeSelect letterSpacing) {
		this.letterSpacing = letterSpacing;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSizeSelect getWordSpacing() {
		return this.wordSpacing;
	}

	public void setWordSpacing(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSizeSelect wordSpacing) {
		this.wordSpacing = wordSpacing;
	}

	public String getTextTransform() {
		return this.textTransform;
	}

	public void setTextTransform(String textTransform) {
		this.textTransform = textTransform;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSizeSelect getLineHeight() {
		return this.lineHeight;
	}

	public void setLineHeight(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSizeSelect lineHeight) {
		this.lineHeight = lineHeight;
	}


}

