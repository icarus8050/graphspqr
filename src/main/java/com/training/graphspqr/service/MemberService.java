package com.training.graphspqr.service;

import com.training.graphspqr.domain.Member;
import com.training.graphspqr.repository.MemberRepository;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@GraphQLApi
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @GraphQLQuery(name = "select")
    public Member findByIdMemberQuery(Long id) {
        return memberRepository.findById(id).orElse(null);
    }

}
