/**
 *
 *    geo-platform
 *    Rich webgis framework
 *    http://geo-platform.org
 *   ====================================================================
 *
 *   Copyright (C) 2008-2018 geoSDI Group (CNR IMAA - Potenza - ITALY).
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
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.12.01 alle 08:55:18 AM CET 
//


package org.geosdi.geoplatform.xml.wps.v100;

import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Description of a process Output.
 * <p>
 * In this use, the DescriptionType shall describe this process output.
 * <p>
 * <p>Classe Java per OutputDescriptionType complex type.
 * <p>
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;complexType name="OutputDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/wps/1.0.0}DescriptionType"&gt;
 *       &lt;group ref="{http://www.opengis.net/wps/1.0.0}OutputFormChoice"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputDescriptionType", propOrder = {
        "complexOutput",
        "literalOutput",
        "boundingBoxOutput"
})
public class OutputDescriptionType extends DescriptionType implements ToString2 {

    @XmlElement(name = "ComplexOutput", namespace = "")
    protected SupportedComplexDataType complexOutput;
    @XmlElement(name = "LiteralOutput", namespace = "")
    protected LiteralOutputType literalOutput;
    @XmlElement(name = "BoundingBoxOutput", namespace = "")
    protected SupportedCRSsType boundingBoxOutput;

    /**
     * Recupera il valore della proprietà complexOutput.
     *
     * @return possible object is
     * {@link SupportedComplexDataType }
     */
    public SupportedComplexDataType getComplexOutput() {
        return complexOutput;
    }

    /**
     * Imposta il valore della proprietà complexOutput.
     *
     * @param value allowed object is
     *              {@link SupportedComplexDataType }
     */
    public void setComplexOutput(SupportedComplexDataType value) {
        this.complexOutput = value;
    }

    public boolean isSetComplexOutput() {
        return (this.complexOutput != null);
    }

    /**
     * Recupera il valore della proprietà literalOutput.
     *
     * @return possible object is
     * {@link LiteralOutputType }
     */
    public LiteralOutputType getLiteralOutput() {
        return literalOutput;
    }

    /**
     * Imposta il valore della proprietà literalOutput.
     *
     * @param value allowed object is
     *              {@link LiteralOutputType }
     */
    public void setLiteralOutput(LiteralOutputType value) {
        this.literalOutput = value;
    }

    public boolean isSetLiteralOutput() {
        return (this.literalOutput != null);
    }

    /**
     * Recupera il valore della proprietà boundingBoxOutput.
     *
     * @return possible object is
     * {@link SupportedCRSsType }
     */
    public SupportedCRSsType getBoundingBoxOutput() {
        return boundingBoxOutput;
    }

    /**
     * Imposta il valore della proprietà boundingBoxOutput.
     *
     * @param value allowed object is
     *              {@link SupportedCRSsType }
     */
    public void setBoundingBoxOutput(SupportedCRSsType value) {
        this.boundingBoxOutput = value;
    }

    public boolean isSetBoundingBoxOutput() {
        return (this.boundingBoxOutput != null);
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            SupportedComplexDataType theComplexOutput;
            theComplexOutput = this.getComplexOutput();
            strategy.appendField(locator, this, "complexOutput", buffer, theComplexOutput, this.isSetComplexOutput());
        }
        {
            LiteralOutputType theLiteralOutput;
            theLiteralOutput = this.getLiteralOutput();
            strategy.appendField(locator, this, "literalOutput", buffer, theLiteralOutput, this.isSetLiteralOutput());
        }
        {
            SupportedCRSsType theBoundingBoxOutput;
            theBoundingBoxOutput = this.getBoundingBoxOutput();
            strategy.appendField(locator, this, "boundingBoxOutput", buffer, theBoundingBoxOutput, this.isSetBoundingBoxOutput());
        }
        return buffer;
    }

}