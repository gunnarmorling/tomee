/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.openejb.jee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * web-facesconfig_2_0.xsd
 * <p/>
 * <p>Java class for faces-config-localeType simple type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="faces-config-localeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "faces-config-localeType", propOrder = {
    "value"
})
public class FacesLocale {

    @XmlValue
    protected java.lang.String value;

    /**
     * The localeType defines valid locale defined by ISO-639-1
     * and ISO-3166.
     *
     * @return possible object is
     * {@link java.lang.String }
     */
    public java.lang.String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is
     *              {@link java.lang.String }
     */
    public void setValue(final java.lang.String value) {
        this.value = value;
    }

}