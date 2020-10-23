// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.*;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcFillAreaStyleHatching;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcFillAreaStyleTiles;
import com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcAnnotationFillArea;
import com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPlanarExtent;
import com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcTextLiteral;
import com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLightSource;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("40f86a50-abee-4be6-ad4b-26f1f60e8956")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcAnnotationFillArea.class, name = "IfcAnnotationFillArea"),
		@JsonSubTypes.Type(value = IfcBooleanResult.class, name = "IfcBooleanResult"),
		@JsonSubTypes.Type(value = IfcBoundingBox.class, name = "IfcBoundingBox"),
		@JsonSubTypes.Type(value = IfcCartesianPointList.class, name = "IfcCartesianPointList"),
		@JsonSubTypes.Type(value = IfcCartesianTransformationOperator.class, name = "IfcCartesianTransformationOperator"),
		@JsonSubTypes.Type(value = IfcCompositeCurveSegment.class, name = "IfcCompositeCurveSegment"),
		@JsonSubTypes.Type(value = IfcCsgPrimitive3D.class, name = "IfcCsgPrimitive3D"),
		@JsonSubTypes.Type(value = IfcCurve.class, name = "IfcCurve"),
		@JsonSubTypes.Type(value = IfcDirection.class, name = "IfcDirection"),
		@JsonSubTypes.Type(value = IfcFaceBasedSurfaceModel.class, name = "IfcFaceBasedSurfaceModel"),
		@JsonSubTypes.Type(value = IfcFillAreaStyleHatching.class, name = "IfcFillAreaStyleHatching"),
		@JsonSubTypes.Type(value = IfcFillAreaStyleTiles.class, name = "IfcFillAreaStyleTiles"),
		@JsonSubTypes.Type(value = IfcGeometricSet.class, name = "IfcGeometricSet"),
		@JsonSubTypes.Type(value = IfcHalfSpaceSolid.class, name = "IfcHalfSpaceSolid"),
		@JsonSubTypes.Type(value = IfcLightSource.class, name = "IfcLightSource"),
		@JsonSubTypes.Type(value = IfcPlacement.class, name = "IfcPlacement"),
		@JsonSubTypes.Type(value = IfcPlanarExtent.class, name = "IfcPlanarExtent"),
		@JsonSubTypes.Type(value = IfcPoint.class, name = "IfcPoint"),
		@JsonSubTypes.Type(value = IfcSectionedSpine.class, name = "IfcSectionedSpine"),
		@JsonSubTypes.Type(value = IfcShellBasedSurfaceModel.class, name = "IfcShellBasedSurfaceModel"),
		@JsonSubTypes.Type(value = IfcSolidModel.class, name = "IfcSolidModel"),
		@JsonSubTypes.Type(value = IfcSurface.class, name = "IfcSurface"),
		@JsonSubTypes.Type(value = IfcTessellatedItem.class, name = "IfcTessellatedItem"),
		@JsonSubTypes.Type(value = IfcTextLiteral.class, name = "IfcTextLiteral"),
		@JsonSubTypes.Type(value = IfcVector.class, name = "IfcVector")})
public abstract class IfcGeometricRepresentationItem extends IfcRepresentationItem
{

	public IfcGeometricRepresentationItem()
	{
	}


}

