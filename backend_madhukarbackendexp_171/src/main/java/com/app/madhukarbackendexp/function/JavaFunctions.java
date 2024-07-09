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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.madhukarbackendexp.repository.OrganizationRepository;
import com.app.madhukarbackendexp.repository.EmployeePersonalInfoRepository;
import com.app.madhukarbackendexp.repository.EmlpoyeeProfileRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
