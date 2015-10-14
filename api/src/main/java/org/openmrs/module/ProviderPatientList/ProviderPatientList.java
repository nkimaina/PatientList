/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.ProviderPatientList;

import org.openmrs.BaseOpenmrsMetadata;
import org.openmrs.BaseOpenmrsObject;
import org.openmrs.module.ListMember.ListMember;

import java.io.Serializable;
import java.security.Provider;
import java.util.Set;

/**
 * It is a model class. It should extend either {@link BaseOpenmrsObject} or {@link BaseOpenmrsMetadata}.
 */
public class ProviderPatientList extends BaseOpenmrsMetadata implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;

	private String listName;

	private Set<ListMember> listMembers;

	private Provider provider;

	private Integer providerId;

	@Override
	public Integer getId() {
		return id;
	}
	
	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public String getListName() {
		return this.listName;
	}


	public Set<ListMember> getListMembers() {
		return listMembers;
	}

	public void setListMembers(Set<ListMember> listMembers) {
		this.listMembers = listMembers;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}


	public Integer getProviderId() {
		return providerId;
	}

	public void setProviderId(Integer providerId) {
		this.providerId = providerId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof ProviderPatientList)) return false;
		if (!super.equals(o)) return false;

		ProviderPatientList that = (ProviderPatientList) o;

		if (!id.equals(that.id)) return false;
		if (listName != null ? !listName.equals(that.listName) : that.listName != null) return false;
		if (listMembers != null ? !listMembers.equals(that.listMembers) : that.listMembers != null) return false;
		if (provider != null ? !provider.equals(that.provider) : that.provider != null) return false;
		return !(providerId != null ? !providerId.equals(that.providerId) : that.providerId != null);

	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + id.hashCode();
		result = 31 * result + (listName != null ? listName.hashCode() : 0);
		result = 31 * result + (listMembers != null ? listMembers.hashCode() : 0);
		result = 31 * result + (provider != null ? provider.hashCode() : 0);
		result = 31 * result + (providerId != null ? providerId.hashCode() : 0);
		return result;
	}
}