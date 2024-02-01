package com.JPAproject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JPAproject.Entity.BookDataEntity;

public interface BookDataRepo extends JpaRepository<BookDataEntity, Integer>{

}
