/*******************************************************************************
 * Copyright (c) 2022 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.webcontainer.osgi.container.config.merge;

import java.util.Objects;

import com.ibm.ws.javaee.dd.common.ManagedThreadFactory;

public class ManagedThreadFactoryComparator extends AbstractBaseComparator<ManagedThreadFactory> {

    @Override
    public boolean compare(ManagedThreadFactory o1, ManagedThreadFactory o2) {
        return Objects.equals(o1.getName(), o2.getName())
                        && Objects.equals(o1.getContextServiceRef(), o2.getContextServiceRef())
                        && Objects.equals(o1.getDescriptions(), o2.getDescriptions())
                        && o1.getPriority() == o2.getPriority()
                        && compareProperties(o1.getProperties(), o2.getProperties());
    }

}
