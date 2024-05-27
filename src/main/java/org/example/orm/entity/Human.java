package org.example.orm.entity;

import jakarta.persistence.*;
import org.example.orm.enums.EmployeeSatisfaction;
import org.example.orm.enums.MaritalStatus;
import org.example.orm.enums.PerformanceScore;

import java.util.Date;

@Entity
public class Human {

    @Id
    @GeneratedValue
    private int id;
    private String employee_name;

    private boolean married;
    @Enumerated(EnumType.ORDINAL)
    private MaritalStatus maritalStatus;
    private boolean gender;
    private int employeeStatusId;
    @ManyToOne
    @JoinColumn(name = "departmant_id")
    private Departmant departmant;

    @Enumerated(EnumType.ORDINAL)
    private PerformanceScore performanceScore;

    private boolean FromDiversityJobFair;
    private int salary;
    private boolean term;


    @ManyToOne
    @JoinColumn(name = "position")
    private Position position;

    private Date dob;
    private boolean hispanicLatino;
    private Date dateOfHire;
    private String termReason;
    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Manager manager;

    private String recruitmentSource;
    private double engagementSurvival;
    @Enumerated(EnumType.ORDINAL)
    private EmployeeSatisfaction employeeSatisfaction;

    private int specialProject;
    private Date lastPerformanceScore;
    private int daysLAteLast30;
    private int absences;

    public Human(int id, String employee_name, boolean married, MaritalStatus maritalStatus, boolean gender, int employeeStatusId, Departmant departmant, PerformanceScore performanceScore, boolean fromDiversityJobFair, int salary, boolean term, Position position, Date dob, boolean hispanicLatino, Date dateOfHire, String termReason, Manager manager, String recruitmentSource, double engagementSurvival, EmployeeSatisfaction employeeSatisfaction, int specialProject, Date lastPerformanceScore, int daysLAteLast30, int absences) {
        this.id = id;
        this.employee_name = employee_name;
        this.married = married;
        this.maritalStatus = maritalStatus;
        this.gender = gender;
        this.employeeStatusId = employeeStatusId;
        this.departmant = departmant;
        this.performanceScore = performanceScore;
        FromDiversityJobFair = fromDiversityJobFair;
        this.salary = salary;
        this.term = term;
        this.position = position;
        this.dob = dob;
        this.hispanicLatino = hispanicLatino;
        this.dateOfHire = dateOfHire;
        this.termReason = termReason;
        this.manager = manager;
        this.recruitmentSource = recruitmentSource;
        this.engagementSurvival = engagementSurvival;
        this.employeeSatisfaction = employeeSatisfaction;
        this.specialProject = specialProject;
        this.lastPerformanceScore = lastPerformanceScore;
        this.daysLAteLast30 = daysLAteLast30;
        this.absences = absences;
    }

    public Human(String employee_name, boolean married, MaritalStatus maritalStatus, boolean gender, int employeeStatusId, Departmant departmant, PerformanceScore performanceScore, boolean fromDiversityJobFair, int salary, boolean term, Position position, Date dob, boolean hispanicLatino, Date dateOfHire, String termReason, Manager manager, String recruitmentSource, double engagementSurvival, EmployeeSatisfaction employeeSatisfaction, int specialProject, Date lastPerformanceScore, int daysLAteLast30, int absences) {
        this.employee_name = employee_name;
        this.married = married;
        this.maritalStatus = maritalStatus;
        this.gender = gender;
        this.employeeStatusId = employeeStatusId;
        this.departmant = departmant;
        this.performanceScore = performanceScore;
        this.FromDiversityJobFair = fromDiversityJobFair;
        this.salary = salary;
        this.term = term;
        this.position = position;
        this.dob = dob;
        this.hispanicLatino = hispanicLatino;
        this.dateOfHire = dateOfHire;
        this.termReason = termReason;
        this.manager = manager;
        this.recruitmentSource = recruitmentSource;
        this.engagementSurvival = engagementSurvival;
        this.employeeSatisfaction = employeeSatisfaction;
        this.specialProject = specialProject;
        this.lastPerformanceScore = lastPerformanceScore;
        this.daysLAteLast30 = daysLAteLast30;
        this.absences = absences;
    }

    public Human() {

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

    public Departmant getDepartmant() {
        return departmant;
    }

    public void setDepartmant(Departmant departmant) {
        this.departmant = departmant;
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
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

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
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
        return lastPerformanceScore;
    }

    public void setLastPerformanceScore(Date lastPerformanceScore) {
        lastPerformanceScore = lastPerformanceScore;
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
