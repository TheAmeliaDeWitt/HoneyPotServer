package com.marchnetworks.device_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "", propOrder = {"subscriptionId"} )
@XmlRootElement( name = "Unsubscribe" )
public class Unsubscribe
{
	@XmlElement( required = true )
	protected String subscriptionId;

	public String getSubscriptionId()
	{
		return subscriptionId;
	}

	public void setSubscriptionId( String value )
	{
		subscriptionId = value;
	}
}
