package com.film.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.film.demo.beans.MsgBean;
@Repository
public interface msgRepo extends JpaRepository<MsgBean, Long>{

}
