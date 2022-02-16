package com.ssafy.db.repository;

import com.ssafy.db.entity.WaitingList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WaitingListRepository extends JpaRepository<WaitingList, Long> {
}