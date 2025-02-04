/*******************************************************************************
 * Copyright (c) 2020 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package com.ibm.ws.query.entities.ano;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ibm.ws.query.entities.interfaces.IPart;
import com.ibm.ws.query.entities.interfaces.IPartComposite;
import com.ibm.ws.query.entities.interfaces.IUsage;

@Entity
@Table(name = "JPAUsagePartTab")

public class Usage implements IUsage {

    @Id
    protected int id;
    protected int quantity;
    @ManyToOne
    protected Part child;
    @ManyToOne
    protected PartComposite parent;

    public Usage(PartComposite p, int quantity, Part subpart) {
        this.id = p.getPartno() * 10000 + subpart.getPartno();
        this.quantity = quantity;
        setParent(p);
        p.getPartsUsed().add(this);
        setChild(subpart);
        subpart.getUsedIn().add(this);
    }

    public Usage() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public PartComposite getParent() {
        return parent;
    }

    @Override
    public void setParent(IPartComposite parent) {
        this.parent = (PartComposite) parent;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public Part getChild() {
        return child;
    }

    @Override
    public void setChild(IPart child) {
        this.child = (Part) child;
    }

    @Override
    public String toString() {
        return "Usage:" + id + " quantity:" + quantity + " child:" + child.getPartno() + " parent" + parent.getPartno();
    }

}
