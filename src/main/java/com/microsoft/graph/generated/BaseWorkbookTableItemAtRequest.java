// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Table Item At Request.
 */
public class BaseWorkbookTableItemAtRequest extends BaseRequest implements IBaseWorkbookTableItemAtRequest {

    /**
     * The request for this WorkbookTableItemAt
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookTableItemAtRequest(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookTable.class);
    }

    /**
     * Patches the WorkbookTableItemAt
     * @param srcWorkbookTable The WorkbookTable with which to PATCH
     * @param callback The callback to be called after success or failure
     */
    public void patch(WorkbookTable srcWorkbookTable, final ICallback<WorkbookTable> callback) {
        send(HttpMethod.PATCH, callback, srcWorkbookTable);
    }

    /**
     * Patches the WorkbookTableItemAt
     *
     * @param srcWorkbookTable The WorkbookTable with which to PATCH
     * @return The WorkbookTable
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     public WorkbookTable patch(WorkbookTable srcWorkbookTable) throws ClientException {
        return this.send(HttpMethod.PATCH, srcWorkbookTable);
    }

    /**
     * Puts the WorkbookTableItemAt
     *
     * @param srcWorkbookTable The WorkbookTable to PUT
     * @param callback The callback to be called after success or failure
     */
    public void put(WorkbookTable srcWorkbookTable, final ICallback<WorkbookTable> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookTable);
    }

    /**
     * Puts the WorkbookTableItemAt
     *
     * @param srcWorkbookTable The WorkbookTable to PUT
     * @return The WorkbookTable
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     public WorkbookTable put(WorkbookTable srcWorkbookTable) throws ClientException {
        return this.send(HttpMethod.PUT, srcWorkbookTable);
    }
    /**
     * Gets the WorkbookTable
     *
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<WorkbookTable> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookTable
     *
     * @return The WorkbookTable
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    public WorkbookTable get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IWorkbookTableItemAtRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (WorkbookTableItemAtRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IWorkbookTableItemAtRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (WorkbookTableItemAtRequest)this;
    }

}