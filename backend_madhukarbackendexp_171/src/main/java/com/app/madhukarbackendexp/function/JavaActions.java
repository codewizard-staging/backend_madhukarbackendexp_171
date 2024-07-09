package com.app.madhukarbackendexp.function;

import com.app.madhukarbackendexp.model.Organization;
import com.app.madhukarbackendexp.model.EmployeePersonalInfo;
import com.app.madhukarbackendexp.model.EmlpoyeeProfile;




import com.app.madhukarbackendexp.enums.EmploymentType;
import com.app.madhukarbackendexp.enums.OrgDept;
import com.app.madhukarbackendexp.enums.OrgBranch;
import com.app.madhukarbackendexp.converter.OrgBranchConverter;
import com.app.madhukarbackendexp.converter.EmploymentTypeConverter;
import com.app.madhukarbackendexp.converter.OrgDeptConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  