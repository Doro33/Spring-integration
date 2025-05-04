package com.example.converttest.transformer;

import com.example.converttest.dto.FindPersonResponse;
import com.example.converttest.exception.TransformException;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPMessage;
import java.io.ByteArrayInputStream;

@Component("modelTransformer")
public class XmlToModelTransformer {
    public FindPersonResponse convertSoapToObject(String xmlText) {
        try {
            MessageFactory messageFactory = MessageFactory.newInstance();

            SOAPMessage soapMessage = messageFactory.createMessage(
                    new MimeHeaders(),
                    new ByteArrayInputStream(xmlText.getBytes()));

            SOAPBody soapBody = soapMessage.getSOAPBody();

            JAXBContext context = JAXBContext.newInstance(FindPersonResponse.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            return (FindPersonResponse) unmarshaller.unmarshal(soapBody.getFirstChild());
        } catch (Exception e) {
            throw new TransformException(e.getMessage());
        }
    }
}
