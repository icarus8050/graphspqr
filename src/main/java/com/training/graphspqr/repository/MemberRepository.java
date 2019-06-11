package com.training.graphspqr.repository;

import com.training.graphspqr.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
