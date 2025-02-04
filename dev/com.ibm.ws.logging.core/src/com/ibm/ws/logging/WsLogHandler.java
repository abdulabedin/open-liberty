/*******************************************************************************
 * Copyright (c) 2012, 2021 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.logging;

/**
 * A LogHandler receives messages and LogRecords, and logs them.
 */
public interface WsLogHandler {

    /**
     * Log the given log record.
     *
     * @param routedMessage The LogRecord along with various message formats.
     * @param messageHidden Flag indicating if the message should be hidden or not.
     */
    void publish(RoutedMessage routedMessage, boolean messageHidden);
    
}
