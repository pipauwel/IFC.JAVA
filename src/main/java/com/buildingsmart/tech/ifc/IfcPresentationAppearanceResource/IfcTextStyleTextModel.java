// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("59ceb694-4afb-4c76-9a16-127226c2f9f1")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTextStyleTextModel extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem
{
	@Description("The property specifies the indentation that appears before the first formatted line.    <blockquote class=\"note\">NOTE&nbsp; It has been introduced for later compliance to full CSS support.</blockquote>")
	@DataMember(Order = 0)
	@Guid("f0117f35-2e03-4ea2-9924-bd490c8fa331")
	@JacksonXmlProperty(isAttribute=true, localName = "textIndent")
	private IfcSizeSelect textIndent;

	@Description("This property describes how text is aligned horizontally within the element. The actual justification algorithm used is dependent on the rendering algorithm.")
	@DataMember(Order = 1)
	@Guid("47ae34b7-031d-41db-96d7-bf54c78482a2")
	@JacksonXmlProperty(isAttribute=false, localName = "textAlign")
	private IfcTextAlignment textAlign;

	@Description("This property describes decorations that are added to the text of an element.")
	@DataMember(Order = 2)
	@Guid("209760cf-b102-4531-a492-b7328a9ef26b")
	@JacksonXmlProperty(isAttribute=false, localName = "textDecoration")
	private IfcTextDecoration textDecoration;

	@Description("The length unit indicates an addition to the default space between characters. Values can be negative, but there may be implementation-specific limits. The importing application is free to select the exact spacing algorithm. The letter spacing may also be influenced by justification (which is a value of the <em>TextAlign</em> attribute).  <blockquote class=\"note\">NOTE&nbsp; The following values are allowed, <em>IfcDescriptiveMeasure</em> with value='normal', <em>IfcRatioMeasure</em>, or <em>IfcLengthMeasure</em>, where the length unit is globally defined at <em>IfcUnitAssignment</em>.</blockquote>")
	@DataMember(Order = 3)
	@Guid("67f38bcd-c711-4feb-8d70-7b389f7877f5")
	@JacksonXmlProperty(isAttribute=true, localName = "letterSpacing")
	private IfcSizeSelect letterSpacing;

	@Description("The length unit indicates an addition to the default space between words. Values can be negative, but there may be implementation-specific limits. The importing application is free to select the exact spacing algorithm. The word spacing may also be influenced by justification (which is a value of the 'text-align' property).    <blockquote class=\"note\">NOTE&nbsp; It has been introduced for later compliance to full CSS support.</blockquote>")
	@DataMember(Order = 4)
	@Guid("fad83a93-a548-4cf6-8329-87893148c863")
	@JacksonXmlProperty(isAttribute=true, localName = "wordSpacing")
	private IfcSizeSelect wordSpacing;

	@Description("This property describes how text characters may transform to upper case, lower case, or capitalized case, independent of the character case used in the text literal.    <blockquote class=\"note\">NOTE&nbsp; It has been introduced for later compliance to full CSS support.</blockquote>")
	@DataMember(Order = 5)
	@Guid("3def65a2-04e8-4dd9-b36d-100a15a831fb")
	@JacksonXmlProperty(isAttribute=false, localName = "textTransform")
	private IfcTextTransformation textTransform;

	@Description("The property sets the distance between two adjacent lines' baselines.<br>  When a ratio value is specified, the line height is given by the font size of the current element multiplied with the numerical value. A value of 'normal' sets the line height to a reasonable value for the element's font. It is suggested that importing applications set the 'normal' value to be a ratio number in the range of 1.0 to 1.2.    <blockquote class=\"note\">NOTE&nbsp; The following values are allowed: <em>IfcDescriptiveMeasure</em> with value='normal', or   <em>IfcLengthMeasure<em>, with non-negative values, the length unit is globally defined at <em>IfcUnitAssignment</em>, or <em>IfcRatioMeasure</em>.</blockquote>")
	@DataMember(Order = 6)
	@Guid("baf993d3-bde7-40b2-8809-170b5ab31fa4")
	@JacksonXmlProperty(isAttribute=true, localName = "lineHeight")
	private IfcSizeSelect lineHeight;


	public IfcTextStyleTextModel()
	{
	}

	public IfcSizeSelect getTextIndent() {
		return this.textIndent;
	}

	public void setTextIndent(IfcSizeSelect textIndent) {
		this.textIndent = textIndent;
	}

	public IfcTextAlignment getTextAlign() {
		return this.textAlign;
	}

	public void setTextAlign(IfcTextAlignment textAlign) {
		this.textAlign = textAlign;
	}

	public IfcTextDecoration getTextDecoration() {
		return this.textDecoration;
	}

	public void setTextDecoration(IfcTextDecoration textDecoration) {
		this.textDecoration = textDecoration;
	}

	public IfcSizeSelect getLetterSpacing() {
		return this.letterSpacing;
	}

	public void setLetterSpacing(IfcSizeSelect letterSpacing) {
		this.letterSpacing = letterSpacing;
	}

	public IfcSizeSelect getWordSpacing() {
		return this.wordSpacing;
	}

	public void setWordSpacing(IfcSizeSelect wordSpacing) {
		this.wordSpacing = wordSpacing;
	}

	public IfcTextTransformation getTextTransform() {
		return this.textTransform;
	}

	public void setTextTransform(IfcTextTransformation textTransform) {
		this.textTransform = textTransform;
	}

	public IfcSizeSelect getLineHeight() {
		return this.lineHeight;
	}

	public void setLineHeight(IfcSizeSelect lineHeight) {
		this.lineHeight = lineHeight;
	}


}

