// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsT_InvRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions T_Inv Request Builder.
 */
public interface IWorkbookFunctionsT_InvRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsT_InvRequest
     *
     * @return the IWorkbookFunctionsT_InvRequest instance
     */
    IWorkbookFunctionsT_InvRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsT_InvRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsT_InvRequest instance
     */
    IWorkbookFunctionsT_InvRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
