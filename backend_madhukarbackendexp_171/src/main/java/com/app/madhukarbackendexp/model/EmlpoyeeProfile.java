package com.app.madhukarbackendexp.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.madhukarbackendexp.model.Organization;
import com.app.madhukarbackendexp.model.EmployeePersonalInfo;
import com.app.madhukarbackendexp.model.EmlpoyeeProfile;
import com.app.madhukarbackendexp.enums.EmploymentType;
import com.app.madhukarbackendexp.enums.OrgDept;
import com.app.madhukarbackendexp.enums.OrgBranch;
import com.app.madhukarbackendexp.converter.OrgBranchConverter;
import com.app.madhukarbackendexp.converter.EmploymentTypeConverter;
import com.app.madhukarbackendexp.converter.OrgDeptConverter;
import com.app.madhukarbackendexp.converter.DurationConverter;
import com.app.madhukarbackendexp.converter.UUIDToByteConverter;
import com.app.madhukarbackendexp.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "EmlpoyeeProfile")
@Table(name = "\"EmlpoyeeProfile\"", schema =  "\"madhukarbackendexp\"")
@Data
                        
public class EmlpoyeeProfile {
	public EmlpoyeeProfile () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"EmpID\"", nullable = true )
  private Integer empID;
	  
  @Column(name = "\"EmpName\"", nullable = true )
  private String empName;
  
	  
  @Column(name = "\"EmpEmailID\"", nullable = true )
  private String empEmailID;
  
	  
  @Column(name = "\"EmpPhoto\"", nullable = true )
  private String empPhoto;
  
	  
  @Column(name = "\"JobTitle\"", nullable = true )
  private String jobTitle;
  
	  
  @Column(name = "\"DomainVertical\"", nullable = true)
  @Enumerated(value = EnumType.ORDINAL)
  @Convert(converter = OrgDeptConverter.class)
  private OrgDept domainVertical;
  
	  
  @Column(name = "\"ReportingManager\"", nullable = true )
  private String reportingManager;
  
	  
  @Column(name = "\"EmpType\"", nullable = true)
  @Enumerated(value = EnumType.ORDINAL)
  @Convert(converter = EmploymentTypeConverter.class)
  private EmploymentType empType;
  
	  
  @Column(name = "\"WorkLocation\"", nullable = true)
  @Enumerated(value = EnumType.ORDINAL)
  @Convert(converter = OrgBranchConverter.class)
  private OrgBranch workLocation;
  
	  
  @Column(name = "\"PackageOffered\"", nullable = true )
  private Integer packageOffered;
  
	  
  @Column(name = "\"EmpContactNum\"", nullable = true )
  private Long empContactNum;
  
	  
  @Column(name = "\"Level\"", nullable = true )
  private String level;
  
	  
  @Column(name = "\"Domain\"", nullable = true )
  private String domain;
  
  
  
  
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "\"EmlpoyeeProfileEmpInfo\"", referencedColumnName = "\"Id\"", insertable = false, updatable = false)
	private EmployeePersonalInfo empInfo;
	
	@Column(name = "\"EmlpoyeeProfileEmpInfo\"")
	private Integer emlpoyeeProfileEmpInfo;
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "EmlpoyeeProfile [" 
  + "EmpID= " + empID  + ", " 
  + "EmpName= " + empName  + ", " 
  + "EmpEmailID= " + empEmailID  + ", " 
  + "EmpPhoto= " + empPhoto  + ", " 
  + "JobTitle= " + jobTitle  + ", " 
  + "DomainVertical= " + domainVertical  + ", " 
  + "ReportingManager= " + reportingManager  + ", " 
  + "EmpType= " + empType  + ", " 
  + "WorkLocation= " + workLocation  + ", " 
  + "PackageOffered= " + packageOffered  + ", " 
  + "EmpContactNum= " + empContactNum  + ", " 
  + "Level= " + level  + ", " 
  + "Domain= " + domain 
 + "]";
	}
	
}