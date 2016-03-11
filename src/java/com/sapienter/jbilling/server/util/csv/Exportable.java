/*
 jBilling - The Enterprise Open Source Billing System
 Copyright (C) 2003-2011 Enterprise jBilling Software Ltd. and Emiliano Conde

 This file is part of jbilling.

 jbilling is free software: you can redistribute it and/or modify
 it under the terms of the GNU Affero General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 jbilling is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU Affero General Public License for more details.

 You should have received a copy of the GNU Affero General Public License
 along with jbilling.  If not, see <http://www.gnu.org/licenses/>.

 This source was modified by Web Data Technologies LLP (www.webdatatechnologies.in) since 15 Nov 2015.
You may download the latest source from webdataconsulting.github.io.

 */

package com.sapienter.jbilling.server.util.csv;

import java.util.ArrayList;
import java.util.List;

/**
 * Marks a class as being exportable in a simple format (such as CSV).
 *
 * @author Brian Cowdery
 * @since 03/03/11
 */
public interface Exportable {
	
	public  List<String> metaFieldsNames = new ArrayList<>();
	public  List<String> customerMetaFieldsNames = new ArrayList<>();
    public String[] getFieldNames();
    public Object[][] getFieldValues();

}
