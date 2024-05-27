package org.example.orm.service;

import org.example.orm.builder.HumanBuilder;
import org.example.orm.dto.HumanCreateDto;
import org.example.orm.dto.HumanResponseDto;
import org.example.orm.entity.Departmant;
import org.example.orm.entity.Human;
import org.example.orm.entity.Manager;
import org.example.orm.entity.Position;
import org.example.orm.repository.HumanRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HumanService {
    private final HumanRepository humanRepository;
    private final PositionService positionService;
    private final ManagerService managerService;
    private final  DepartmantService departmantService;
    private final HumanBuilder humanBuilder;

    public HumanService(HumanRepository humanRepository, PositionService positionService, ManagerService managerService, DepartmantService departmantService, HumanBuilder humanBuilder) {
        this.humanRepository = humanRepository;
        this.positionService = positionService;
        this.managerService = managerService;
        this.departmantService = departmantService;
        this.humanBuilder = humanBuilder;
    }

    public List<HumanResponseDto> getList() {
        return  humanRepository.findAll().stream().map(x-> {
            Departmant departmant = departmantService.findById(x.getDepartmant().getId());
            Position position = positionService.findById(x.getPosition().getId());
            Manager manager = managerService.findById(x.getManager().getId());

            return humanBuilder.humanToHumanResponseDto(x,departmant,position,manager);
        }).collect(Collectors.toList());
    }

    public HumanResponseDto create(HumanCreateDto humanCreateDto) {

        Departmant departmant = departmantService.findById(humanCreateDto.getDepartmantId());
        Position position = positionService.findById(humanCreateDto.getPositionId());
        Manager manager = managerService.findById(humanCreateDto.getManagerId());

        Human human = new Human(
                humanCreateDto.getEmployee_name(),
                humanCreateDto.isMarried(),
                humanCreateDto.getMaritalStatus(),
                humanCreateDto.isGender(),
                humanCreateDto.getEmployeeStatusId(),
                departmant,
                humanCreateDto.getPerformanceScore(),
                humanCreateDto.isFromDiversityJobFair(),
                humanCreateDto.getSalary(),
                humanCreateDto.isTerm(),
                position,
                humanCreateDto.getDob(),
                humanCreateDto.isHispanicLatino(),
                humanCreateDto.getDateOfHire(),
                humanCreateDto.getTermReason(),
                manager,
                humanCreateDto.getRecruitmentSource(),
                humanCreateDto.getEngagementSurvival(),
                humanCreateDto.getEmployeeSatisfaction(),
                humanCreateDto.getSpecialProject(),
                humanCreateDto.getLastPerformanceScore(),
                humanCreateDto.getDaysLAteLast30(),
                humanCreateDto.getAbsences()
        );


        return humanBuilder.humanToHumanResponseDto( humanRepository.save(human),departmant,position,manager);
    }

    public Human update(int id, String name) {
        return new Human();
    }

    public String delete(int id) {
        Human human = humanRepository.findById(id).orElseThrow(()->new RuntimeException());
        humanRepository.delete(human);
        return "deleted";
    }
}
