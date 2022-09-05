package com.gihanz.oop_concepts.Abstraction.impl;

import java.util.List;

public interface StudentService {

    Object saveStudent(Object obj);

    Object update(Object obj);

    List<Object> getAll();

    List<Object> findBy();
}
