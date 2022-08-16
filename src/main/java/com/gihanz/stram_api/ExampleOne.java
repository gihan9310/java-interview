package com.gihanz.stram_api;

/*
    Stream API ----------- >>>>>>>>>>>>
    (1) Simply put, streams are wrappers around a data source, allowing us
    to operate with that data source and making bulk processing convenient and fast.

    (2) A stream does not store data and, in that sense,
    is not a data structure. It also never modifies the underlying data source.

    (3)This functionality – java.util.stream – supports functional-style
    operations on streams of elements, such as map-reduce transformations on collections.
 */

import com.gihanz.stram_api.models.StudentDTO;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleOne {

    public static void main(String[] args) {
        List<StudentDTO> demoStudentList = StudentDTO.getDemoStudentList();
        StudentDTO[] arrayOfStudents = StudentDTO.getArray();

        /*
            We can also obtain a stream from an existing list:
            Note that Java 8 added a new stream() method to the Collection interface.
         */
        Stream<StudentDTO> stream = demoStudentList.stream();
        /*
            Stream API Methods
         */
        //(1) forEach
            //forEach() is simplest and most common operation; it loops over the stream elements

        demoStudentList.stream().forEach(e -> e.addAge(2));
//        System.out.println("demoStudentList : "+demoStudentList);
        /* (2) map map() produces a new stream after applying a function to each element of
               the original stream. The new stream could be of different type.
         */

        List<StudentDTO> collect = demoStudentList.stream().map(s -> s).collect(Collectors.toList());

        /*
           (3) collect We saw how collect() works in the previous example; its one of the common ways
            to get stuff out of the stream once we are done with all the processing
         */

        /*
            filter
                We can filter
         */
        List<StudentDTO> filterList = demoStudentList.stream().filter(s -> s.getAge()< 50 && s.getId()> 35 ).collect(Collectors.toList());
//        System.out.println("filterList : "+filterList);

        /*
            toArray
                we need to get an array out of the stream, we can simply use toArray():
         */
        StudentDTO[] studentDTOS = demoStudentList.stream().toArray(StudentDTO[]::new);
//        System.out.println("studentDTOS : "+studentDTOS.length);

        /*
            flatMap
            A stream can hold complex data structures like Stream<List<String>>. In cases like this,
             flatMap() helps us to flatten the data structure to simplify further operation
         */

        /*
            sorted
                Let’s start with the sorted() operation – this sorts the
                stream elements based on the comparator passed we pass into it.
         */

            //        List result = demoStudentList.stream().sorted(Comparator.comparingInt(StudentDTO::getId).
            //                thenComparing(StudentDTO::getId).reversed()).
            //                collect(Collectors.toList());

        /*
            Min() Max
         */

            StudentDTO studentDTO = demoStudentList.stream().max(Comparator.comparing(StudentDTO::getAge)).orElse(null);
            System.out.println("studentDTO : "+studentDTO.getAge());
            StudentDTO min = demoStudentList.stream().min(Comparator.comparing(StudentDTO::getAge)).orElse(null);
            System.out.println("min : "+min.getAge());

        /*
            distinct()
         */
        List<Integer> intList = Arrays.asList(2,1,1,1,1, 5, 3, 2, 4, 3,4,6,7,43,4,11,1,23,43,32,1,1,1,5);
        List<Integer> distinctIntList = intList.stream().distinct().collect(Collectors.toList());
//        System.out.println("distinctIntList : "+distinctIntList);

        /*
            Frequency
         */
//        HashMap<Integer, Long> map = intList.stream().collect( Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
//        System.out.println("MAP " +map);

        /*
         TOSet
            get Uniq data as set
         */
//        Set<Integer> set = intList.stream().map(i -> i).collect(Collectors.toSet());
//        System.out.println("SET : "+set);
//
//
//        List<StudentDTO> list = demoStudentList.stream().map(d -> new StudentDTO(d.getId(), d.getName(), d.getAddress(), (d.getAge()+1))).collect(Collectors.toList());
//        System.out.println("AGE 0 : "+list);

//        Stream.generate(Math::random).limit(10).forEach(res-> System.out.println(res));

        List<StudentDTO> collectX = demoStudentList.stream().sorted((o1, o2) -> o1.getAge()+"".compareToIgnoreCase(o2.getAge()+"")).collect(Collectors.toList());
//        System.out.println("collectX : "+collectX);


        StudentDTO dto = demoStudentList.stream().min(Comparator.comparingInt(StudentDTO::getAge)).orElse(null);

        System.out.println("MAX AGE : "+dto);

        demoStudentList.stream().collect(Collectors.groupingBy(d -> d.getName(), HashMap::new, Collectors.counting()));

    }
}
