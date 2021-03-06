/*******************************************************************************
 * Copyright (c) 2018 Red Hat Inc..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat Incorporated - initial API and implementation
 *******************************************************************************/
package com.redhat.fabric8analytics.lsp.eclipse.core.data;

public class AnalyticsAuthData {
	
	private ThreeScaleData threeScaleData;
	

	public AnalyticsAuthData() {
		// empty constructor
	}

	public AnalyticsAuthData(ThreeScaleData threeScaleData) {
		this.threeScaleData = threeScaleData;
	}

	public ThreeScaleData getThreeScaleData() {
		return threeScaleData;
	}

	public void setThreeScaleData(ThreeScaleData threeScaleData) {
		this.threeScaleData = threeScaleData;
	}

}
