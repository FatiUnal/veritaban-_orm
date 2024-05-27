package org.example.orm.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.example.orm.entity.Departmant;
import org.example.orm.entity.Manager;
import org.example.orm.entity.Position;
import org.example.orm.enums.EmployeeSatisfaction;
import org.example.orm.enums.MaritalStatus;
import org.example.orm.enums.PerformanceScore;

import java.util.Date;

public class HumanCreateDto {

    private String employee_name;

    private boolean married;
    private MaritalStatus maritalStatus;
    private boolean gender;
    private int employeeStatusId;

    private int departmantId;

    private PerformanceScore performanceScore;

    private boolean FromDiversityJobFair;
    private int salary;
    private boolean term;

    private int positionId;

    private Date dob;
    private boolean hispanicLatino;
    private Date dateOfHire;
    private String termReason;
    private int managerId;

    private String recruitmentSource;
    private double engagementSurvival;
    private EmployeeSatisfaction employeeSatisfaction;

    private int specialProject;
    private Date LastPerformanceScore;
    private int daysLAteLast30;
    private int absences;

    public HumanCreateDto(String employee_name, boolean married, MaritalStatus maritalStatus, boolean gender, int employeeStatusId, int departmantId, PerformanceScore performanceScore, boolean fromDiversityJobFair, int salary, boolean term, int positionId, Date dob, boolean hispanicLatino, Date dateOfHire, String termReason, int managerId, String recruitmentSource, double engagementSurvival, EmployeeSatisfaction employeeSatisfaction, int specialProject, Date lastPerformanceScore, int daysLAteLast30, int absences) {
        this.employee_name = employee_name;
        this.married = married;
        this.maritalStatus = maritalStatus;
        this.gender = gender;
        this.employeeStatusId = employeeStatusId;
        this.departmantId = departmantId;
        this.performanceScore = performanceScore;
        FromDiversityJobFair = fromDiversityJobFair;
        this.salary = salary;
        this.term = term;
        this.positionId = positionId;
        this.dob = dob;
        this.hispanicLatino = hispanicLatino;
        this.dateOfHire = dateOfHire;
        this.termReason = termReason;
        this.managerId = managerId;
        this.recruitmentSource = recruitmentSource;
        this.engagementSurvival = engagementSurvival;
        this.employeeSatisfaction = employeeSatisfaction;
        this.specialProject = specialProject;
        LastPerformanceScore = lastPerformanceScore;
        this.daysLAteLast30 = daysLAteLast30;
        this.absences = absences;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getEmployeeStatusId() {
        return employeeStatusId;
    }

    public void setEmployeeStatusId(int employeeStatusId) {
        this.employeeStatusId = employeeStatusId;
    }

    public int getDepartmantId() {
        return departmantId;
    }

    public void setDepartmantId(int departmantId) {
        this.departmantId = departmantId;
    }

    public PerformanceScore getPerformanceScore() {
        return performanceScore;
    }

    public void setPerformanceScore(PerformanceScore performanceScore) {
        this.performanceScore = performanceScore;
    }

    public boolean isFromDiversityJobFair() {
        return FromDiversityJobFair;
    }

    public void setFromDiversityJobFair(boolean fromDiversityJobFair) {
        FromDiversityJobFair = fromDiversityJobFair;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isTerm() {
        return term;
    }

    public void setTerm(boolean term) {
        this.term = term;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean isHispanicLatino() {
        return hispanicLatino;
    }

    public void setHispanicLatino(boolean hispanicLatino) {
        this.hispanicLatino = hispanicLatino;
    }

    public Date getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(Date dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public String getTermReason() {
        return termReason;
    }

    public void setTermReason(String termReason) {
        this.termReason = termReason;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getRecruitmentSource() {
        return recruitmentSource;
    }

    public void setRecruitmentSource(String recruitmentSource) {
        this.recruitmentSource = recruitmentSource;
    }

    public double getEngagementSurvival() {
        return engagementSurvival;
    }

    public void setEngagementSurvival(double engagementSurvival) {
        this.engagementSurvival = engagementSurvival;
    }

    public EmployeeSatisfaction getEmployeeSatisfaction() {
        return employeeSatisfaction;
    }

    public void setEmployeeSatisfaction(EmployeeSatisfaction employeeSatisfaction) {
        this.employeeSatisfaction = employeeSatisfaction;
    }

    public int getSpecialProject() {
        return specialProject;
    }

    public void setSpecialProject(int specialProject) {
        this.specialProject = specialProject;
    }

    public Date getLastPerformanceScore() {
        return LastPerformanceScore;
    }

    public void setLastPerformanceScore(Date lastPerformanceScore) {
        LastPerformanceScore = lastPerformanceScore;
    }

    public int getDaysLAteLast30() {
        return daysLAteLast30;
    }

    public void setDaysLAteLast30(int daysLAteLast30) {
        this.daysLAteLast30 = daysLAteLast30;
    }

    public int getAbsences() {
        return absences;
    }

    public void setAbsences(int absences) {
        this.absences = absences;
    }
}
