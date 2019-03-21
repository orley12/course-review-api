package com.teamtreehouse.course;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {

    @RestResource(rel = "title_contains", path = "containsTitle")
    Page<Course> findByTitleContaining(@Param("title") String title, Pageable page);
}
