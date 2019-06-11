package com.training.graphspqr.repository;

import com.training.graphspqr.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
