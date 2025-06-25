package com.example.mapper;

import com.example.entity.Venue;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface VenueMapper {

    int insert(Venue venue);

    void updateById(Venue venue);

    void deleteById(Integer id);

    @Select("select * from `venue` where id = #{id}")
    Venue selectById(Integer id);

    List<Venue> selectAll(Venue venue);

    @Select("select * from venue where status = '审批通过' order by num desc limit 2")
    List<Venue> selectTop2();
}
