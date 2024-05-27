package org.example.orm.builder;

import org.example.orm.dto.HumanResponseDto;
import org.example.orm.entity.Departmant;
import org.example.orm.entity.Human;
import org.example.orm.entity.Manager;
import org.example.orm.entity.Position;
import org.springframework.stereotype.Component;

@Component
public class HumanBuilder {
    public HumanResponseDto humanToHumanResponseDto(Human human, Departmant departmant, Position position, Manager manager){

        return new HumanResponseDto(
                human.getId(),
                human.getEmployee_name(),
                human.isMarried(),
                human.getEmployeeStatusId(),
                human.isGender(),
                human.getEmployeeStatusId(),
                departmant.getId(),
                departmant.getName(),
                human.getPerformanceScore().getMessage(),
                human.isFromDiversityJobFair(),
                human.getSalary(),
                human.isTerm(),
                position.getId(),
                position.getName(),
                human.getDob(),
                human.isHispanicLatino(),
                human.getDateOfHire(),
                human.getTermReason(),
                manager.getId(),
                manager.getName(),
                human.getRecruitmentSource(),
                human.getEngagementSurvival(),
                human.getEmployeeSatisfaction().getMessage(),
                human.getSpecialProject(),
                human.getLastPerformanceScore(),
                human.getDaysLAteLast30(),
                human.getAbsences()
        );
    }
}
