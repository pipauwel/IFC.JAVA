// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcPostalAddress;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcCompoundPlaneAngleMeasure;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("1208b73f-6d28-45b8-bda4-7dc5d67a886b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSite extends IfcSpatialStructureElement
{
	@Description("World Latitude at reference point (most likely defined in legal description). Defined as integer values for degrees, minutes, seconds, and, optionally, millionths of seconds with respect to the world geodetic system WGS84.  <blockquote class=\"note\">NOTE&nbsp; Latitudes are measured relative to the geodetic equator, north of the equator by positive values - from 0 till +90,   south of the equator by negative values - from 0 till  -90.</blockquote>")
	@DataMember(Order = 0)
	@Guid("35f5020f-d203-4c6b-9106-60f283ec94c7")
	@JacksonXmlProperty(isAttribute=false, localName = "refLatitude")
	private IfcCompoundPlaneAngleMeasure refLatitude;

	@Description("World Longitude at reference point (most likely defined in legal description). Defined as integer values for degrees, minutes, seconds, and, optionally, millionths of seconds with respect to the world geodetic system WGS84.  <blockquote class=\"note\">NOTE&nbsp; Longitudes are measured relative to the geodetic zero meridian, nominally the same as the Greenwich prime meridian: longitudes west of the zero meridian have negative values - from 0 till -180, longitudes east of the zero meridian have positive values - from 0 till -180.</blockquote>  <blockquote class=\"example\">EXAMPLE&nbsp; Chicago Harbor Light has according to WGS84 a longitude -87.35.40 (or 87.35.40W) and a latitude 41.53.30 (or 41.53.30N).</blockquote>")
	@DataMember(Order = 1)
	@Guid("d0f7ccd1-9a49-4d0d-a1b9-73c9edd9b69b")
	@JacksonXmlProperty(isAttribute=false, localName = "refLongitude")
	private IfcCompoundPlaneAngleMeasure refLongitude;

	@Description("Datum elevation relative to sea level.")
	@DataMember(Order = 2)
	@Guid("117894b2-b884-433b-a0cd-6cbd59685a12")
	@JacksonXmlProperty(isAttribute=false, localName = "refElevation")
	private IfcLengthMeasure refElevation;

	@Description("The land title number (designation of the site within a regional system).")
	@DataMember(Order = 3)
	@Guid("1adcd159-01ea-40ba-9dd2-0e9ed2cfc41a")
	@JacksonXmlProperty(isAttribute=false, localName = "landTitleNumber")
	private IfcLabel landTitleNumber;

	@Description("Address given to the site for postal purposes.")
	@DataMember(Order = 4)
	@Guid("97ec96dd-f92e-43e8-9e7d-228cfdd0f137")
	@JacksonXmlProperty(isAttribute=false, localName = "siteAddress")
	private IfcPostalAddress siteAddress;


	public IfcSite()
	{
	}

	public IfcSite(String globalId)
	{
		super(globalId);
	}

	public IfcCompoundPlaneAngleMeasure getRefLatitude() {
		return this.refLatitude;
	}

	public void setRefLatitude(IfcCompoundPlaneAngleMeasure refLatitude) {
		this.refLatitude = refLatitude;
	}

	public IfcCompoundPlaneAngleMeasure getRefLongitude() {
		return this.refLongitude;
	}

	public void setRefLongitude(IfcCompoundPlaneAngleMeasure refLongitude) {
		this.refLongitude = refLongitude;
	}

	public IfcLengthMeasure getRefElevation() {
		return this.refElevation;
	}

	public void setRefElevation(IfcLengthMeasure refElevation) {
		this.refElevation = refElevation;
	}

	public IfcLabel getLandTitleNumber() {
		return this.landTitleNumber;
	}

	public void setLandTitleNumber(IfcLabel landTitleNumber) {
		this.landTitleNumber = landTitleNumber;
	}

	public IfcPostalAddress getSiteAddress() {
		return this.siteAddress;
	}

	public void setSiteAddress(IfcPostalAddress siteAddress) {
		this.siteAddress = siteAddress;
	}


}

