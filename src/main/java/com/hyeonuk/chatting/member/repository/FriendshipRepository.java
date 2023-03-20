package com.hyeonuk.chatting.member.repository;

import com.hyeonuk.chatting.member.entity.Friendship;
import com.hyeonuk.chatting.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface FriendshipRepository extends JpaRepository<Friendship,Long> {
//    @Modifying
//    @Transactional
//    @Query(value = "INSERT INTO Friendship(member, friend) VALUES (:member, :friend)",nativeQuery = true)
//    void addFriend(@Param("member") Member member,@Param("friend") Member friend);
}
