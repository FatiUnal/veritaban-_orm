package org.example.orm.builder;

import org.example.orm.dto.ObjectResponseDto;
import org.example.orm.entity.Departmant;
import org.example.orm.entity.Manager;
import org.example.orm.entity.Position;
import org.springframework.stereotype.Component;

@Component
public class ObjectBuilder {
    public ObjectResponseDto getDto(Departmant departmant){
        return new ObjectResponseDto(
                departmant.getId(),
                departmant.getName()
        );

    }

    public ObjectResponseDto getDto(Position departmant){
        return new ObjectResponseDto(
                departmant.getId(),
                departmant.getName()
        );
    }
    public ObjectResponseDto getDto(Manager departmant){
        return new ObjectResponseDto(
                departmant.getId(),
                departmant.getName()
        );
    }

}
