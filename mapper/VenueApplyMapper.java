package com.example.mapper;

import com.example.entity.VenueApply;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface VenueApplyMapper {

    int insert(VenueApply venueApply);

    void updateById(VenueApply venueApply);

    void deleteById(Integer id);

    @Select("select * from `venue_apply` where id = #{id}")
    VenueApply selectById(Integer id);

    List<VenueApply> selectAll(VenueApply venueApply);

}
