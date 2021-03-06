/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.directconnect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NewPrivateVirtualInterfaceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NewPrivateVirtualInterfaceMarshaller {

    private static final MarshallingInfo<String> VIRTUALINTERFACENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("virtualInterfaceName").build();
    private static final MarshallingInfo<Integer> VLAN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("vlan").build();
    private static final MarshallingInfo<Integer> ASN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("asn").build();
    private static final MarshallingInfo<String> AUTHKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("authKey").build();
    private static final MarshallingInfo<String> AMAZONADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("amazonAddress").build();
    private static final MarshallingInfo<String> CUSTOMERADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customerAddress").build();
    private static final MarshallingInfo<String> ADDRESSFAMILY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("addressFamily").build();
    private static final MarshallingInfo<String> VIRTUALGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("virtualGatewayId").build();
    private static final MarshallingInfo<String> DIRECTCONNECTGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("directConnectGatewayId").build();

    private static final NewPrivateVirtualInterfaceMarshaller instance = new NewPrivateVirtualInterfaceMarshaller();

    public static NewPrivateVirtualInterfaceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NewPrivateVirtualInterface newPrivateVirtualInterface, ProtocolMarshaller protocolMarshaller) {

        if (newPrivateVirtualInterface == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(newPrivateVirtualInterface.getVirtualInterfaceName(), VIRTUALINTERFACENAME_BINDING);
            protocolMarshaller.marshall(newPrivateVirtualInterface.getVlan(), VLAN_BINDING);
            protocolMarshaller.marshall(newPrivateVirtualInterface.getAsn(), ASN_BINDING);
            protocolMarshaller.marshall(newPrivateVirtualInterface.getAuthKey(), AUTHKEY_BINDING);
            protocolMarshaller.marshall(newPrivateVirtualInterface.getAmazonAddress(), AMAZONADDRESS_BINDING);
            protocolMarshaller.marshall(newPrivateVirtualInterface.getCustomerAddress(), CUSTOMERADDRESS_BINDING);
            protocolMarshaller.marshall(newPrivateVirtualInterface.getAddressFamily(), ADDRESSFAMILY_BINDING);
            protocolMarshaller.marshall(newPrivateVirtualInterface.getVirtualGatewayId(), VIRTUALGATEWAYID_BINDING);
            protocolMarshaller.marshall(newPrivateVirtualInterface.getDirectConnectGatewayId(), DIRECTCONNECTGATEWAYID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
