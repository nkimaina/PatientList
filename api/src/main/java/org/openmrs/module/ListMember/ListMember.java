
package org.openmrs.module.ListMember;

/**
 * Created by nicky on 10/14/15.
 */

import java.io.Serializable;
import org.openmrs.BaseOpenmrsData;
import org.openmrs.Patient;

public class ListMember extends BaseOpenmrsData implements Serializable{


    private Integer id;

    private Integer patientId;

    private Patient patient;

    private Integer providerPatientListId;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Integer getProviderPatientListId() {
        return providerPatientListId;
    }

    public void setProviderPatientListId(Integer providerPatientListId) {
        this.providerPatientListId = providerPatientListId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ListMember that = (ListMember) o;

        if (!id.equals(that.id)) return false;
        if (!patientId.equals(that.patientId)) return false;
        if (patient != null ? !patient.equals(that.patient) : that.patient != null) return false;
        return !(providerPatientListId != null ? !providerPatientListId.equals(that.providerPatientListId) : that.providerPatientListId != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id.hashCode();
        result = 31 * result + patientId.hashCode();
        result = 31 * result + (patient != null ? patient.hashCode() : 0);
        result = 31 * result + (providerPatientListId != null ? providerPatientListId.hashCode() : 0);
        return result;
    }
}
