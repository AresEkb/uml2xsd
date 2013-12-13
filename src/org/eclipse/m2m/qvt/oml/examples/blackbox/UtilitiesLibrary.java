/*******************************************************************************
 * Copyright (c) 2008 Borland Software Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.qvt.oml.examples.blackbox;

import java.util.Date;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;


public class UtilitiesLibrary {
	
	public UtilitiesLibrary() {
		super();
	}

    public static QName createQName(String namespaceURI, String localPart, String prefix) {
        return new QName(namespaceURI, localPart, prefix);
    }
    
    public Date createDate(String dateStr) {
        return (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), dateStr);
    }
    
    /*
    * java.util.Date resolved as ecore::EDate, which as an opaque data type to the QVT type system, however
    * here equipped by this additional operation.
    */
    @Operation(contextual=true)
    public static boolean before(Date self, Date when) {
        return self.before(when);
    }
    
    @Operation(contextual=true)
    public static String getQualifiedName(EClassifier self) {
        return self.getEPackage().getName() + "::" + self.getName();
    }
}
