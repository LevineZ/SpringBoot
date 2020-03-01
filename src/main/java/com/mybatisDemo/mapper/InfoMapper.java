package com.mybatisDemo.mapper;

import com.mybatisDemo.entity.CallbackInfo;
import com.mybatisDemo.entity.Info;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Repository
@Service
public interface InfoMapper {

    @Insert("insert into info (smsType,smsActionType,phone,param) values(#{smsType},#{smsActionType},#{phone},#{param}) ")
    public int insertInfo(Info info);

    @Update("update info set phone=#{phone},smstype=#{smsType},smsActionType=#{smsactiontype},param=#{param} where phone=#{phone}")
    public int updateOnfo(Info info);

    @Delete("delete from info where id=#{id}")
    public int deleteStudent(int id);

    @Select("select * from t_student where id=#{id}")
    public Info getInfoById(String phone);


    @Select("select * from info")
    @Results(
            {
                    @Result(id = true, column = "id", property = "id"),
                    @Result(column = "smsType", property = "smsType"),
                    @Result(column = "smsActionType", property = "smsActionType"),
                    @Result(column = "param", property = "param"),
                    @Result(column = "phone", property = "phone"),
                    //@Result(column="age",property="age")
            }
    )
    public List<Info> getInfo();


}
