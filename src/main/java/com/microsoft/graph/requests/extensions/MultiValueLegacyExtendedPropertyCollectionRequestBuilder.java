// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Multi Value Legacy Extended Property Collection Request Builder.
 */
public class MultiValueLegacyExtendedPropertyCollectionRequestBuilder extends BaseRequestBuilder implements IMultiValueLegacyExtendedPropertyCollectionRequestBuilder {

    /**
     * The request builder for this collection of Post
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MultiValueLegacyExtendedPropertyCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IMultiValueLegacyExtendedPropertyCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IMultiValueLegacyExtendedPropertyCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new MultiValueLegacyExtendedPropertyCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IMultiValueLegacyExtendedPropertyRequestBuilder byId(final String id) {
        return new MultiValueLegacyExtendedPropertyRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
