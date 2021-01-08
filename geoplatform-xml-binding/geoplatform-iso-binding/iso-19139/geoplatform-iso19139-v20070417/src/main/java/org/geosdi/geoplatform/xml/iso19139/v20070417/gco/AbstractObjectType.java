/**
 *
 *    geo-platform
 *    Rich webgis framework
 *    http://geo-platform.org
 *   ====================================================================
 *
 *   Copyright (C) 2008-2021 geoSDI Group (CNR IMAA - Potenza - ITALY).
 *
 *   This program is free software: you can redistribute it and/or modify it
 *   under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version. This program is distributed in the
 *   hope that it will be useful, but WITHOUT ANY WARRANTY; without
 *   even the implied warranty of MERCHANTABILITY or FITNESS FOR
 *   A PARTICULAR PURPOSE. See the GNU General Public License
 *   for more details. You should have received a copy of the GNU General
 *   Public License along with this program. If not, see http://www.gnu.org/licenses/
 *
 *   ====================================================================
 *
 *   Linking this library statically or dynamically with other modules is
 *   making a combined work based on this library. Thus, the terms and
 *   conditions of the GNU General Public License cover the whole combination.
 *
 *   As a special exception, the copyright holders of this library give you permission
 *   to link this library with independent modules to produce an executable, regardless
 *   of the license terms of these independent modules, and to copy and distribute
 *   the resulting executable under terms of your choice, provided that you also meet,
 *   for each linked independent module, the terms and conditions of the license of
 *   that module. An independent module is a module which is not derived from or
 *   based on this library. If you modify this library, you may extend this exception
 *   to your version of the library, but you are not obligated to do so. If you do not
 *   wish to do so, delete this exception statement from your version.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.18 at 03:12:11 PM CEST 
//


package org.geosdi.geoplatform.xml.iso19139.v20070417.gco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.AbstractDQElementType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.AbstractDQResultType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.AbstractDSAggregateType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.AbstractEXGeographicExtentType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.AbstractMDContentInformationType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.AbstractMDIdentificationType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.AbstractMDSpatialRepresentationType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.AbstractRSReferenceSystemType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.CIAddressType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.CICitationType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.CIContactType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.CIDateType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.CIOnlineResourceType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.CIResponsiblePartyType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.CISeriesType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.CITelephoneType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.DQDataQualityType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.DQScopeType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.DSAssociationType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.DSDataSetType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.EXExtentType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.EXTemporalExtentType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.EXVerticalExtentType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.LILineageType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.LIProcessStepType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.LISourceType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDAggregateInformationType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDApplicationSchemaInformationType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDBrowseGraphicType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDConstraintsType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDDigitalTransferOptionsType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDDimensionType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDDistributionType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDDistributorType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDExtendedElementInformationType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDFormatType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDGeometricObjectsType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDIdentifierType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDKeywordsType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDMaintenanceInformationType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDMediumType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDMetadataExtensionInformationType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDMetadataType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDPortrayalCatalogueReferenceType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDRangeDimensionType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDReferenceSystemType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDRepresentativeFractionType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDStandardOrderProcessType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.MDUsageType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.PTFreeTextType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmd.PTLocaleType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmx.AbstractCTCatalogueType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gmx.AbstractMXFileType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for AbstractObject_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractObject_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.isotc211.org/2005/gco}ObjectIdentification"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractObject_Type")
@XmlSeeAlso({
    TypeNameType.class,
    MultiplicityType.class,
    MultiplicityRangeType.class,
    MemberNameType.class,
    DQDataQualityType.class,
    MDBrowseGraphicType.class,
    MDDimensionType.class,
    MDUsageType.class,
    MDIdentifierType.class,
    MDMediumType.class,
    MDExtendedElementInformationType.class,
    CIOnlineResourceType.class,
    DSAssociationType.class,
    MDStandardOrderProcessType.class,
    MDDistributorType.class,
    EXVerticalExtentType.class,
    CISeriesType.class,
    MDKeywordsType.class,
    AbstractMDIdentificationType.class,
    PTLocaleType.class,
    MDMaintenanceInformationType.class,
    MDDistributionType.class,
    CIResponsiblePartyType.class,
    MDConstraintsType.class,
    CIAddressType.class,
    LIProcessStepType.class,
    AbstractRSReferenceSystemType.class,
    EXExtentType.class,
    AbstractMDContentInformationType.class,
    MDFormatType.class,
    CICitationType.class,
    LISourceType.class,
    PTFreeTextType.class,
    LILineageType.class,
    MDRepresentativeFractionType.class,
    MDMetadataType.class,
    MDMetadataExtensionInformationType.class,
    MDApplicationSchemaInformationType.class,
    DQScopeType.class,
    MDReferenceSystemType.class,
    MDRangeDimensionType.class,
    EXTemporalExtentType.class,
    AbstractEXGeographicExtentType.class,
    CITelephoneType.class,
    MDPortrayalCatalogueReferenceType.class,
    MDDigitalTransferOptionsType.class,
    AbstractDQResultType.class,
    AbstractMDSpatialRepresentationType.class,
    MDGeometricObjectsType.class,
    MDAggregateInformationType.class,
    CIDateType.class,
    AbstractDQElementType.class,
    CIContactType.class,
    DSDataSetType.class,
    AbstractDSAggregateType.class,
    AbstractMXFileType.class,
    AbstractCTCatalogueType.class
})
public abstract class AbstractObjectType implements ToString
{

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    public boolean isSetUuid() {
        return (this.uuid!= null);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            String theUuid;
            theUuid = this.getUuid();
            strategy.appendField(locator, this, "uuid", buffer, theUuid);
        }
        return buffer;
    }

}
