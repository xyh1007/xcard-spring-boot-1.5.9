package com.xyh.game.dao2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xyh.game.model2.Card;

@Repository
public interface CardDao extends JpaRepository<Card, Long>{

}
