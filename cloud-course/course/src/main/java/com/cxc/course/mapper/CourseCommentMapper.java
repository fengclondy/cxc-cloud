package com.cxc.course.mapper;

import com.cxc.course.model.CourseComment;
import com.cxc.course.model.CourseCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseCommentMapper {
    int countByExample(CourseCommentExample example);

    int deleteByExample(CourseCommentExample example);

    int deleteByPrimaryKey(Long commentId);

    int insert(CourseComment record);

    int insertSelective(CourseComment record);

    List<CourseComment> selectByExample(CourseCommentExample example);

    CourseComment selectByPrimaryKey(Long commentId);

    int updateByExampleSelective(@Param("record") CourseComment record, @Param("example") CourseCommentExample example);

    int updateByExample(@Param("record") CourseComment record, @Param("example") CourseCommentExample example);

    int updateByPrimaryKeySelective(CourseComment record);

    int updateByPrimaryKey(CourseComment record);
}