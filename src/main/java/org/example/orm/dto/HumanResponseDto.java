package org.example.orm.dto;

import jakarta.persistence.*;
import org.example.orm.entity.Departmant;
import org.example.orm.entity.Manager;
import org.example.orm.entity.Position;
import org.example.orm.enums.EmployeeSatisfaction;
import org.example.orm.enums.MaritalStatus;
import org.example.orm.enums.PerformanceScore;

import java.util.Date;

public class HumanResponseDto {

    private int id;
    private String employee_name;

    private boolean married;
    private int maritalStatus;
    private boolean gender;
    private int employeeStatusId;

    private int departmentId;
    private String departmantName;


    private int performanceScore;

    private boolean FromDiversityJobFair;
    private int salary;
    private boolean term;


    private int positionId;
    private String positionName;

    private Date dob;
    private boolean hispanicLatino;
    private Date dateOfHire;
    private String termReason;

    private int managerId;
    private String managerName;

    private String recruitmentSource;
    private double engagementSurvival;

    private int employeeSatisfaction;

    private int specialProject;
    private Date lastPerformanceScore;
    private int daysLAteLast30;
    private int absences;

    public HumanResponseDto(int id, String employee_name, boolean married, int maritalStatus, boolean gender, int employeeStatusId, int departmentId, String departmantName, int performanceScore, boolean fromDiversityJobFair, int salary, boolean term, int positionId, String positionName, Date dob, boolean hispanicLatino, Date dateOfHire, String termReason, int managerId, String managerName, String recruitmentSource, double engagementSurvival, int employeeSatisfaction, int specialProject, Date lastPerformanceScore, int daysLAteLast30, int absences) {
        this.id = id;
        this.employee_name = employee_name;
        this.married = married;
        this.maritalStatus = maritalStatus;
        this.gender = gender;
        this.employeeStatusId = employeeStatusId;
        this.departmentId = departmentId;
        this.departmantName = departmantName;
        this.performanceScore = performanceScore;
        FromDiversityJobFair = fromDiversityJobFair;
        this.salary = salary;
        this.term = term;
        this.positionId = positionId;
        this.positionName = positionName;
        this.dob = dob;
        this.hispanicLatino = hispanicLatino;
        this.dateOfHire = dateOfHire;
        this.termReason = termReason;
        this.managerId = managerId;
        this.managerName = managerName;
        this.recruitmentSource = recruitmentSource;
        this.engagementSurvival = engagementSurvival;
        this.employeeSatisfaction = employeeSatisfaction;
        this.specialProject = specialProject;
        this.lastPerformanceScore = lastPerformanceScore;
        this.daysLAteLast30 = daysLAteLast30;
        this.absences = absences;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(int maritalStatus) {
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

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmantName() {
        return departmantName;
    }

    public void setDepartmantName(String departmantName) {
        this.departmantName = departmantName;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    public void setPerformanceScore(int performanceScore) {
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

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
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

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
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

    public int getEmployeeSatisfaction() {
        return employeeSatisfaction;
    }

    public void setEmployeeSatisfaction(int employeeSatisfaction) {
        this.employeeSatisfaction = employeeSatisfaction;
    }

    public int getSpecialProject() {
        return specialProject;
    }

    public void setSpecialProject(int specialProject) {
        this.specialProject = specialProject;
    }

    public Date getLastPerformanceScore() {
        return lastPerformanceScore;
    }

    public void setLastPerformanceScore(Date lastPerformanceScore) {
        this.lastPerformanceScore = lastPerformanceScore;
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
