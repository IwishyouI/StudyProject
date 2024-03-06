package com.Mars.study.repository;

import com.Mars.study.HomeDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreferenceRepository extends JpaRepository<HomeDto, Long> {

}
