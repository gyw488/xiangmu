package com.example.mapper;

import com.example.entity.VenueAdmin;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface VenueAdminMapper {

    int insert(VenueAdmin venueAdmin);

    void updateById(VenueAdmin venueAdmin);

    void deleteById(Integer id);

    @Select("select * from `venue_admin` where id = #{id}")
    VenueAdmin selectById(Integer id);

    @Select("select * from `venue_admin` where username = #{username}")
    VenueAdmin selectByUsername(String username);

    List<VenueAdmin> selectAll(VenueAdmin venueAdmin);

}
