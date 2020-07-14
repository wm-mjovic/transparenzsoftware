package com.hastobe.transparenzsoftware.verification.format.sml.SignatureOnly.embedded;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "encodedMeterValue")
@XmlAccessorType(XmlAccessType.FIELD)
public class EncodedMeterValue extends EncodingValue {

    @XmlAttribute
    private String encoding;

    @XmlValue
    private String value;

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}