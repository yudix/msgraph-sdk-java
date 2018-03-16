// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Mobile Threat Defense Connector Request.
 */
public class BaseMobileThreatDefenseConnectorRequest extends BaseRequest implements IBaseMobileThreatDefenseConnectorRequest {

    /**
     * The request for the MobileThreatDefenseConnector
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseMobileThreatDefenseConnectorRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<MobileThreatDefenseConnector> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the MobileThreatDefenseConnector from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<MobileThreatDefenseConnector> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MobileThreatDefenseConnector from the service
     *
     * @return the MobileThreatDefenseConnector from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileThreatDefenseConnector get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this MobileThreatDefenseConnector with a source
     *
     * @param sourceMobileThreatDefenseConnector the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MobileThreatDefenseConnector sourceMobileThreatDefenseConnector, final ICallback<MobileThreatDefenseConnector> callback) {
        send(HttpMethod.PATCH, callback, sourceMobileThreatDefenseConnector);
    }

    /**
     * Patches this MobileThreatDefenseConnector with a source
     *
     * @param sourceMobileThreatDefenseConnector the source object with updates
     * @return the updated MobileThreatDefenseConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileThreatDefenseConnector patch(final MobileThreatDefenseConnector sourceMobileThreatDefenseConnector) throws ClientException {
        return send(HttpMethod.PATCH, sourceMobileThreatDefenseConnector);
    }

    /**
     * Creates a MobileThreatDefenseConnector with a new object
     *
     * @param newMobileThreatDefenseConnector the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MobileThreatDefenseConnector newMobileThreatDefenseConnector, final ICallback<MobileThreatDefenseConnector> callback) {
        send(HttpMethod.POST, callback, newMobileThreatDefenseConnector);
    }

    /**
     * Creates a MobileThreatDefenseConnector with a new object
     *
     * @param newMobileThreatDefenseConnector the new object to create
     * @return the created MobileThreatDefenseConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileThreatDefenseConnector post(final MobileThreatDefenseConnector newMobileThreatDefenseConnector) throws ClientException {
        return send(HttpMethod.POST, newMobileThreatDefenseConnector);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMobileThreatDefenseConnectorRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (MobileThreatDefenseConnectorRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMobileThreatDefenseConnectorRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (MobileThreatDefenseConnectorRequest)this;
     }

}
